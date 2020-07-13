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
import joffre.NanifarfallaRest.model.EstadoCliente;
import joffre.NanifarfallaRest.repository.EstadoClienteRepository;

@RestController
@RequestMapping("/apiEstadoCliente")
public class EstadoClienteController {
	private static final Log LOGGER = LogFactory.getLog(EstadoClienteController.class);
	@Autowired
	EstadoClienteRepository estadoclienterepository;

	@GetMapping("/estadosCliente")
	public List<EstadoCliente> getAllEstadosCliente() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoclienterepository.findAll();
	}

	@PostMapping("/AddestadoCliente")
	public EstadoCliente createEstadoCliente(@Valid @RequestBody EstadoCliente estadoCliente) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoclienterepository.save(estadoCliente);
	}

	@GetMapping("/EstadoCliente/{id}")
	public EstadoCliente getEstadoClienteById(@PathVariable(value = "id") int estadoclienteId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoclienterepository.findById(estadoclienteId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoCliente", "id", estadoclienteId));
	}

	@PutMapping("/estadosCliente/{id}")
	public EstadoCliente updateEstadoCliente(@PathVariable(value = "id") int estadoclienteId,
			@Valid @RequestBody EstadoCliente estadoclienteDetails) {

		EstadoCliente estadocliente = estadoclienterepository.findById(estadoclienteId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoCliente", "id", estadoclienteId));

		estadocliente.setNombre_estadocliente(estadoclienteDetails.getNombre_estadocliente());

		estadocliente.setClaveApi(estadoclienteDetails.getClaveApi());

		EstadoCliente updatedEstadoCliente = estadoclienterepository.save(estadocliente);
		LOGGER.info("METHOD: 'updateEstadoCliente'--PARAMS: '" + estadoclienteDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedEstadoCliente;
	}

	@DeleteMapping("/estadocliente/{id}")
	public ResponseEntity<?> deleteEstadoCliente(@PathVariable(value = "id") int estadoclienteId) {
		EstadoCliente estadocliente = estadoclienterepository.findById(estadoclienteId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoCliente", "id", estadoclienteId));

		estadoclienterepository.delete(estadocliente);
		LOGGER.info("METHOD: 'deleteEstadoCliente'--PARAMS: '" + estadocliente + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
