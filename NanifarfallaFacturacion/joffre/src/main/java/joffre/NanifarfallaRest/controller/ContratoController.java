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
import joffre.NanifarfallaRest.model.Contrato;
import joffre.NanifarfallaRest.repository.ContratoRepository;

@RestController
@RequestMapping("/apiContrato")
public class ContratoController {
	private static final Log LOGGER = LogFactory.getLog(ContratoController.class);
	@Autowired
	ContratoRepository contratoRepository;

	@GetMapping("/contratos")
	public List<Contrato> getAllContratos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return contratoRepository.findAll();
	}

	@PostMapping("/AddContrato")
	public Contrato createContrato(@Valid @RequestBody Contrato contrato) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return contratoRepository.save(contrato);
	}

	@GetMapping("/contrato/{id}")
	public Contrato getContratoById(@PathVariable(value = "id") int contratoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return contratoRepository.findById(contratoId)
				.orElseThrow(() -> new ResourceNotFoundException("Contrato", "id", contratoId));
	}

	@PutMapping("/contratos/{id}")
	public Contrato updateContrato(@PathVariable(value = "id") int contratoId,
			@Valid @RequestBody Contrato contratoDetails) {

		Contrato contrato = contratoRepository.findById(contratoId)
				.orElseThrow(() -> new ResourceNotFoundException("Contrato", "id", contratoId));

		contrato.setDescripcion(contratoDetails.getDescripcion());
		contrato.setFecha_fin(contratoDetails.getFecha_fin());
		contrato.setFecha_inicio(contratoDetails.getFecha_inicio());
		contrato.setmCatalogo(contratoDetails.getmCatalogo());
		contrato.setmCliente(contratoDetails.getmCliente());
		contrato.setmClienteTienePedido(contratoDetails.getmClienteTienePedido());
		contrato.setmEstadoContrato(contratoDetails.getmEstadoContrato());
		contrato.setMonto(contratoDetails.getMonto());
		contrato.setmUserAlerta(contratoDetails.getmUserAlerta());
		contrato.setmUserAnuncios(contratoDetails.getmUserAnuncios());
		contrato.setmUsuario(contratoDetails.getmUsuario());
		contrato.setVersion(contratoDetails.getVersion());

		Contrato updatedContrato = contratoRepository.save(contrato);
		LOGGER.info("METHOD: 'updateContrato'--PARAMS: '" + contratoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedContrato;
	}

	@DeleteMapping("/contrato/{id}")
	public ResponseEntity<?> deleteContrato(@PathVariable(value = "id") int contratoId) {
		Contrato contrato = contratoRepository.findById(contratoId)
				.orElseThrow(() -> new ResourceNotFoundException("Contrato", "id", contratoId));

		contratoRepository.delete(contrato);
		LOGGER.info("METHOD: 'deleteContrato'--PARAMS: '" + contrato + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
