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

import joffre.NanifarfallaRest.model.Linea;
import joffre.NanifarfallaRest.repository.LineaRepository;

@RestController
@RequestMapping("/apiLinea")
public class LineaController {
	private static final Log LOGGER = LogFactory.getLog(LineaController.class);
	@Autowired
	LineaRepository lineaRepository;

	@GetMapping("/lineas")
	public List<Linea> getAllLineas() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return lineaRepository.findAll();
	}

	@PostMapping("/Addlinea")
	public Linea createLinea(@Valid @RequestBody Linea linea) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return lineaRepository.save(linea);
	}

	@GetMapping("/linea/{id}")
	public Linea getLineaById(@PathVariable(value = "id") int lineaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return lineaRepository.findById(lineaId)
				.orElseThrow(() -> new ResourceNotFoundException("Linea", "id", lineaId));
	}

	@PutMapping("/lineas/{id}")
	public Linea updateLinea(@PathVariable(value = "id") int lineaId, @Valid @RequestBody Linea lineaDetails) {

		Linea linea = lineaRepository.findById(lineaId)
				.orElseThrow(() -> new ResourceNotFoundException("Linea", "id", lineaId));

		linea.setNombre_linea(lineaDetails.getNombre_linea());
		linea.setFoto_ruta(lineaDetails.getFoto_ruta());
		linea.setClaveApi(lineaDetails.getClaveApi());
		linea.setVersion(lineaDetails.getVersion());
		linea.setProductos(lineaDetails.getProductos());

		Linea updatedLinea = lineaRepository.save(linea);
		LOGGER.info("METHOD: 'updateLinea'--PARAMS: '" + lineaDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedLinea;
	}

	@DeleteMapping("/linea/{id}")
	public ResponseEntity<?> deleteLinea(@PathVariable(value = "id") int lineaId) {
		Linea linea = lineaRepository.findById(lineaId)
				.orElseThrow(() -> new ResourceNotFoundException("Linea", "id", lineaId));

		lineaRepository.delete(linea);
		LOGGER.info("METHOD: 'deleteLinea'--PARAMS: '" + linea + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
