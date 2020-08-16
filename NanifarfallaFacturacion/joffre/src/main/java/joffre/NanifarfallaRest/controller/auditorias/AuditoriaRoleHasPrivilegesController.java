package joffre.NanifarfallaRest.controller.auditorias;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
import joffre.NanifarfallaRest.model.auditorias.AuditoriaRoleHasPrivileges;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaRoleHasPrivilegesRepository;

public class AuditoriaRoleHasPrivilegesController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaRoleHasPrivilegesController.class);

	@Autowired
	AuditoriaRoleHasPrivilegesRepository auditoriaRoleHasPrivilegesRepository;

	@GetMapping("/AuditoriaRoleHasPrivileges")
	public List<AuditoriaRoleHasPrivileges> getAllAuditoriaRoleHasPrivileges() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaRoleHasPrivilegesRepository.findAll();
	}

	@GetMapping("/auditoriaarea/{id}")
	public AuditoriaRoleHasPrivileges getAuditoriaRoleHasPrivilegesById(@PathVariable(value = "id") int AuditoriaRoleHasPrivilegesId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaRoleHasPrivilegesRepository.findById(AuditoriaRoleHasPrivilegesId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaRoleHasPrivileges", "id", AuditoriaRoleHasPrivilegesId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
