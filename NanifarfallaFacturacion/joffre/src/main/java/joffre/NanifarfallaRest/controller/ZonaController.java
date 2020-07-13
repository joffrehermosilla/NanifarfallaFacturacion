package joffre.NanifarfallaRest.controller;

import java.util.List;
import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
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

import joffre.NanifarfallaRest.model.Zona;
import joffre.NanifarfallaRest.repository.ZonaRepository;

@RestController
@RequestMapping("/apiZona")
public class ZonaController {
	@Autowired
	ZonaRepository zonarepository;

	private static final Log LOGGER = LogFactory.getLog(ZonaController.class);

	@GetMapping("/detallesZonas")
	public List<Zona> getAllZonas() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return zonarepository.findAll();
	}

	@PostMapping("/AddZonas")
	public Zona createZonas(@Valid @RequestBody Zona zona) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return zonarepository.save(zona);
	}

	@GetMapping("/zona/{id}")
	public Zona getZonasById(@PathVariable(value = "id") int zonaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return zonarepository.findById(zonaId).orElseThrow(() -> new ResourceNotFoundException("Zona", "id", zonaId));
	}

	@PutMapping("/zona/{id}")
	public Zona updateZona(@PathVariable(value = "id") int zonaId, @Valid @RequestBody Zona zonaDetails) {

		Zona zona = zonarepository.findById(zonaId)
				.orElseThrow(() -> new ResourceNotFoundException("Zona", "id", zonaId));
		zona.setNombre_zona(zonaDetails.getNombre_zona());
		zona.setClaveApi(zonaDetails.getClaveApi());
		zona.setVersion(zonaDetails.getVersion());
        zona.setZonatienedistrito(zonaDetails.getZonatienedistrito());
		
		
		Zona updatedZona = zonarepository.save(zona);

		LOGGER.info("METHOD: 'updateZona'--PARAMS: '" + zonaDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedZona;
	}

	@DeleteMapping("/zona/{id}")
	public ResponseEntity<?> deleteZona(@PathVariable(value = "id") int zonaId) {
		Zona zona = zonarepository.findById(zonaId)
				.orElseThrow(() -> new ResourceNotFoundException("Zona", "id", zonaId));

		zonarepository.delete(zona);
		LOGGER.info("METHOD: 'deleteZona'--PARAMS: '" + zona + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
