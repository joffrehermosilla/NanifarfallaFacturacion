package joffre.NanifarfallaRest.service;

import java.util.List;


import com.fasterxml.jackson.databind.node.ObjectNode;

import joffre.NanifarfallaRest.model.ContactModel;
import joffre.NanifarfallaRest.model.NewLocationToken;
import joffre.NanifarfallaRest.model.PasswordRessetToken;
import joffre.NanifarfallaRest.model.RequestUsuario;
import joffre.NanifarfallaRest.model.Usuario;
import joffre.NanifarfallaRest.model.VerificationToken;
import joffre.NanifarfallaRest.web.dto.UserDto;

import java.io.UnsupportedEncodingException;

import java.util.Optional;


public interface UsuarioService {
 public Usuario getUsuario(int usuarioId);
	 
	 public List<Usuario> getUsuarios();
	 
	 public Usuario save(RequestUsuario usuario);
	 
	 public ObjectNode updateUsuarioEstado(int estado, int idUsuario);
	 
	 public ObjectNode login(String username, String password);
	 
	 public abstract Usuario addContact(ContactModel contactModel);
	 
	 Usuario registerNewUserAccount(UserDto accountDto);

	    Usuario getUser(String verificationToken);

	    void saveRegisteredUser(Usuario user);

	    void deleteUser(Usuario user);

	    void createVerificationTokenForUser(Usuario user, String token);

	    VerificationToken getVerificationToken(String VerificationToken);

	    VerificationToken generateNewVerificationToken(String token);

	    void createPasswordResetTokenForUser(Usuario user, String token);

	    Usuario findUserByEmail(String email);

	    PasswordRessetToken getPasswordResetToken(String token);

	    Optional<Usuario> getUserByPasswordResetToken(String token);

	    Optional<Usuario> getUserByID(long id);

	    void changeUserPassword(Usuario user, String password);

	    boolean checkIfValidOldPassword(Usuario user, String password);

	    String validateVerificationToken(String token);

	    String generateQRUrl(Usuario user) throws UnsupportedEncodingException;

	    Usuario updateUser2FA(boolean use2FA);

	    List<String> getUsersFromSessionRegistry();

	    NewLocationToken isNewLoginLocation(String username, String ip);

	    String isValidNewLocationToken(String token);

	    void addUserLocation(Usuario user, String ip); 
	    








	 
}
