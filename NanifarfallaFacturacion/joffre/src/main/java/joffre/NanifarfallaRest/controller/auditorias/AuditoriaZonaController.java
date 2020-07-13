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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaZona;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaZonaRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaZonaController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaZonaController.class);

	@Autowired
	AuditoriaZonaRepository auditoriaZonaRepository;
	
	@GetMapping("/auditoriazonas")
	public List<AuditoriaZona> getAllAuditoriaZona() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaZonaRepository.findAll();
	}

	@GetMapping("/auditoriazona/{id}")
	public AuditoriaZona getAuditoriaZonaById(@PathVariable(value = "id") int audizonaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaZonaRepository.findById(audizonaId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaZona", "id", audizonaId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
}
