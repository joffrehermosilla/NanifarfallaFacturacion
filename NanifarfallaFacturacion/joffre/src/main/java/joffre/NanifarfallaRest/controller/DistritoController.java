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
import joffre.NanifarfallaRest.model.Distrito;
import joffre.NanifarfallaRest.repository.DistritoRepository;

@RestController
@RequestMapping("/apiDistrito")
public class DistritoController {
	private static final Log LOGGER = LogFactory.getLog(DistritoController.class);
	@Autowired
	DistritoRepository distritorepository;

	@GetMapping("/detallesDistritos")
	public List<Distrito> getAllDistritos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return distritorepository.findAll();
	}

	@PostMapping("/AddDistritos")
	public Distrito createDistritos(@Valid @RequestBody Distrito distrito) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return distritorepository.save(distrito);
	}

	@GetMapping("/distrito/{id}")
	public Distrito getDistritosById(@PathVariable(value = "id") int distritoId) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return distritorepository.findById(distritoId)
				.orElseThrow(() -> new ResourceNotFoundException("Distrito", "id", distritoId));
	}

	@PutMapping("/distrito/{id}")
	public Distrito updateDistrito(@PathVariable(value = "id") int distritoId,
			@Valid @RequestBody Distrito distritoDetails) {

		Distrito distrito = distritorepository.findById(distritoId)
				.orElseThrow(() -> new ResourceNotFoundException("Distrito", "id", distritoId));
		distrito.setNombre_distrito(distritoDetails.getNombre_distrito());
		distrito.setZonatienedistrito(distritoDetails.getZonatienedistrito());
		distrito.setVersion(distritoDetails.getVersion());
		distrito.setClaveApi(distritoDetails.getClaveApi());
		distrito.setZonatienedistrito(distritoDetails.getZonatienedistrito());

		Distrito updatedDistrito = distritorepository.save(distrito);
		LOGGER.info("METHOD: 'updateDistrito'--PARAMS: '" + distritoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedDistrito;
	}

	@DeleteMapping("/distrito/{id}")
	public ResponseEntity<?> deleteDistrito(@PathVariable(value = "id") int distritoId) {
		Distrito distrito = distritorepository.findById(distritoId)
				.orElseThrow(() -> new ResourceNotFoundException("Distrito", "id", distritoId));

		distritorepository.delete(distrito);
		LOGGER.info("METHOD: 'deleteDistrito'--PARAMS: '" + distrito + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
