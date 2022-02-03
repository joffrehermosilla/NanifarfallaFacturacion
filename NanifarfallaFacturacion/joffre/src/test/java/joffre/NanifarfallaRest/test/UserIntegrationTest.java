package joffre.NanifarfallaRest.test;

import static org.junit.Assert.assertTrue;



import joffre.NanifarfallaRest.config.SecurityConfiguration;
import joffre.NanifarfallaRest.model.Usuario;
import joffre.NanifarfallaRest.model.VerificationToken;
import joffre.NanifarfallaRest.repository.UsuarioRepository;
import joffre.NanifarfallaRest.repository.VerificationTokenRepository;

import joffre.NanifarfallaRest.spring.ServiceConfig;
import joffre.NanifarfallaRest.spring.TestDbConfig;
import joffre.NanifarfallaRest.spring.TestIntegrationConfig;
import joffre.NanifarfallaRest.validation.EmailExistsException;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { TestDbConfig.class, ServiceConfig.class, TestIntegrationConfig.class, SecurityConfiguration.class})
@Transactional
public class UserIntegrationTest {

    @Autowired
    private VerificationTokenRepository tokenRepository;

    @Autowired
    private UsuarioRepository userRepository;

    @PersistenceContext
    private EntityManager entityManager;

    private int tokenId;
    private int userId;

    //

    @Before
    public void givenUserAndVerificationToken() throws EmailExistsException {
        Usuario user = new Usuario();
        user.setEmail("test@example.com");
        user.setPassword_usuario("SecretPassword");
        user.setNombre_usuario("First");
        user.setApellido_usuario("Last");
        entityManager.persist(user);

        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken(token, user);
        entityManager.persist(verificationToken);

        entityManager.flush();
        entityManager.clear();

        tokenId =  verificationToken.getCodigo_verificationtoken();
        userId =  user.getCodigo_usuario();
    }

    @After
    public void flushAfter() {
        entityManager.flush();
        entityManager.clear();
    }

    //

    @Test
    public void whenContextLoad_thenCorrect() {
        assertTrue(userRepository.count() > 0);
        assertTrue(tokenRepository.count() > 0);
    }

    // @Test(expected = Exception.class)
    @Test
    @Ignore("needs to go through the service and get transactional semantics")
    public void whenRemovingUser_thenFkViolationException() {
      //  userRepository.deleteById(userId);
    }

    @Test
    public void whenRemovingTokenThenUser_thenCorrect() {
        tokenRepository.deleteById(tokenId);
     //   userRepository.deleteById(userId);
    }

}
