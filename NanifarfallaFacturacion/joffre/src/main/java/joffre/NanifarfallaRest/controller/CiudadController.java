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
import joffre.NanifarfallaRest.model.Ciudad;
import joffre.NanifarfallaRest.repository.CiudadRepository;

@RestController
@RequestMapping("/apiCiudad")
public class CiudadController {
	private static final Log LOGGER = LogFactory.getLog(CiudadController.class);
	@Autowired
	CiudadRepository ciudadrepository;

	@GetMapping("/ciudades")
	public List<Ciudad> getAllCiudades() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ciudadrepository.findAll();
	}

	@PostMapping("/Addciudad")
	public Ciudad createCiudad(@Valid @RequestBody Ciudad ciuadad) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ciudadrepository.save(ciuadad);
	}

	@GetMapping("/ciudad/{id}")
	public Ciudad getCiudadById(@PathVariable(value = "id") int ciudadId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ciudadrepository.findById(ciudadId)
				.orElseThrow(() -> new ResourceNotFoundException("Ciudad", "id", ciudadId));
	}

	@PutMapping("/ciudades/{id}")
	public Ciudad updateCiudad(@PathVariable(value = "id") int ciudadId, @Valid @RequestBody Ciudad ciudadDetails) {

		Ciudad ciudad = ciudadrepository.findById(ciudadId)
				.orElseThrow(() -> new ResourceNotFoundException("Ciudad", "id", ciudadId));
		ciudad.setNombre_ciudad(ciudadDetails.getNombre_ciudad());
		ciudad.setProvincia(ciudadDetails.getProvincia());
		ciudad.setClaveApi(ciudadDetails.getClaveApi());
		ciudad.setProvincia(ciudadDetails.getProvincia());
		ciudad.setDistrito(ciudadDetails.getDistrito());

		Ciudad updatedCiudad = ciudadrepository.save(ciudad);
		LOGGER.info("METHOD: 'updateCiudad'--PARAMS: '" + ciudadDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedCiudad;
	}

	@DeleteMapping("/ciudad/{id}")
	public ResponseEntity<?> deleteCiudad(@PathVariable(value = "id") int ciudadId) {
		Ciudad ciudad = ciudadrepository.findById(ciudadId)
				.orElseThrow(() -> new ResourceNotFoundException("Ciudad", "id", ciudadId));

		ciudadrepository.delete(ciudad);
		LOGGER.info("METHOD: 'deleteCiudad'--PARAMS: '" + ciudad + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}