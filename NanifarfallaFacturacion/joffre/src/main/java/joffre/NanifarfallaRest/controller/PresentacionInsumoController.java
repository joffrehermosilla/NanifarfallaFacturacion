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
import joffre.NanifarfallaRest.model.PresentacionInsumo;
import joffre.NanifarfallaRest.repository.PresentacionInsumoRepository;

@RestController
@RequestMapping("/apiPresentacionInsumo")
public class PresentacionInsumoController {

	private static final Log LOGGER = LogFactory.getLog(PresentacionInsumoController.class);
	@Autowired
	PresentacionInsumoRepository presentacionInsumoRepository;
	
	@GetMapping("/presentacionInsumos")
	public List<PresentacionInsumo> getAllPresentacionesInsumo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return presentacionInsumoRepository.findAll();
	}

	@PostMapping("/AddpresentacionInsumo")
	public PresentacionInsumo createPresentacionInsumo(@Valid @RequestBody PresentacionInsumo presentacionInsumo) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return presentacionInsumoRepository.save(presentacionInsumo);
	}

	@GetMapping("/presentacionInsumoID/{id}")
	public PresentacionInsumo getPresentacionInsumoById(@PathVariable(value = "id") int presentacioninsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return presentacionInsumoRepository.findById(presentacioninsumoId).orElseThrow(() -> new ResourceNotFoundException("PresentacionInsumo", "id", presentacioninsumoId));
	}

	@PutMapping("/presentacionInsumo/{id}")
	public PresentacionInsumo updatePresentacionInsumo(@PathVariable(value = "id") int presentacionInsumoId, @Valid @RequestBody PresentacionInsumo presentacionInsumoDetails) {

		PresentacionInsumo presentacioninsumo = presentacionInsumoRepository.findById(presentacionInsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("PresentacionInsumo", "id", presentacionInsumoId));
		
		presentacioninsumo.setNombre_presentacion_insumo(presentacionInsumoDetails.getNombre_presentacion_insumo());
		presentacioninsumo.setClaveApi(presentacionInsumoDetails.getClaveApi());
		presentacioninsumo.setVersion(presentacionInsumoDetails.getVersion());
		presentacioninsumo.setInsumo(presentacionInsumoDetails.getInsumo());

		PresentacionInsumo updatedPresentacionInsumo = presentacionInsumoRepository.save(presentacioninsumo);
		LOGGER.info("METHOD: 'updatePresentacionInsumo'--PARAMS: '" + presentacionInsumoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedPresentacionInsumo;
	}

	@DeleteMapping("/presentacionInsumoDelete/{id}")
	public ResponseEntity<?> deletePresentacionInsumo(@PathVariable(value = "id") int presentacionInsumoId) {
		PresentacionInsumo presentacionInsumo = presentacionInsumoRepository.findById(presentacionInsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("PresentacionInsumo", "id", presentacionInsumoId));

		presentacionInsumoRepository.delete(presentacionInsumo);
		LOGGER.info("METHOD: 'deletePresentacionInsumo'--PARAMS: '" + presentacionInsumo + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
