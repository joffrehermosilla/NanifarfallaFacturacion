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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaLoteInsumo;

import joffre.NanifarfallaRest.repository.auditorias.AuditoriaLoteInsumoRepository;

@RestController
@RequestMapping("/apiAuditoriaLoteInsumo")
public class AuditoriaLoteInsumoController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaLoteInsumoController.class);

	@Autowired
	AuditoriaLoteInsumoRepository auditoriaLoteInsumoRepository;

	@GetMapping("/auditoriaLoteInsumo")
	public List<AuditoriaLoteInsumo> getAllAuditoriaLoteInsumo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaLoteInsumoRepository.findAll();
	}

	@GetMapping("/auditoriaLoteInsumo/{id}")
	public AuditoriaLoteInsumo getAuditoriaLoteInsumoById(@PathVariable(value = "id") int audiloteInsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaLoteInsumoRepository.findById(audiloteInsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaLoteInsumo", "id", audiloteInsumoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
