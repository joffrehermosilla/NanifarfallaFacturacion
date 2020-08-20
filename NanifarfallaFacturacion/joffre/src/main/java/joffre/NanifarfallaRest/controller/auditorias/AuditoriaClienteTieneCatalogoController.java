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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaClienteTieneCatalogo;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaClienteTieneCatalogoRepository;

@RestController
@RequestMapping("/apiAuditoriaClienteTieneCatalogo")
public class AuditoriaClienteTieneCatalogoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaClienteTieneCatalogoController.class);

	@Autowired
	AuditoriaClienteTieneCatalogoRepository auditoriaClienteTieneCatalogoRepository;

	@GetMapping("/AuditoriaClienteTieneCatalogos")
	public List<AuditoriaClienteTieneCatalogo> getAllAuditoriaClienteTieneCatalogo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaClienteTieneCatalogoRepository.findAll();
	}

	@GetMapping("/AuditoriaClienteTieneCatalogo/{id}")
	public AuditoriaClienteTieneCatalogo getAuditoriaClienteTieneCatalogoById(
			@PathVariable(value = "id") int AuditoriaClienteTieneCatalogoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaClienteTieneCatalogoRepository.findById(AuditoriaClienteTieneCatalogoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaClienteTieneCatalogo", "id",
						AuditoriaClienteTieneCatalogoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
