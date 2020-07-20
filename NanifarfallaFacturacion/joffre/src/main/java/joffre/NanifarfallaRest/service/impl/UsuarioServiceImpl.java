package joffre.NanifarfallaRest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import joffre.NanifarfallaRest.model.ContactModel;
import joffre.NanifarfallaRest.model.Distrito;
//import joffre.NanifarfallaRest.model.EstadoUsuario;
import joffre.NanifarfallaRest.model.RequestUsuario;
//import joffre.NanifarfallaRest.model.TipoUsuario;
import joffre.NanifarfallaRest.model.Usuario;
import joffre.NanifarfallaRest.repository.UsuarioRepository;
import joffre.NanifarfallaRest.service.UsuarioService;

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
		usuario.setDistrito(distrito);
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
		if (usuarioRepository.login(username, password)) {
			Usuario usuario = usuarioRepository.getUsuarioLogin(username, password);
			objectNode.put("login", true);
			objectNode.set("usuario", new ObjectMapper().valueToTree(usuario));
		} else {
			objectNode.put("login", false);
		}
		return objectNode;
	}

	@Override
	public Usuario addContact(ContactModel contactModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
