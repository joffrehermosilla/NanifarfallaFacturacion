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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaRecetaProductoTieneInsumo;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaRecetaProductoTieneInsumoRepository;

@RestController
@RequestMapping("/apiAuditoriaRecetaProductoTieneInsumo")
public class AuditoriaRecetaProductoTieneInsumoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaRecetaProductoTieneInsumoController.class);

	@Autowired
	AuditoriaRecetaProductoTieneInsumoRepository auditoriaRecetaProductoTieneInsumoRepository;

	@GetMapping("/auditoriaareas")
	public List<AuditoriaRecetaProductoTieneInsumo> getAllauditoriaRecetaProductoTieneInsumoRepository() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaRecetaProductoTieneInsumoRepository.findAll();
	}

	@GetMapping("/AuditoriaRecetaProductoTieneInsumo/{id}")
	public AuditoriaRecetaProductoTieneInsumo getAuditoriaRecetaProductoTieneInsumoById(
			@PathVariable(value = "id") int AuditoriaRecetaProductoTieneInsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaRecetaProductoTieneInsumoRepository.findById(AuditoriaRecetaProductoTieneInsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaRecetaProductoTieneInsumo", "id",
						AuditoriaRecetaProductoTieneInsumoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
