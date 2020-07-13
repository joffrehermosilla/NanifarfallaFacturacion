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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaProvincia;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaProvinciaRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaProvinciaController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaProvinciaController.class);

	@Autowired
	AuditoriaProvinciaRepository auditoriaProvinciaRepository;

	@GetMapping("/auditoriaprovincia")
	public List<AuditoriaProvincia> getAllAuditoriaProvincias() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaProvinciaRepository.findAll();
	}

	@GetMapping("/auditoriaprovincia/{id}")
	public AuditoriaProvincia getAuditoriaProvinciaById(@PathVariable(value = "id") int audiprovinciaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaProvinciaRepository.findById(audiprovinciaId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaProvincia", "id", audiprovinciaId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
