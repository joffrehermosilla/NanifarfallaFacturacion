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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaMenuRoles;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaMenuRolesRepository;

@RestController
@RequestMapping("/apiAuditoriaMenuRoles")
public class AuditoriaMenuRolesController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaMenuRolesController.class);

	@Autowired
	AuditoriaMenuRolesRepository auditoriaMenuRolesRepository;

	@GetMapping("/auditoriaareas")
	public List<AuditoriaMenuRoles> getAllAuditoriaMenuRoles() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaMenuRolesRepository.findAll();
	}

	@GetMapping("/auditoriaarea/{id}")
	public AuditoriaMenuRoles getAuditoriaMenuRolesById(@PathVariable(value = "id") int auditoriaMenuRolesId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaMenuRolesRepository.findById(auditoriaMenuRolesId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaMenuRoles", "id", auditoriaMenuRolesId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
