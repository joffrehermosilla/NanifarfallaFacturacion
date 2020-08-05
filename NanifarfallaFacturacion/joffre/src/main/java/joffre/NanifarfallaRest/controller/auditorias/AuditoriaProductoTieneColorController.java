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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaProductoTieneColor;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaProductoTieneColorRepository;

@RestController
@RequestMapping("/apiAuditoriaProductoTieneColor")
public class AuditoriaProductoTieneColorController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaProductoTieneColorController.class);

	@Autowired
	AuditoriaProductoTieneColorRepository auditoriaProductoTieneColorRepository;

	@GetMapping("/AuditoriaProductoTieneColor")
	public List<AuditoriaProductoTieneColor> getAlAuditoriaProductoTieneColor() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaProductoTieneColorRepository.findAll();
	}

	@GetMapping("/AuditoriaProductoTieneColor/{id}")
	public AuditoriaProductoTieneColor getAuditoriaProductoTieneColorById(
			@PathVariable(value = "id") int AuditoriaProductoTieneColorId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaProductoTieneColorRepository.findById(AuditoriaProductoTieneColorId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaProductoTieneColor", "id",
						AuditoriaProductoTieneColorId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
