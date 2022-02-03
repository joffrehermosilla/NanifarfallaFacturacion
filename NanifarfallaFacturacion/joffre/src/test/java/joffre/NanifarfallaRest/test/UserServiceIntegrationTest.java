package joffre.NanifarfallaRest.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import joffre.NanifarfallaRest.model.Role;
import joffre.NanifarfallaRest.model.Usuario;
import joffre.NanifarfallaRest.model.VerificationToken;
import joffre.NanifarfallaRest.repository.RoleRepository;
import joffre.NanifarfallaRest.repository.UsuarioRepository;
import joffre.NanifarfallaRest.repository.VerificationTokenRepository;
import joffre.NanifarfallaRest.service.UsuarioService;
import joffre.NanifarfallaRest.service.impl.UsuarioServiceImpl;
import joffre.NanifarfallaRest.spring.LoginNotificationConfig;
import joffre.NanifarfallaRest.spring.ServiceConfig;
import joffre.NanifarfallaRest.spring.TestDbConfig;
import joffre.NanifarfallaRest.spring.TestIntegrationConfig;
import joffre.NanifarfallaRest.validation.EmailExistsException;
import joffre.NanifarfallaRest.web.dto.UserDto;
import joffre.NanifarfallaRest.web.error.UserAlreadyExistException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { TestDbConfig.class, ServiceConfig.class, TestIntegrationConfig.class, LoginNotificationConfig.class})
public class UserServiceIntegrationTest {

    @Autowired
    private UsuarioService userService;

    @Autowired
    private UsuarioRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private VerificationTokenRepository tokenRepository;

    @Test
    public void givenNewUser_whenRegistered_thenCorrect() throws EmailExistsException {
        final String userEmail = UUID.randomUUID().toString();
        final UserDto userDto = createUserDto(userEmail);

        final Usuario user = userService.registerNewUserAccount(userDto);

        assertNotNull(user);
        assertNotNull(user.getEmail());
        assertEquals(userEmail, user.getEmail());
        assertNotNull(user.getCodigo_usuario());
    }

    @Test
    public void givenDetachedUser_whenAccessingEntityAssociations_thenCorrect() {
        Role role = roleRepository.findByName("ROLE_USER");
        if (role == null) {
            roleRepository.saveAndFlush(new Role("ROLE_USER"));
        }

        // detached entity
        final Usuario user = registerUser();

        // only roles are eagerly fetched
        assertNotNull(user.getRoles());

        List<String> roles = user.getRoles().stream().map(Role::getName).collect(Collectors.toList());
        assertEquals(1, roles.size());
        assertEquals("ROLE_USER", roles.iterator().next());
    }

    @Test
    public void givenDetachedUser_whenServiceLoadById_thenCorrect() throws EmailExistsException {
        final Usuario user = registerUser();
        final Usuario user2 = userService.getUserByID(user.getCodigo_usuario()).get();
        assertEquals(user, user2);
    }

    @Test
    public void givenDetachedUser_whenServiceLoadByEmail_thenCorrect() throws EmailExistsException {
        final Usuario user = registerUser();
        final Usuario user2 = userService.findUserByEmail(user.getEmail());
        assertEquals(user, user2);
    }

    @Test(expected = UserAlreadyExistException.class)
    public void givenUserRegistered_whenDuplicatedRegister_thenCorrect() {
        final String email = UUID.randomUUID().toString();
        final UserDto userDto = createUserDto(email);

        userService.registerNewUserAccount(userDto);
        userService.registerNewUserAccount(userDto);
    }

    @Transactional
    public void givenUserRegistered_whenDtoRoleAdmin_thenUserNotAdmin() {
        assertNotNull(roleRepository);
        final UserDto userDto = new UserDto();
        userDto.setEmail(UUID.randomUUID().toString());
        userDto.setPassword("SecretPassword");
        userDto.setMatchingPassword("SecretPassword");
        userDto.setFirstName("First");
        userDto.setLastName("Last");
        assertNotNull(roleRepository.findByName("ROLE_ADMIN"));
        final Long adminRoleId = (long) roleRepository.findByName("ROLE_ADMIN").getCodigo_role();
        assertNotNull(adminRoleId);
        userDto.setRole(adminRoleId.intValue());
        final Usuario user = userService.registerNewUserAccount(userDto);
        assertFalse(user.getRoles().stream().map(Role::getCodigo_role).anyMatch(ur -> ur.equals(adminRoleId)));
    }

    @Test
    public void givenUserRegistered_whenCreateToken_thenCorrect() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
    }

    @Test
    public void givenUserRegistered_whenCreateTokenCreateDuplicate_thenCorrect() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        userService.createVerificationTokenForUser(user, token);
    }

    @Test
    public void givenUserAndToken_whenLoadToken_thenCorrect() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        final VerificationToken verificationToken = userService.getVerificationToken(token);
        assertNotNull(verificationToken);
        assertNotNull(verificationToken.getCodigo_verificationtoken());
        assertNotNull(verificationToken.getmUsuario());
        assertEquals(user, verificationToken.getmUsuario());
        assertEquals(user.getCodigo_usuario(), verificationToken.getmUsuario().getCodigo_usuario());
        assertEquals(token, verificationToken.getToken());
        assertTrue(verificationToken.getExpiryDate().toInstant().isAfter(Instant.now()));
    }

    @Test
    public void givenUserAndToken_whenRemovingUser_thenCorrect() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        userService.deleteUser(user);
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void givenUserAndToken_whenRemovingUserByDao_thenFKViolation() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        final long userId = user.getCodigo_usuario();
        userService.getVerificationToken(token).getCodigo_verificationtoken();
       // userRepository.deleteById(userId);
    }

    @Test
    public void givenUserAndToken_whenRemovingTokenThenUser_thenCorrect() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        final long userId = user.getCodigo_usuario();
        final int tokenId = userService.getVerificationToken(token).getCodigo_verificationtoken();
        tokenRepository.deleteById(tokenId);
     //   userRepository.deleteById(userId);
    }

    @Test
    public void givenUserAndToken_whenRemovingToken_thenCorrect() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        final int tokenId = userService.getVerificationToken(token).getCodigo_verificationtoken();
        tokenRepository.deleteById(tokenId);
    }

    @Test
    public void givenUserAndToken_whenNewTokenRequest_thenCorrect() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        final VerificationToken origToken = userService.getVerificationToken(token);
        final VerificationToken newToken = userService.generateNewVerificationToken(token);
        assertNotEquals(newToken.getToken(), origToken.getToken());
        assertNotEquals(newToken.getExpiryDate(), origToken.getExpiryDate());
        assertNotEquals(newToken, origToken);
    }

    @Test
    public void givenTokenValidation_whenValid_thenUserEnabled_andTokenRemoved() {
        Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        final long userId = user.getCodigo_usuario();
        final String token_status = userService.validateVerificationToken(token);
        Assert.assertEquals(token_status, UsuarioServiceImpl.TOKEN_VALID);
        user = userService.getUserByID(userId).get();
        assertTrue(user.isEnabled());
    }

    @Test
    public void givenTokenValidation_whenInvalid_thenCorrect() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        final String invalid_token = "INVALID_" + UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        userService.getVerificationToken(token).getCodigo_verificationtoken();
        final String token_status = userService.validateVerificationToken(invalid_token);
        token_status.equals(UsuarioServiceImpl.TOKEN_INVALID);
    }

    @Test
    public void givenTokenValidation_whenExpired_thenCorrect() {
        final Usuario user = registerUser();
        final String token = UUID.randomUUID().toString();
        userService.createVerificationTokenForUser(user, token);
        user.getCodigo_usuario();
        final VerificationToken verificationToken = userService.getVerificationToken(token);
        verificationToken.setExpiryDate(Date.from(verificationToken.getExpiryDate().toInstant().minus(2, ChronoUnit.DAYS)));
        tokenRepository.saveAndFlush(verificationToken);
        final String token_status = userService.validateVerificationToken(token);
        assertNotNull(token_status);
        token_status.equals(UsuarioServiceImpl.TOKEN_EXPIRED);
    }

    //

    private UserDto createUserDto(final String email) {
        final UserDto userDto = new UserDto();
        userDto.setEmail(email);
        userDto.setPassword("SecretPassword");
        userDto.setMatchingPassword("SecretPassword");
        userDto.setFirstName("First");
        userDto.setLastName("Last");
        userDto.setRole(0);
        return userDto;
    }

    private Usuario registerUser() {
        final String email = UUID.randomUUID().toString();
        final UserDto userDto = createUserDto(email);
        final Usuario user = userService.registerNewUserAccount(userDto);
        assertNotNull(user);
        assertNotNull(user.getCodigo_usuario());
        assertEquals(email, user.getEmail());
        return user;
    }

}
