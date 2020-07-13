package joffre.NanifarfallaRest.controller;


import joffre.NanifarfallaRest.model.Zona_tieneDistrito;
import joffre.NanifarfallaRest.repository.Zona_tieneDistritoRepository;

import javax.validation.Valid;
import java.util.List;
import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
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

@RestController
@RequestMapping("/apiZonatieneDistrito")
public class ZonatieneDistritoController {
	@Autowired
	Zona_tieneDistritoRepository zona_tieneDistritorepository;

	private static final Log LOGGER = LogFactory.getLog(ZonatieneDistritoController.class);

	@GetMapping("/detallesZonastienenDistrito")
	public List<Zona_tieneDistrito> getAllZonastienenDistrito() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return zona_tieneDistritorepository.findAll();
	}

	@PostMapping("/AddZonastieneDistrito")
	public Zona_tieneDistrito createZonas(@Valid @RequestBody Zona_tieneDistrito zonatieneDistrito) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return zona_tieneDistritorepository.save(zonatieneDistrito);
	}

	@GetMapping("/zonatieneDistrito/{id}")
	public Zona_tieneDistrito getZonastieneDistritoById(@PathVariable(value = "id") int zonatieneDistritoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return zona_tieneDistritorepository.findById(zonatieneDistritoId)
				.orElseThrow(() -> new ResourceNotFoundException("Zona_tieneDistrito", "id", zonatieneDistritoId));
	}

	@PutMapping("/zonatieneDistrito/{id}")
	public Zona_tieneDistrito updateZonatieneDistrito(@PathVariable(value = "id") int zonatieneDistritoId,
			@Valid @RequestBody Zona_tieneDistrito zonatieneDistritoDetails) {

		Zona_tieneDistrito zonatienedistrito = zona_tieneDistritorepository.findById(zonatieneDistritoId)
				.orElseThrow(() -> new ResourceNotFoundException("Zona_tieneDistrito", "id", zonatieneDistritoId));
		zonatienedistrito.setDistrito(zonatieneDistritoDetails.getDistrito());
		zonatienedistrito.setZona(zonatieneDistritoDetails.getZona());

		zonatienedistrito.setClaveApi(zonatieneDistritoDetails.getClaveApi());

		Zona_tieneDistrito updatedZonatieneDistrito = zona_tieneDistritorepository.save(zonatienedistrito);

		LOGGER.info("METHOD: 'updateZonatieneDistrito'--PARAMS: '" + zonatieneDistritoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedZonatieneDistrito;
	}

	@DeleteMapping("/zonatieneDistrito/{id}")
	public ResponseEntity<?> deleteZonatieneDistrito(@PathVariable(value = "id") int zonatieneDistritoId) {
		Zona_tieneDistrito zonatienedistrito = zona_tieneDistritorepository.findById(zonatieneDistritoId)
				.orElseThrow(() -> new ResourceNotFoundException("Zona_tieneDistrito", "id", zonatieneDistritoId));

		zona_tieneDistritorepository.delete(zonatienedistrito);
		LOGGER.info("METHOD: 'deleteZonatieneDistrito'--PARAMS: '" + zonatienedistrito + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
