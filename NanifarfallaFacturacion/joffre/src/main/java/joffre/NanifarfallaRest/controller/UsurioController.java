package joffre.NanifarfallaRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

import joffre.NanifarfallaRest.model.Usuario;
import joffre.NanifarfallaRest.service.UsuarioService;

@RestController
@RequestMapping("/apiUsuario")
public class UsurioController {
	// private static final Log LOGGER = LogFactory.getLog(UsurioController.class);
	@Autowired
	private UsuarioService usuarioservice;

	@GetMapping("/{id}")
	public Usuario getUsuario(@PathVariable(value = "id") int usuarioId) {
		return usuarioservice.getUsuario(usuarioId);
	}

	@GetMapping("/")
	public List<Usuario> getUsuarios() {
		return usuarioservice.getUsuarios();
	}

	@PutMapping(value = "/actualizarEstado")
	public ObjectNode actualizarEstado(@RequestParam(name = "estado") int estado,
			@RequestParam(name = "id") int idUsuario) {
		return usuarioservice.updateUsuarioEstado(estado, idUsuario);
	}

	@GetMapping(value = "/login")
	public ObjectNode login(@RequestParam(name = "username") String user,
			@RequestParam(name = "password") String password) {
		return usuarioservice.login(user, password);
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
