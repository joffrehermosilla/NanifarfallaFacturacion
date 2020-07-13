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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaPresentacionInsumo;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaPresentacionInsumoRepository;

@RestController
@RequestMapping("/apiAuditoriaPresentacionInsumo")
public class AuditoriaPresentacionInsumoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaPresentacionInsumoController.class);

	@Autowired
	AuditoriaPresentacionInsumoRepository auditoriaPresentacionInsumoRepository;
	
	@GetMapping("/auditoriapresentacionInsumo")
	public List<AuditoriaPresentacionInsumo> getAllAuditoriaPresentacionInsumo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaPresentacionInsumoRepository.findAll();
	}

	@GetMapping("/auditoriaPresentacionInsumo/{id}")
	public AuditoriaPresentacionInsumo getAuditoriaPresentacionInsumoById(@PathVariable(value = "id") int audipresentacionInsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaPresentacionInsumoRepository.findById(audipresentacionInsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaPresentacionInsumo", "id", audipresentacionInsumoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
}
