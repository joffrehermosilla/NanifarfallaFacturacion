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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaCiudad;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaCiudadRepository;

@RestController
@RequestMapping("/apiAuditoriaCiudad")
public class AuditoriaCiudadController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaCiudadController.class);

	@Autowired
	AuditoriaCiudadRepository auditoriaCiudadRepository;

	@GetMapping("/auditoriaciudades")
	public List<AuditoriaCiudad> getAllAuditoriaCiudades() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaCiudadRepository.findAll();
	}

	@GetMapping("/auditoriaciudad/{id}")
	public AuditoriaCiudad getAuditoriaCiudadById(@PathVariable(value = "id") int audiciudadId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaCiudadRepository.findById(audiciudadId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaCiudad", "id", audiciudadId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
