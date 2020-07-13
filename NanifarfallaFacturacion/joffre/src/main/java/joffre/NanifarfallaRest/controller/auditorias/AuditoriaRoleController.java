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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaRole;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaRoleRepository;

@RestController
@RequestMapping("/apiAuditoriaRole")
public class AuditoriaRoleController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaRoleController.class);

	@Autowired
	AuditoriaRoleRepository auditoriaRoleRepository;
	

	@GetMapping("/auditoriaroles")
	public List<AuditoriaRole> getAllAuditoriaRoles() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaRoleRepository.findAll();
	}

	@GetMapping("/auditoriarole/{id}")
	public AuditoriaRole getAuditoriaRoleById(@PathVariable(value = "id") int audiroleId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaRoleRepository.findById(audiroleId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaRole", "id", audiroleId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
}
