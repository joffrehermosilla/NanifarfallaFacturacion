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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaPais;

import joffre.NanifarfallaRest.repository.auditorias.AuditoriaPaisRepository;

@RestController
@RequestMapping("/apiAuditoriaPais")
public class AuditoriaPaisController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaPaisController.class);

	@Autowired
	AuditoriaPaisRepository audipaisRepository;

	@GetMapping("/auditoriapaises")
	public List<AuditoriaPais> getAllAuditoriaPaises() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audipaisRepository.findAll();
	}

	@GetMapping("/auditoriapais/{id}")
	public AuditoriaPais getAuditoriaPaisById(@PathVariable(value = "id") int audipaisId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audipaisRepository.findById(audipaisId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaPais", "id", audipaisId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
