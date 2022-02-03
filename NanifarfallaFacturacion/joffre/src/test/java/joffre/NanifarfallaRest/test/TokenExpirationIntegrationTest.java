package joffre.NanifarfallaRest.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import joffre.NanifarfallaRest.model.Usuario;
import joffre.NanifarfallaRest.model.VerificationToken;
import joffre.NanifarfallaRest.repository.UsuarioRepository;
import joffre.NanifarfallaRest.repository.VerificationTokenRepository;
import joffre.NanifarfallaRest.spring.TestDbConfig;
import joffre.NanifarfallaRest.spring.TestTaskConfig;
import joffre.NanifarfallaRest.task.TokensPurgeTask;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { TestDbConfig.class, TestTaskConfig.class })
@Transactional
public class TokenExpirationIntegrationTest {

    @Autowired
    private UsuarioRepository userRepository;

    @Autowired
    private VerificationTokenRepository tokenRepository;

    @Autowired
    private TokensPurgeTask tokensPurgeTask;

    @PersistenceContext
    private EntityManager entityManager;

    private int token_id;
    private int user_id;

    //

    @Before
    public void givenUserWithExpiredToken() {

        // we need a clear token repository
        tokenRepository.deleteAll();

        Usuario user = new Usuario();
        user.setEmail(UUID.randomUUID().toString() + "@example.com");
        user.setPassword_usuario(UUID.randomUUID().toString());
        user.setNombre_usuario("First");
        user.setApellido_usuario("Last");

        entityManager.persist(user);
        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken(token, user);
        verificationToken.setExpiryDate(Date.from(Instant.now().minus(2, ChronoUnit.DAYS)));

        entityManager.persist(verificationToken);

        /*
            flush managed entities to the database to populate identifier field
         */
        entityManager.flush();

        /*
            remove managed entities from the persistence context
            so that subsequent SQL queries hit the database
         */
        entityManager.clear();

        token_id =  verificationToken.getCodigo_verificationtoken();
        user_id =  user.getCodigo_usuario();
    }

    @Test
    public void whenContextLoad_thenCorrect() {
        assertNotNull(user_id);
        assertNotNull(token_id);
        assertTrue(userRepository.findById(user_id).isPresent());

        Optional<VerificationToken> verificationToken = tokenRepository.findById(token_id);
        assertTrue(verificationToken.isPresent());
     //   assertTrue(tokenRepository.findAllByExpiryDateLessThan(Date.from(Instant.now())).anyMatch((token) -> token.equals(verificationToken.get())));
    }

    @After
    public void flushAfter() {
        entityManager.flush();
    }

    @Test
    public void whenRemoveByGeneratedQuery_thenCorrect() {
        tokenRepository.deleteByExpiryDateLessThan(Date.from(Instant.now()));
        assertEquals(0, tokenRepository.count());
    }

    @Test
    public void whenRemoveByJPQLQuery_thenCorrect() {
     //   tokenRepository.deleteAllExpiredSince(Date.from(Instant.now()));
        assertEquals(0, tokenRepository.count());
    }

    @Test
    public void whenPurgeTokenTask_thenCorrect() {
        tokensPurgeTask.purgeExpired();
        assertFalse(tokenRepository.findById(token_id).isPresent());
    }
}
