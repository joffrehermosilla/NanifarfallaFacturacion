package joffre.NanifarfallaRest.service.impl;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import joffre.NanifarfallaRest.model.ContactModel;
import joffre.NanifarfallaRest.model.Distrito;
import joffre.NanifarfallaRest.model.NewLocationToken;
import joffre.NanifarfallaRest.model.PasswordRessetToken;
//import joffre.NanifarfallaRest.model.EstadoUsuario;
import joffre.NanifarfallaRest.model.RequestUsuario;
//import joffre.NanifarfallaRest.model.TipoUsuario;
import joffre.NanifarfallaRest.model.Usuario;
import joffre.NanifarfallaRest.model.VerificationToken;
import joffre.NanifarfallaRest.repository.UsuarioRepository;
import joffre.NanifarfallaRest.service.UsuarioService;
import joffre.NanifarfallaRest.web.dto.UserDto;

@Component
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	@Override
	public Usuario getUsuario(int usuarioId) {
		return usuarioRepository.findById(usuarioId).get();

	}

	@Override
	public List<Usuario> getUsuarios() {
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario save(RequestUsuario requestUsuario) {
		Usuario usuario = new Usuario();
		usuario.setApellido_usuario(requestUsuario.getApellido_usuario());
		usuario.setNombre_usuario(requestUsuario.getNombre_usuario());
		usuario.setApellido_usuario(requestUsuario.getApellido_usuario());
		usuario.setDireccion_usuario(requestUsuario.getDireccion_usuario());
		usuario.setPassword_usuario(requestUsuario.getPassword_usuario());
		Distrito distrito = new Distrito();
		// TipoUsuario tipoUsuario = new TipoUsuario();
		// EstadoUsuario estadoUsuario = new EstadoUsuario();
		distrito.setCodigo_distrito(Integer.valueOf(requestUsuario.getDistrito()));
		//usuario.setDistrito(distrito);
		return null;
	}

	@Override
	public ObjectNode updateUsuarioEstado(int estado, int idUsuario) {
		// int result = usuarioRepository.updateEstado(estado, idUsuario);
//		boolean resultado = result == 1 ? true : false;
		ObjectNode objectNode = new ObjectMapper().createObjectNode();
//		objectNode.put("resultado", resultado);
		return objectNode;
	}

	@Override
	public ObjectNode login(String username, String password) {
		ObjectNode objectNode = new ObjectMapper().createObjectNode();
		/*
		 * if (usuarioRepository.login(username, password)) { Usuario usuario =
		 * usuarioRepository.getUsuarioLogin(username, password);
		 * objectNode.put("login", true); objectNode.set("usuario", new
		 * ObjectMapper().valueToTree(usuario)); } else { objectNode.put("login",
		 * false); }
		 */
		return objectNode;
	}

	@Override
	public Usuario addContact(ContactModel contactModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario registerNewUserAccount(UserDto accountDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario getUser(String verificationToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRegisteredUser(Usuario user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(Usuario user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createVerificationTokenForUser(Usuario user, String token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public VerificationToken getVerificationToken(String VerificationToken) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VerificationToken generateNewVerificationToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createPasswordResetTokenForUser(Usuario user, String token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PasswordRessetToken getPasswordResetToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> getUserByPasswordResetToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> getUserByID(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeUserPassword(Usuario user, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIfValidOldPassword(Usuario user, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String validateVerificationToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String generateQRUrl(Usuario user) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario updateUser2FA(boolean use2fa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getUsersFromSessionRegistry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NewLocationToken isNewLoginLocation(String username, String ip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String isValidNewLocationToken(String token) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUserLocation(Usuario user, String ip) {
		// TODO Auto-generated method stub
		
	}

}
