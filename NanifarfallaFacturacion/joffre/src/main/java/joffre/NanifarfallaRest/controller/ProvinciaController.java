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
import joffre.NanifarfallaRest.model.Provincia;
import joffre.NanifarfallaRest.repository.ProvinciaRepository;

@RestController
@RequestMapping("/apiProvincia")
public class ProvinciaController {

	private static final Log LOGGER = LogFactory.getLog(ProvinciaController.class);
	@Autowired
	ProvinciaRepository provinciaRepository;

	@GetMapping("/provincias")
	public List<Provincia> getAllProvincias() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return provinciaRepository.findAll();
	}

	@PostMapping("/Addprovincia")
	public Provincia createProvincia(@Valid @RequestBody Provincia provincia) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return provinciaRepository.save(provincia);
	}

	@GetMapping("/provincia/{id}")
	public Provincia getProvinciaById(@PathVariable(value = "id") int provinciaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return provinciaRepository.findById(provinciaId)
				.orElseThrow(() -> new ResourceNotFoundException("Provincia", "id", provinciaId));
	}

	@PutMapping("/provincias/{id}")
	public Provincia updateProvincia(@PathVariable(value = "id") int provinciaId,
			@Valid @RequestBody Provincia provinciaDetails) {

		Provincia provincia = provinciaRepository.findById(provinciaId)
				.orElseThrow(() -> new ResourceNotFoundException("Provincia", "id", provinciaId));

		provincia.setNombre_provincia(provinciaDetails.getNombre_provincia());
		provincia.setPais(provinciaDetails.getPais());

		provincia.setClaveApi(provinciaDetails.getClaveApi());
		provincia.setVersion(provinciaDetails.getVersion());

		Provincia updatedProvincia = provinciaRepository.save(provincia);
		LOGGER.info("METHOD: 'updateProvincia'--PARAMS: '" + provinciaDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedProvincia;
	}

	@DeleteMapping("/provincia/{id}")
	public ResponseEntity<?> deleteProvincia(@PathVariable(value = "id") int provinciaId) {
		Provincia provincia = provinciaRepository.findById(provinciaId)
				.orElseThrow(() -> new ResourceNotFoundException("Provincia", "id", provinciaId));

		provinciaRepository.delete(provincia);

		LOGGER.info("METHOD: 'deleteProvincia'--PARAMS: '" + provincia + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");

		return ResponseEntity.ok().build();
	}

}// http://localhost:8085/nanifarfalla-service/swagger-ui.html
