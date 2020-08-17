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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaUserAlertas;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaUserAlertasRepository;

@RestController
@RequestMapping("/apiAuditoriaUserAlerta")
public class AuditoriaUserAlertasController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaUserAlertasController.class);

	@Autowired
	AuditoriaUserAlertasRepository auditoriaUserAlertasRepository;

	@GetMapping("/AuditoriaUserAlertas")
	public List<AuditoriaUserAlertas> getAllAuditoriaUserAlertas() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaUserAlertasRepository.findAll();
	}

	@GetMapping("/auditoriaarea/{id}")
	public AuditoriaUserAlertas getAuditoriaUserAlertasById(@PathVariable(value = "id") int AuditoriaUserAlertasId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaUserAlertasRepository.findById(AuditoriaUserAlertasId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaUserAlertas", "id", AuditoriaUserAlertasId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
