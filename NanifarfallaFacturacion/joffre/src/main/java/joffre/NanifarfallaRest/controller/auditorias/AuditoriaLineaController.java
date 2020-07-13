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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaLinea;

import joffre.NanifarfallaRest.repository.auditorias.AuditoriaLineaRepository;

@RestController
@RequestMapping("/apiAuditoriaLinea")
public class AuditoriaLineaController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaLineaController.class);

	@Autowired
	AuditoriaLineaRepository auditoriaLineaRepository;
	
	@GetMapping("/auditorialineas")
	public List<AuditoriaLinea> getAllAuditoriaLineas() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaLineaRepository.findAll();
	}

	@GetMapping("/auditorialinea/{id}")
	public AuditoriaLinea getAuditoriaLineaById(@PathVariable(value = "id") int audilineaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaLineaRepository.findById(audilineaId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaLinea", "id", audilineaId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
