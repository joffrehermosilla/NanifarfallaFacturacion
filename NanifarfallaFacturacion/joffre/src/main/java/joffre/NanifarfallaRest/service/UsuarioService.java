package joffre.NanifarfallaRest.service;

import java.util.List;

import com.fasterxml.jackson.databind.node.ObjectNode;

import joffre.NanifarfallaRest.model.ContactModel;
import joffre.NanifarfallaRest.model.RequestUsuario;
import joffre.NanifarfallaRest.model.Usuario;

public interface UsuarioService {
 public Usuario getUsuario(int usuarioId);
	 
	 public List<Usuario> getUsuarios();
	 
	 public Usuario save(RequestUsuario usuario);
	 
	 public ObjectNode updateUsuarioEstado(int estado, int idUsuario);
	 
	 public ObjectNode login(String username, String password);
	 
	 public abstract Usuario addContact(ContactModel contactModel);
}
