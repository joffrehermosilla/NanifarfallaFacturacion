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

import joffre.NanifarfallaRest.model.Colores;
import joffre.NanifarfallaRest.repository.ColoresRepository;

@RestController
@RequestMapping("/apiColor")
public class ColoresController {

	private static final Log LOGGER = LogFactory.getLog(ColoresController.class);
	@Autowired
	ColoresRepository coloresRepository;
	
	@GetMapping("/colores")
	public List<Colores> getAllColores() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return coloresRepository.findAll();
	}

	@PostMapping("/Addcolores")
	public Colores createColor(@Valid @RequestBody Colores colores) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return coloresRepository.save(colores);
	}

	@GetMapping("/color/{id}")
	public Colores getColorById(@PathVariable(value = "id") int colorId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return coloresRepository.findById(colorId).orElseThrow(() -> new ResourceNotFoundException("Colores", "id", colorId));
	}

	@PutMapping("/color/{id}")
	public Colores updateColor(@PathVariable(value = "id") int colorId, @Valid @RequestBody Colores coloresDetails) {

		Colores color = coloresRepository.findById(colorId)
				.orElseThrow(() -> new ResourceNotFoundException("Colores", "id", colorId));
		
		color.setNombre_color(coloresDetails.getNombre_color());
		color.setClaveApi(coloresDetails.getClaveApi());
		color.setVersion(coloresDetails.getVersion());
	

		Colores updatedColor = coloresRepository.save(color);
		LOGGER.info("METHOD: 'updateColor'--PARAMS: '" + coloresDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedColor;
	}

	@DeleteMapping("/color/{id}")
	public ResponseEntity<?> deleteColor(@PathVariable(value = "id") int colorId) {
		Colores color = coloresRepository.findById(colorId)
				.orElseThrow(() -> new ResourceNotFoundException("Colores", "id", colorId));

		coloresRepository.delete(color);
		LOGGER.info("METHOD: 'deleteColor'--PARAMS: '" + color + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
}
