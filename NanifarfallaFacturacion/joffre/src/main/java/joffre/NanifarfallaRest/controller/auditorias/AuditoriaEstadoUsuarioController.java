package joffre.NanifarfallaRest.controller.auditorias;


import java.util.List;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoUsuario;

import joffre.NanifarfallaRest.repository.auditorias.AuditoriaEstadoUsuarioRepository;


@RestController
@RequestMapping("/apiAuditoriaEstadoUsuario")
public class AuditoriaEstadoUsuarioController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaEstadoUsuarioController.class);

	@Autowired
	AuditoriaEstadoUsuarioRepository audiestadoUsuarioRepository;

	@GetMapping("/auditoriestadousuarios")
	public List<AuditoriaEstadoUsuario> getAllAuditoriaEstadoUsuarios() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audiestadoUsuarioRepository.findAll();
	}

	@GetMapping("/auditoriaestadousuario/{id}")
	public AuditoriaEstadoUsuario getAuditoriaEstadoUsuarioById(@PathVariable(value = "id") int audiestadousuarioId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audiestadoUsuarioRepository.findById(audiestadousuarioId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaEstadoUsuario", "id", audiestadousuarioId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
