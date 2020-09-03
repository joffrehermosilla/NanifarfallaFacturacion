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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaMenuV1;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaMenuV1Repository;

@RestController
@RequestMapping("/apiAuditoriaMenuV1")
public class AuditoriaMenuV1Controller {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaMenuV1Controller.class);

	@Autowired
	AuditoriaMenuV1Repository auditoriaMenuV1Repository;

	@GetMapping("/AuditoriaMenuV1")
	public List<AuditoriaMenuV1> getAllAuditoriaMenuV1() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaMenuV1Repository.findAll();
	}

	@GetMapping("/AuditoriaMenuV1/{id}")
	public AuditoriaMenuV1 getAuditoriaMenuV1ById(@PathVariable(value = "id") int AuditoriaMenuV1Id) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaMenuV1Repository.findById(AuditoriaMenuV1Id)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaMenuV1", "id", AuditoriaMenuV1Id));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
