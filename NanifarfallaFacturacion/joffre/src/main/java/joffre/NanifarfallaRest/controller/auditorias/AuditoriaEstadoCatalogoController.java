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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoCatalogo;

import joffre.NanifarfallaRest.repository.auditorias.AuditoriaEstadoCatalogoRepository;

@RestController
@RequestMapping("/apiAuditoriaEstadoCatalogo")
public class AuditoriaEstadoCatalogoController {

	
	private static final Log LOGGER = LogFactory.getLog(AuditoriaEstadoCatalogoController.class);
	
	@Autowired
	AuditoriaEstadoCatalogoRepository audiEstadoCatalogorepository;
	
	@GetMapping("/auditoriaestadocatalogos")
	public List<AuditoriaEstadoCatalogo> getAllAuditoriaEstadoCatalogos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audiEstadoCatalogorepository.findAll();
	}

	@GetMapping("/auditoriaestadocatalogo/{id}")
	public AuditoriaEstadoCatalogo getAuditoriaEstadoCatalogoById(@PathVariable(value = "id") int audiestadocatalogoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audiEstadoCatalogorepository.findById(audiestadocatalogoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaEstadoCatalogo", "id", audiestadocatalogoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
}
