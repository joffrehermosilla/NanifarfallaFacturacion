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

import joffre.NanifarfallaRest.model.EstadoInsumo;
import joffre.NanifarfallaRest.repository.EstadoInsumoRepository;

@RestController
@RequestMapping("/apiEstadoInsumo")
public class EstadoInsumoController {

	private static final Log LOGGER = LogFactory.getLog(EstadoInsumoController.class);
	@Autowired
	EstadoInsumoRepository estadoInsumoRepository;

	@GetMapping("/estadosInsumo")
	public List<EstadoInsumo> getAllEstadosInsumo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoInsumoRepository.findAll();
	}

	@PostMapping("/AddestadoInsumo")
	public EstadoInsumo createEstadoInsumo(@Valid @RequestBody EstadoInsumo estadoInsumo) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoInsumoRepository.save(estadoInsumo);
	}

	@GetMapping("/EstadoInsumo/{id}")
	public EstadoInsumo getEstadoInsumoById(@PathVariable(value = "id") int estadoinsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoInsumoRepository.findById(estadoinsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoInsumo", "id", estadoinsumoId));
	}

	@PutMapping("/estadosInsumo/{id}")
	public EstadoInsumo updateEstadoInsumo(@PathVariable(value = "id") int estadoinsumoId,
			@Valid @RequestBody EstadoInsumo estadoinsumoDetails) {

		EstadoInsumo estadoinsumo = estadoInsumoRepository.findById(estadoinsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoInsumo", "id", estadoinsumoId));

		estadoinsumo.setNombre_estado_insumo(estadoinsumoDetails.getNombre_estado_insumo());
		estadoinsumo.setClaveApi(estadoinsumoDetails.getClaveApi());
		estadoinsumo.setVersion(estadoinsumoDetails.getVersion());

		EstadoInsumo updatedEstadoInsumo = estadoInsumoRepository.save(estadoinsumo);
		LOGGER.info("METHOD: 'updateEstadoInsumo'--PARAMS: '" + estadoinsumoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedEstadoInsumo;
	}

	@DeleteMapping("/estadoinsumo/{id}")
	public ResponseEntity<?> deleteEstadoInsumo(@PathVariable(value = "id") int estadoinsumoId) {
		EstadoInsumo estadoinsumo = estadoInsumoRepository.findById(estadoinsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoInsumo", "id", estadoinsumoId));

		estadoInsumoRepository.delete(estadoinsumo);
		LOGGER.info("METHOD: 'deleteEstadoInsumo'--PARAMS: '" + estadoinsumo + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
