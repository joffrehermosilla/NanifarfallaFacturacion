package joffre.NanifarfallaRest.controller;

import javax.validation.Valid;
import java.util.List;
import joffre.NanifarfallaRest.exception.ResourceNotFoundException;

import joffre.NanifarfallaRest.model.Usuario;
import joffre.NanifarfallaRest.repository.UsuarioRepository;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiUsuariox")
public class UsuarioxController {
	private static final Log LOGGER = LogFactory.getLog(UsuarioxController.class);
	@Autowired
	UsuarioRepository Usuarioxrepository;

	@GetMapping("/detallesUsuariox")
	public List<Usuario> getAllUsuariox() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return Usuarioxrepository.findAll();
	}

	@PostMapping("/AddUsuariox")
	public Usuario createUsuariox(@Valid @RequestBody Usuario usuariox) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return Usuarioxrepository.save(usuariox);
	}

	@GetMapping("/Usuariox/{id}")
	public Usuario getUsuarioxById(@PathVariable(value = "id") int usuarioxId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return Usuarioxrepository.findById(usuarioxId)
				.orElseThrow(() -> new ResourceNotFoundException("Usuario", "id", usuarioxId));
	}

	@PutMapping("/Usuariox/{id}")
	public Usuario updateUsuariox(@PathVariable(value = "id") int usuarioxId,
			@Valid @RequestBody Usuario usuarioxDetails) {

		Usuario usuariox = Usuarioxrepository.findById(usuarioxId)
				.orElseThrow(() -> new ResourceNotFoundException("Usuario", "id", usuarioxId));

		usuariox.setNombre_usuario(usuarioxDetails.getNombre_usuario());
		usuariox.setApellido_usuario(usuarioxDetails.getApellido_usuario());

		usuariox.setDireccion_usuario(usuarioxDetails.getDireccion_usuario());
		usuariox.setNombre_logeo_usuario(usuarioxDetails.getNombre_logeo_usuario());
		usuariox.setPassword_usuario(usuarioxDetails.getPassword_usuario());


	
		usuariox.setClaveApi(usuarioxDetails.getClaveApi());
		usuariox.setCliente(usuarioxDetails.getCliente());
		usuariox.setPasswordResetTokens(usuarioxDetails.getPasswordResetTokens());
		usuariox.setUseranuncios(usuarioxDetails.getUseranuncios());
		usuariox.setVendedor(usuarioxDetails.getVendedor());
		usuariox.setCliente_tiene_pedido(usuarioxDetails.getCliente_tiene_pedido());

		usuariox.setUseranuncios(usuarioxDetails.getUseranuncios());
		usuariox.setVerificationToken(usuarioxDetails.getVerificationToken());
		usuariox.setContratos(usuarioxDetails.getContratos());
		usuariox.setUseralertas(usuarioxDetails.getUseralertas());
		usuariox.setGenero(usuarioxDetails.getGenero());
		usuariox.setEmail(usuarioxDetails.getEmail());

		Usuario updatedUsuariox = Usuarioxrepository.save(usuariox);

		LOGGER.info("METHOD: 'updateUsuariox'--PARAMS: '" + usuarioxDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedUsuariox;
	}

	@DeleteMapping("/Usuariox/{id}")
	public ResponseEntity<?> deleteUsuariox(@PathVariable(value = "id") int usuarioxId) {
		Usuario usuariox = Usuarioxrepository.findById(usuarioxId)
				.orElseThrow(() -> new ResourceNotFoundException("Usuario", "id", usuarioxId));

		Usuarioxrepository.delete(usuariox);
		LOGGER.info("METHOD: 'deleteUsuariox'--PARAMS: '" + usuariox + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
