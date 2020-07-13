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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoInsumo;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaTipoInsumoRepository;

@RestController
@RequestMapping("/apiAuditoriaTipoInsumo")
public class AuditoriaTipoInsumoController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaTipoInsumoController.class);

	@Autowired
	AuditoriaTipoInsumoRepository auditorioTipoInsumoRepository;
	
	@GetMapping("/auditoriaareas")
	public List<AuditoriaTipoInsumo> getAllAuditoriaTipoInsumo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditorioTipoInsumoRepository.findAll();
	}

	@GetMapping("/auditoriatipoInsumo/{id}")
	public AuditoriaTipoInsumo getAuditoriaTipoInsumoById(@PathVariable(value = "id") int auditipoInsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditorioTipoInsumoRepository.findById(auditipoInsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaTipoInsumo", "id", auditipoInsumoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
