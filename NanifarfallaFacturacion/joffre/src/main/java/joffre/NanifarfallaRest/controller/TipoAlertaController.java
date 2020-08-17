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
import joffre.NanifarfallaRest.model.TipoAlerta;
import joffre.NanifarfallaRest.repository.TipoAlertaRepository;

@RestController
@RequestMapping("/apiArea")
public class TipoAlertaController {
	private static final Log LOGGER = LogFactory.getLog(TipoAlertaController.class);
	@Autowired
	TipoAlertaRepository tipoAlertaRepository;

	@GetMapping("/TipoAlertas")
	public List<TipoAlerta> getAllTipoAlertas() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoAlertaRepository.findAll();
	}

	@PostMapping("/AddTipoAlerta")
	public TipoAlerta createTipoAlerta(@Valid @RequestBody TipoAlerta tipoalerta) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoAlertaRepository.save(tipoalerta);
	}

	@GetMapping("/TipoAlerta/{id}")
	public TipoAlerta getTipoAlertaById(@PathVariable(value = "id") int tipoalertaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoAlertaRepository.findById(tipoalertaId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoAlerta", "id", tipoalertaId));
	}

	@PutMapping("/TipoAlerta/{id}")
	public TipoAlerta updateTipoAlerta(@PathVariable(value = "id") int tipoalertaId,
			@Valid @RequestBody TipoAlerta tipoalertaDetails) {

		TipoAlerta tipoalerta = tipoAlertaRepository.findById(tipoalertaId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoAlerta", "id", tipoalertaId));

		tipoalerta.setNombre_tipoalerta(tipoalertaDetails.getNombre_tipoalerta());
		tipoalerta.setVersion(tipoalertaDetails.getVersion());
		tipoalerta.setAlertas(tipoalertaDetails.getAlertas());
		tipoalerta.setUseralertas(tipoalertaDetails.getUseralertas());

		TipoAlerta updatedTipoAlerta = tipoAlertaRepository.save(tipoalerta);
		LOGGER.info("METHOD: 'updateTipoAlerta'--PARAMS: '" + tipoalertaDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedTipoAlerta;
	}

	@DeleteMapping("/tipoalerta/{id}")
	public ResponseEntity<?> deleteTipoAlerta(@PathVariable(value = "id") int tipoalertaId) {
		TipoAlerta tipoalerta = tipoAlertaRepository.findById(tipoalertaId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoAlerta", "id", tipoalertaId));

		tipoAlertaRepository.delete(tipoalerta);
		LOGGER.info("METHOD: 'deleteArea'--PARAMS: '" + tipoalerta + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
