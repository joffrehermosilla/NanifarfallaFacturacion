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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaColores;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaColoresRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaColoresController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaColoresController.class);

	@Autowired
	AuditoriaColoresRepository auditoriaColoresRepository;
	
	@GetMapping("/auditoriacolores")
	public List<AuditoriaColores> getAllAuditoriaColores() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaColoresRepository.findAll();
	}

	@GetMapping("/auditoriacolor/{id}")
	public AuditoriaColores getAuditoriaColorById(@PathVariable(value = "id") int audicolorId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaColoresRepository.findById(audicolorId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaColores", "id", audicolorId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
