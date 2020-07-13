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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoImpuesto;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaTipoImpuestoRepository;

@RestController
@RequestMapping("/apiAuditoriaTipoImpuesto")
public class AuditoriaTipoImpuestoController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaTipoImpuestoController.class);

	@Autowired
	AuditoriaTipoImpuestoRepository auditoriaTipoImpuestoRepository;
	
	@GetMapping("/auditoriatipoImpuesto")
	public List<AuditoriaTipoImpuesto> getAllAuditoriaTipoImpuesto() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaTipoImpuestoRepository.findAll();
	}

	@GetMapping("/auditoriatipoImpuesto/{id}")
	public AuditoriaTipoImpuesto getAuditoriaTipoImpuestoById(@PathVariable(value = "id") int audiTipoImpuestoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaTipoImpuestoRepository.findById(audiTipoImpuestoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaTipoImpuesto", "id", audiTipoImpuestoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
