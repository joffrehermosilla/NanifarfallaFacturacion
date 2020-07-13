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

import joffre.NanifarfallaRest.model.LoteInsumo;
import joffre.NanifarfallaRest.repository.LoteInsumoRepository;

@RestController
@RequestMapping("/apiLoteInsumo")
public class LoteInsumoController {

	private static final Log LOGGER = LogFactory.getLog(LoteInsumoController.class);
	@Autowired
	LoteInsumoRepository loteInsumorepository;

	@GetMapping("/lotesInsumo")
	public List<LoteInsumo> getAllLoteInsumo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return loteInsumorepository.findAll();
	}

	@PostMapping("/AddloteInsumo")
	public LoteInsumo createLoteInsumo(@Valid @RequestBody LoteInsumo loteinsumo) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return loteInsumorepository.save(loteinsumo);
	}

	@GetMapping("/loteinsumo/{id}")
	public LoteInsumo getLoteInsumoById(@PathVariable(value = "id") int loteinsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return loteInsumorepository.findById(loteinsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("LoteInsumo", "id", loteinsumoId));
	}

	@PutMapping("/loteinsumo/{id}")
	public LoteInsumo updateLoteInsumo(@PathVariable(value = "id") int loteinsumoId,
			@Valid @RequestBody LoteInsumo loteinsumoDetails) {

		LoteInsumo loteinsumo = loteInsumorepository.findById(loteinsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("LoteInsumo", "id", loteinsumoId));

		loteinsumo.setNombre_lote_insumo(loteinsumoDetails.getNombre_lote_insumo());
		loteinsumo.setClaveApi(loteinsumoDetails.getClaveApi());
		loteinsumo.setVersion(loteinsumoDetails.getVersion());
		loteinsumo.setInsumo(loteinsumoDetails.getInsumo());

		LoteInsumo updatedLoteInsumo = loteInsumorepository.save(loteinsumo);
		LOGGER.info("METHOD: 'updateLoteInsumo'--PARAMS: '" + loteinsumoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedLoteInsumo;
	}

	@DeleteMapping("/loteinsumo/{id}")
	public ResponseEntity<?> deleteLoteInsumo(@PathVariable(value = "id") int loteinsumoId) {
		LoteInsumo loteinsumo = loteInsumorepository.findById(loteinsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("LoteInsumo", "id", loteinsumoId));

		loteInsumorepository.delete(loteinsumo);
		LOGGER.info("METHOD: 'deleteLoteInsumo'--PARAMS: '" + loteinsumo + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
