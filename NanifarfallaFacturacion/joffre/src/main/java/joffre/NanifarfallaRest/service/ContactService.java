package joffre.NanifarfallaRest.service;

import java.util.List;

import joffre.NanifarfallaRest.model.ContactModel;
import joffre.NanifarfallaRest.model.Usuario;

public interface ContactService {

	public abstract ContactModel addContact(ContactModel contactModel);

	public abstract List<ContactModel> listAllContacts();
	
	 public abstract Usuario getUsuario(int usuarioId);
	
	public abstract void removeContact( int id);
	
	public abstract ContactModel getUsuarioModel(int usuarioId);
}
