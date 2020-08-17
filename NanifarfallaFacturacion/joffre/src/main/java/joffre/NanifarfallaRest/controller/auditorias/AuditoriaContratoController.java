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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaContrato;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaContratoRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaContratoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaContratoController.class);

	@Autowired
	AuditoriaContratoRepository auditoriaContratoRepository;

	@GetMapping("/auditoriacontratos")
	public List<AuditoriaContrato> getAllAuditoriaContratos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaContratoRepository.findAll();
	}

	@GetMapping("/auditoriacontrato/{id}")
	public AuditoriaContrato getAuditoriaContratoById(@PathVariable(value = "id") int audicontratoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaContratoRepository.findById(audicontratoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaContrato", "id", audicontratoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
