package joffre.NanifarfallaRest.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
import joffre.NanifarfallaRest.model.EstadoCatalogo;
import joffre.NanifarfallaRest.repository.EstadoCatalogoRepository;

@RestController
@RequestMapping("/apiEstadocatalogo")
public class EstadoCatalogoController {

	private static final Log LOGGER = LogFactory.getLog(EstadoCatalogoController.class);
	@Autowired
	EstadoCatalogoRepository estadoCatalogoRepository;

	@GetMapping("/EstadoCatalogo")
	public List<EstadoCatalogo> getAllEstadoCatalogo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoCatalogoRepository.findAll();
	}

	@PostMapping("/AddEstadoCatalogo")
	public EstadoCatalogo createEstadoCatalogo(@Valid @RequestBody EstadoCatalogo estadocatalogo) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoCatalogoRepository.save(estadocatalogo);
	}

	@GetMapping("/EstadoCatalogo/{id}")
	public EstadoCatalogo getEstadoCatalogoById(@PathVariable(value = "id") int estadocatalogId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoCatalogoRepository.findById(estadocatalogId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoCatalogo", "id", estadocatalogId));
	}

	@PutMapping("/EstadoCatalogo/{id}")
	public EstadoCatalogo updateEstadoCatalogo(@PathVariable(value = "id") int estadocatalogId,
			@Valid @RequestBody EstadoCatalogo estadocatalogoDetails) {

		EstadoCatalogo estadocatalogo = estadoCatalogoRepository.findById(estadocatalogId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoCatalogo", "id", estadocatalogId));

		estadocatalogo.setCatalogos(estadocatalogoDetails.getCatalogos());
		estadocatalogo.setClaveApi(estadocatalogoDetails.getClaveApi());
		estadocatalogo.setDescripcion(estadocatalogoDetails.getDescripcion());
		estadocatalogo.setVersion(estadocatalogoDetails.getVersion());

		EstadoCatalogo updatedEstadoCatalogo = estadoCatalogoRepository.save(estadocatalogo);
		LOGGER.info("METHOD: 'updateEstadoCatalogo'--PARAMS: '" + estadocatalogoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedEstadoCatalogo;
	}

	@DeleteMapping("/EstadoCatalogo/{id}")
	public ResponseEntity<?> deleteEstadoCatalogo(@PathVariable(value = "id") int estadocatalogId) {
		EstadoCatalogo estadocatalogo = estadoCatalogoRepository.findById(estadocatalogId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoCatalogo", "id", estadocatalogId));

		estadoCatalogoRepository.delete(estadocatalogo);
		LOGGER.info("METHOD: 'deleteEstadoCatalogo'--PARAMS: '" + estadocatalogo + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
