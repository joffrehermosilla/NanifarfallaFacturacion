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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoInsumo;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaEstadoInsumoRepository;

@RestController
@RequestMapping("/apiAuditoriaEstadoInsumo")
public class AuditoriaEstadoInsumoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaEstadoInsumoController.class);
	@Autowired
	AuditoriaEstadoInsumoRepository auditoriaEstadoInsumoRepository;

	@GetMapping("/auditoriaestadoinsumo")
	public List<AuditoriaEstadoInsumo> getAllAuditoriaEstadoInsumos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaEstadoInsumoRepository.findAll();
	}

	@GetMapping("/auditoriaestadoinsumo/{id}")
	public AuditoriaEstadoInsumo getAuditoriaEstadoInsumoById(@PathVariable(value = "id") int audiestadoinsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaEstadoInsumoRepository.findById(audiestadoinsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaEstadoInsumo", "id", audiestadoinsumoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
