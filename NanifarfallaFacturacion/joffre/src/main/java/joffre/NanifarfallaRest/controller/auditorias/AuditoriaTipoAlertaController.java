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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoAlerta;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaTipoAlertaRepository;

@RestController
@RequestMapping("/apiAuditoriaTipoAlerta")
public class AuditoriaTipoAlertaController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaTipoAlertaController.class);

	@Autowired
	AuditoriaTipoAlertaRepository auditoriaTipoAlertaRepository;
	
	@GetMapping("/auditoriaTipoAlerta")
	public List<AuditoriaTipoAlerta> getAllAuditoriaTipoAlerta() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaTipoAlertaRepository.findAll();
	}

	@GetMapping("/auditoriatipoalerta/{id}")
	public AuditoriaTipoAlerta getAuditoriaTipoAlertaById(@PathVariable(value = "id") int tipoalertaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaTipoAlertaRepository.findById(tipoalertaId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaTipoAlerta", "id", tipoalertaId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
