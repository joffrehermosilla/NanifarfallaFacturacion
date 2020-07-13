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
import joffre.NanifarfallaRest.model.RegimenCliente;
import joffre.NanifarfallaRest.repository.RegimenClienteRepository;

@RestController
@RequestMapping("/apiRegimenCliente")
public class RegimenClienteController {
	private static final Log LOGGER = LogFactory.getLog(RegimenClienteController.class);
	@Autowired
	RegimenClienteRepository regimenclienterepository;

	@GetMapping("/regimenesCliente")
	public List<RegimenCliente> getAllRegimenesCliente() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return regimenclienterepository.findAll();
	}

	@PostMapping("/AddaregimenCliente")
	public RegimenCliente createRegimenCliente(@Valid @RequestBody RegimenCliente regimenCliente) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return regimenclienterepository.save(regimenCliente);
	}

	@GetMapping("/RegimenCliente/{id}")
	public RegimenCliente getRegimenClienteById(@PathVariable(value = "id") int regimenclienteId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return regimenclienterepository.findById(regimenclienteId).orElseThrow(() -> new ResourceNotFoundException("RegimenCliente", "id", regimenclienteId));
	}

	@PutMapping("/regimenesCliente/{id}")
	public RegimenCliente updateRegimenCliente(@PathVariable(value = "id") int regimenclienteId, @Valid @RequestBody RegimenCliente regimenclienteDetails) {

		RegimenCliente regimencliente = regimenclienterepository.findById(regimenclienteId)
				.orElseThrow(() -> new ResourceNotFoundException("RegimenCliente", "id", regimenclienteId));
		
		
		regimencliente.setNombre_regimencliente(regimenclienteDetails.getNombre_regimencliente());
		regimencliente.setCliente(regimenclienteDetails.getCliente());
		regimencliente.setClaveApi(regimenclienteDetails.getClaveApi());

		RegimenCliente updatedRegimenCliente = regimenclienterepository.save(regimencliente);
		LOGGER.info("METHOD: 'updateRegimenCliente'--PARAMS: '" + regimenclienteDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedRegimenCliente;
	}

	@DeleteMapping("/regimencliente/{id}")
	public ResponseEntity<?> deleteRegimenCliente(@PathVariable(value = "id") int regimenclienteId) {
		RegimenCliente regimencliente = regimenclienterepository.findById(regimenclienteId)
				.orElseThrow(() -> new ResourceNotFoundException("RegimenCliente", "id", regimenclienteId));

		regimenclienterepository.delete(regimencliente);
		LOGGER.info("METHOD: 'deleteRegimenCliente'--PARAMS: '" + regimencliente + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
