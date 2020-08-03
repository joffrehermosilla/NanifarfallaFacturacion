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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaInsumo;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaInsumoRepository;

@RestController
@RequestMapping("/apiAuditoriaInsumo")
public class AuditoriaInsumoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaInsumoController.class);

	@Autowired
	AuditoriaInsumoRepository auditoriaInsumoRepository;

	@GetMapping("/auditoriainsumo")
	public List<AuditoriaInsumo> getAllAuditoriaInsumos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaInsumoRepository.findAll();
	}

	@GetMapping("/auditoriainsumo/{id}")
	public AuditoriaInsumo getAuditoriaInsumoById(@PathVariable(value = "id") int audiinsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaInsumoRepository.findById(audiinsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaInsumo", "id", audiinsumoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
