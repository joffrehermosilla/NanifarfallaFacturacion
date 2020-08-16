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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaCatalogo;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaCatalogoRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaCatalogoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaCatalogoController.class);

	@Autowired
	AuditoriaCatalogoRepository auditoriaCatalogoRepository;

	@GetMapping("/auditoriaCatologo")
	public List<AuditoriaCatalogo> getAllAuditoriaCatalogo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaCatalogoRepository.findAll();
	}

	@GetMapping("/auditoriaCatalogo/{id}")
	public AuditoriaCatalogo getAuditoriaCatalogoById(@PathVariable(value = "id") int audicatalogoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaCatalogoRepository.findById(audicatalogoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaCatalogo", "id", audicatalogoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
