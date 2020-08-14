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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaUserRole;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaUserRoleRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaUserRoleController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaUserRoleController.class);

	@Autowired
	AuditoriaUserRoleRepository auditoriaUserRoleRepository;

	@GetMapping("/AuditoriaUserRole")
	public List<AuditoriaUserRole> getAllAuditoriaUserRole() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaUserRoleRepository.findAll();
	}

	@GetMapping("/AuditoriaUserRole/{id}")
	public AuditoriaUserRole getAuditoriaUserRoleById(@PathVariable(value = "id") int aAuditoriaUserRoleId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaUserRoleRepository.findById(aAuditoriaUserRoleId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaUserRole", "id", aAuditoriaUserRoleId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
