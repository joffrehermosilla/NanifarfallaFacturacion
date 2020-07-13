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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaRegimenCliente;

import joffre.NanifarfallaRest.repository.auditorias.AuditoriaRegimenClienteRepository;

@RestController
@RequestMapping("/apiAuditoriaRegimenCliente")
public class AuditoriaRegimenClienteController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaRegimenClienteController.class);

	@Autowired
	AuditoriaRegimenClienteRepository auditoriaRegimenClienteRepository;
	
	@GetMapping("/auditoriaRegimenCliente")
	public List<AuditoriaRegimenCliente> getAllAuditoriaRegimenCliente() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaRegimenClienteRepository.findAll();
	}

	@GetMapping("/auditoriaRegimenCliente/{id}")
	public AuditoriaRegimenCliente getAuditoriaRegimenClienteById(@PathVariable(value = "id") int audiregimenclienteId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaRegimenClienteRepository.findById(audiregimenclienteId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaRegimenCliente", "id", audiregimenclienteId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
