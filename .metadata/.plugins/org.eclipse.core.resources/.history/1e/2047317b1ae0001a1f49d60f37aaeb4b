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

import joffre.NanifarfallaRest.model.EstadoContrato;
import joffre.NanifarfallaRest.repository.EstadoContratoRepository;

@RestController
@RequestMapping("/apiEstadoContrato")
public class EstadoContratoController {

	private static final Log LOGGER = LogFactory.getLog(EstadoContratoController.class);
	
	@Autowired
	EstadoContratoRepository estadoContratoRepository;
	
	@GetMapping("/estadocontratos")
	public List<EstadoContrato> getAllEstadosContratos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoContratoRepository.findAll();
	}

	@PostMapping("/AddestadoContrato")
	public EstadoContrato createEstadoContrato(@Valid @RequestBody EstadoContrato estadoContrato) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoContratoRepository.save(estadoContrato);
	}

	@GetMapping("/estadoContrato/{id}")
	public EstadoContrato getEstadoContratoById(@PathVariable(value = "id") int estadoContratoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoContratoRepository.findById(estadoContratoId).orElseThrow(() -> new ResourceNotFoundException("EstadoContrato", "id", estadoContratoId));
	}

	@PutMapping("/estadoscontrato/{id}")
	public EstadoContrato updateEstadoContrato(@PathVariable(value = "id") int estadoContratoId, @Valid @RequestBody EstadoContrato estadoContratoDetails) {

		EstadoContrato estadocontrato = estadoContratoRepository.findById(estadoContratoId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoContrato", "id", estadoContratoId));
		
		estadocontrato.setDescripcion(estadoContratoDetails.getDescripcion());
		estadocontrato.setClaveApi(estadoContratoDetails.getClaveApi());
		estadocontrato.setVersion(estadoContratoDetails.getVersion());
		

		EstadoContrato updateestadocontrato = estadoContratoRepository.save(estadocontrato);
		LOGGER.info("METHOD: 'updateEstadoContrato'--PARAMS: '" + estadoContratoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updateestadocontrato;
	}

	@DeleteMapping("/estadoContrato/{id}")
	public ResponseEntity<?> deleteArea(@PathVariable(value = "id") int estadocontratoId) {
		EstadoContrato estadocontrato = estadoContratoRepository.findById(estadocontratoId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoContrato", "id", estadocontratoId));

		estadoContratoRepository.delete(estadocontrato);
		LOGGER.info("METHOD: 'deleteEstadoContrato'--PARAMS: '" + estadocontrato + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
