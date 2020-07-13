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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaPrivilege;

import joffre.NanifarfallaRest.repository.auditorias.AuditoriaPrivilegeRepository;

@RestController
@RequestMapping("/apiAuditoriaPrivileges")
public class AuditoriaPrivilegesController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaPrivilegesController.class);

	@Autowired
	AuditoriaPrivilegeRepository audiprivilegeRepository;

	@GetMapping("/auditoriaprivileges")
	public List<AuditoriaPrivilege> getAllAuditoriaPrivileges() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audiprivilegeRepository.findAll();
	}

	@GetMapping("/auditoriaprivilege/{id}")
	public AuditoriaPrivilege getAuditoriaPrivilegeById(@PathVariable(value = "id") int audiprivilegeId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audiprivilegeRepository.findById(audiprivilegeId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaPrivilege", "id", audiprivilegeId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
