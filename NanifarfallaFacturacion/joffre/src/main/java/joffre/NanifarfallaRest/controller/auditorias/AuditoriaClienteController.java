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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaCliente;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaClienteRepository;
@RestController
@RequestMapping("/apiAuditoriaCliente")
public class AuditoriaClienteController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaClienteController.class);

	@Autowired
	AuditoriaClienteRepository auditoriaClienteRepository;
	
	@GetMapping("/auditoriaClientess")
	public List<AuditoriaCliente> getAllAuditoriaCliente() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaClienteRepository.findAll();
	}

	@GetMapping("/auditoriaarea/{id}")
	public AuditoriaCliente getAuditoriaClienteById(@PathVariable(value = "id") int AuditoriaClienteId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaClienteRepository.findById(AuditoriaClienteId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaCliente", "id", AuditoriaClienteId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

	
}
