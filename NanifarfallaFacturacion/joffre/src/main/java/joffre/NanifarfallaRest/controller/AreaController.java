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
import joffre.NanifarfallaRest.model.Area;
import joffre.NanifarfallaRest.repository.AreaRepository;

@RestController
@RequestMapping("/apiArea")
public class AreaController {
	private static final Log LOGGER = LogFactory.getLog(AreaController.class);
	@Autowired
	AreaRepository arearepository;

	@GetMapping("/areas")
	public List<Area> getAllAreas() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return arearepository.findAll();
	}

	@PostMapping("/Addarea")
	public Area createArea(@Valid @RequestBody Area area) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return arearepository.save(area);
	}

	@GetMapping("/area/{id}")
	public Area getAreaById(@PathVariable(value = "id") int areaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return arearepository.findById(areaId).orElseThrow(() -> new ResourceNotFoundException("Area", "id", areaId));
	}

	@PutMapping("/areas/{id}")
	public Area updateArea(@PathVariable(value = "id") int areaId, @Valid @RequestBody Area areaDetails) {

		Area area = arearepository.findById(areaId)
				.orElseThrow(() -> new ResourceNotFoundException("Area", "id", areaId));
		area.setNombre_area(areaDetails.getNombre_area());
		area.setVendedor(areaDetails.getVendedor());
	    area.setVersion(areaDetails.getVersion());
		area.setClaveApi(areaDetails.getClaveApi());

		Area updatedArea = arearepository.save(area);
		LOGGER.info("METHOD: 'updateArea'--PARAMS: '" + areaDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedArea;
	}

	@DeleteMapping("/area/{id}")
	public ResponseEntity<?> deleteArea(@PathVariable(value = "id") int areaId) {
		Area area = arearepository.findById(areaId)
				.orElseThrow(() -> new ResourceNotFoundException("Area", "id", areaId));

		arearepository.delete(area);
		LOGGER.info("METHOD: 'deleteArea'--PARAMS: '" + area + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
