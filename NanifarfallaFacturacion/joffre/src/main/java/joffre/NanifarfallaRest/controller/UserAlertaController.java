package joffre.NanifarfallaRest.controller;

import java.util.List;

import javax.validation.Valid;

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

import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
import joffre.NanifarfallaRest.model.UserAlerta;
import joffre.NanifarfallaRest.repository.UserAlertaRepository;

@RestController
@RequestMapping("/apiUserAlerta")
public class UserAlertaController {
	private static final Log LOGGER = LogFactory.getLog(UserAlertaController.class);
	@Autowired
	UserAlertaRepository userAlertaRepository;

	@GetMapping("/areas")
	public List<UserAlerta> getAllUserAlerta() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return userAlertaRepository.findAll();
	}

	@PostMapping("/AdduserAlerta")
	public UserAlerta createUserAlerta(@Valid @RequestBody UserAlerta useralerta) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return userAlertaRepository.save(useralerta);
	}

	@GetMapping("/useralerta/{id}")
	public UserAlerta getUserAlertaById(@PathVariable(value = "id") int useralertaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return userAlertaRepository.findById(useralertaId)
				.orElseThrow(() -> new ResourceNotFoundException("UserAlerta", "id", useralertaId));
	}

	@PutMapping("/useralertas/{id}")
	public UserAlerta updateUserAlerta(@PathVariable(value = "id") int useralertaId,
			@Valid @RequestBody UserAlerta useralertaDetails) {

		UserAlerta useralerta = userAlertaRepository.findById(useralertaId)
				.orElseThrow(() -> new ResourceNotFoundException("UserAlerta", "id", useralertaId));

		useralerta.setContratos(useralertaDetails.getContratos());
		useralerta.setFecha_fin(useralertaDetails.getFecha_fin());
		useralerta.setFecha_inicio(useralertaDetails.getFecha_inicio());
		useralerta.setmAlerta(useralertaDetails.getmAlerta());
		useralerta.setmTipoAlerta(useralertaDetails.getmTipoAlerta());
		useralerta.setmUsuario(useralertaDetails.getmUsuario());
		useralerta.setPrecio(useralertaDetails.getPrecio());
		useralerta.setVersion(useralertaDetails.getVersion());

		UserAlerta updatedUserAlerta = userAlertaRepository.save(useralerta);
		LOGGER.info("METHOD: 'updateUserAlerta'--PARAMS: '" + useralertaDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedUserAlerta;
	}

	@DeleteMapping("/useralerta/{id}")
	public ResponseEntity<?> deleteArea(@PathVariable(value = "id") int useralertaId) {
		UserAlerta useralerta = userAlertaRepository.findById(useralertaId)
				.orElseThrow(() -> new ResourceNotFoundException("UserAlerta", "id", useralertaId));

		userAlertaRepository.delete(useralerta);
		LOGGER.info("METHOD: 'deleteUserAlerta'--PARAMS: '" + useralerta + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
