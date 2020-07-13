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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoCliente;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaEstadoClienteRepository;

@RestController
@RequestMapping("/apiAuditoriaEstadoCliente")
public class AuditoriaEstadoClienteController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaEstadoClienteController.class);
	@Autowired
	AuditoriaEstadoClienteRepository auditoriaEstadoClienteRepository;

	@GetMapping("/auditoriaestadoclientes")
	public List<AuditoriaEstadoCliente> getAllAuditoriaEstadoClientes() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaEstadoClienteRepository.findAll();
	}

	@GetMapping("/auditoriaestadocliente/{id}")
	public AuditoriaEstadoCliente getAuditoriaEstadoClienteById(@PathVariable(value = "id") int audiestadoclienteId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaEstadoClienteRepository.findById(audiestadoclienteId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaEstadoCliente", "id", audiestadoclienteId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
