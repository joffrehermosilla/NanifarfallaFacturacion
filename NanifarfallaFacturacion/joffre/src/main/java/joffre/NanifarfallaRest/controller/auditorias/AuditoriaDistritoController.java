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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaDistrito;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaDistritoRepository;

@RestController
@RequestMapping("/apiAuditoriaDistrito")
public class AuditoriaDistritoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaDistritoController.class);

	@Autowired
	AuditoriaDistritoRepository auditoriaDistritoRepository;

	@GetMapping("/auditoriaareas")
	public List<AuditoriaDistrito> getAllAuditoriaDistritos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaDistritoRepository.findAll();
	}

	@GetMapping("/auditoriadistrito/{id}")
	public AuditoriaDistrito getAuditoriaDistritoById(@PathVariable(value = "id") int audidistritoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaDistritoRepository.findById(audidistritoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaDistrito", "id", audidistritoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
