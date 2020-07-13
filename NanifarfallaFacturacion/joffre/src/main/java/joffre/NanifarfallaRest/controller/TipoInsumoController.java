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
import joffre.NanifarfallaRest.model.TipoInsumo;
import joffre.NanifarfallaRest.repository.TipoInsumoRepository;

@RestController
@RequestMapping("/apiTipoInsumo")
public class TipoInsumoController {
	private static final Log LOGGER = LogFactory.getLog(TipoInsumoController.class);
	@Autowired
	TipoInsumoRepository tipoInsumoRepository;

	@GetMapping("/areas")
	public List<TipoInsumo> getAllTipoInsumos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoInsumoRepository.findAll();
	}

	@PostMapping("/AddtipoInsumo")
	public TipoInsumo createTipoInsumo(@Valid @RequestBody TipoInsumo tipoinsumo) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoInsumoRepository.save(tipoinsumo);
	}

	@GetMapping("/tipoInsumo/{id}")
	public TipoInsumo getTipoInsumoById(@PathVariable(value = "id") int tipoInsumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoInsumoRepository.findById(tipoInsumoId).orElseThrow(() -> new ResourceNotFoundException("TipoInsumo", "id", tipoInsumoId));
	}

	@PutMapping("/tipoInsumos/{id}")
	public TipoInsumo updateTipoInsumo(@PathVariable(value = "id") int tipoInsumoId, @Valid @RequestBody TipoInsumo tipoInsumoDetails) {

		TipoInsumo tipoinsumo = tipoInsumoRepository.findById(tipoInsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoInsumo", "id", tipoInsumoId));
		
		
		tipoinsumo.setNombre_tipo_insumo(tipoInsumoDetails.getNombre_tipo_insumo());
		tipoinsumo.setClaveApi(tipoInsumoDetails.getClaveApi());
		tipoinsumo.setVersion(tipoInsumoDetails.getVersion());
		tipoinsumo.setInsumo(tipoInsumoDetails.getInsumo());


		TipoInsumo updatedTipoInsumo = tipoInsumoRepository.save(tipoinsumo);
		LOGGER.info("METHOD: 'updateTipoInsumo'--PARAMS: '" + tipoInsumoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedTipoInsumo;
	}

	@DeleteMapping("/tipoInsumo/{id}")
	public ResponseEntity<?> deleteTipoInsumo(@PathVariable(value = "id") int tipoInsumoId) {
		TipoInsumo tipoinsumo = tipoInsumoRepository.findById(tipoInsumoId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoInsumo", "id", tipoInsumoId));

		tipoInsumoRepository.delete(tipoinsumo);
		LOGGER.info("METHOD: 'deleteTipoInsumo'--PARAMS: '" + tipoinsumo + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
	
}
