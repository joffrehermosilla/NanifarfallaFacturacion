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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoContrato;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaEstadoContratoRepository;

@RestController
@RequestMapping("/apiAuditoriaEstadoContrato")
public class AuditoriaEstadoContratoController {

	
	private static final Log LOGGER = LogFactory.getLog(AuditoriaEstadoContratoController.class);

	@Autowired
	AuditoriaEstadoContratoRepository auditoriaestadoContratoRepository;
	
	@GetMapping("/auditoriaEstadoContrato")
	public List<AuditoriaEstadoContrato> getAllAuditoriaEstadoContrato() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaestadoContratoRepository.findAll();
	}

	@GetMapping("/auditoriaarea/{id}")
	public AuditoriaEstadoContrato getAuditoriaEstadoContratoById(@PathVariable(value = "id") int audiestadoContratoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaestadoContratoRepository.findById(audiestadoContratoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaEstadoContrato", "id", audiestadoContratoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
}
