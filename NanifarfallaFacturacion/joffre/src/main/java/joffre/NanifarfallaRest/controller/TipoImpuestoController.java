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
import joffre.NanifarfallaRest.model.TipoImpuesto;
import joffre.NanifarfallaRest.repository.TipoImpuestoRepository;

@RestController
@RequestMapping("/apiTipoImpuesto")
public class TipoImpuestoController {
	private static final Log LOGGER = LogFactory.getLog(TipoImpuestoController.class);
	@Autowired
	TipoImpuestoRepository tipoImpuestorepository;

	@GetMapping("/tipoImpuesto")
	public List<TipoImpuesto> getAllTipoImpuesto() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoImpuestorepository.findAll();
	}

	@PostMapping("/AddTipoImpuesto")
	public TipoImpuesto createTipoImpuesto(@Valid @RequestBody TipoImpuesto tipoimpuesto) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoImpuestorepository.save(tipoimpuesto);
	}

	@GetMapping("/TipoImpuesto/{id}")
	public TipoImpuesto getTipoImpuestoById(@PathVariable(value = "id") int tipoimpuestoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoImpuestorepository.findById(tipoimpuestoId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoImpuesto", "id", tipoimpuestoId));
	}

	@PutMapping("/TipoImpuesto/{id}")
	public TipoImpuesto updateTipoImpuesto(@PathVariable(value = "id") int tipoimpuestoId,
			@Valid @RequestBody TipoImpuesto tipoimpuestoDetails) {

		TipoImpuesto tipoimpuesto = tipoImpuestorepository.findById(tipoimpuestoId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoImpuesto", "id", tipoimpuestoId));

		tipoimpuesto.setNombre_tipo_impuesto(tipoimpuestoDetails.getNombre_tipo_impuesto());
		tipoimpuesto.setIgvventas(tipoimpuestoDetails.getIgvventas());
		tipoimpuesto.setPorcentaje_tipo_impuesto(tipoimpuestoDetails.getPorcentaje_tipo_impuesto());
		tipoimpuesto.setClaveApi(tipoimpuestoDetails.getClaveApi());
		tipoimpuesto.setVersion(tipoimpuestoDetails.getVersion());
		

		TipoImpuesto updatedTipoImpuesto = tipoImpuestorepository.save(tipoimpuesto);
		LOGGER.info("METHOD: 'updateTipoImpuesto'--PARAMS: '" + tipoimpuestoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedTipoImpuesto;
	}

	@DeleteMapping("/tipoImpuesto/{id}")
	public ResponseEntity<?> deleteTipoImpuesto(@PathVariable(value = "id") int tipoimpuestoId) {
		TipoImpuesto tipoimpuesto = tipoImpuestorepository.findById(tipoimpuestoId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoImpuesto", "id", tipoimpuestoId));

		tipoImpuestorepository.delete(tipoimpuesto);
		LOGGER.info("METHOD: 'deleteTipoImpuesto'--PARAMS: '" + tipoimpuesto + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
