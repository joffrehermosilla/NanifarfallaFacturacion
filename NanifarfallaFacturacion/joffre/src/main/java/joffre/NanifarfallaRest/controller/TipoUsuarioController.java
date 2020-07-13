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
import joffre.NanifarfallaRest.model.TipoUsuario;
import joffre.NanifarfallaRest.repository.TipoUsuarioRepository;


@RestController
@RequestMapping("/apiTipoUsuario")
public class TipoUsuarioController {
	private static final Log LOGGER = LogFactory.getLog(TipoUsuarioController.class);
	@Autowired
	TipoUsuarioRepository tipoUsuarioRepository;
	@GetMapping("/detallesTiposUsuario")
	public List<TipoUsuario> getAllTiposUsuario() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoUsuarioRepository.findAll();
	}
	
	
	@PostMapping("/AddTipoUsuario")
	public TipoUsuario createTipoUsuario(@Valid @RequestBody TipoUsuario tipousuario) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoUsuarioRepository.save(tipousuario);
	}

	@GetMapping("/TipoUsuario/{id}")
	public TipoUsuario getTipoUsuarioById(@PathVariable(value = "id") int tipousuarioId) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoUsuarioRepository.findById(tipousuarioId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoUsuario", "id", tipousuarioId));
	}
	
	
	@PutMapping("/TipoUsuarioSave/{id}")
	public TipoUsuario updateTipoUsuario(@PathVariable(value = "id") int tipousuarioId,
			@Valid @RequestBody TipoUsuario tipousuarioDetails) {

		TipoUsuario tipousuario = tipoUsuarioRepository.findById(tipousuarioId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoUsuario", "id", tipousuarioId));
		tipousuario.setNombre_tipousuario(tipousuarioDetails.getNombre_tipousuario());
		tipousuario.setClaveApi(tipousuarioDetails.getClaveApi());
	    tipousuario.setUsuario(tipousuarioDetails.getUsuario());
	    tipousuario.setVersion(tipousuarioDetails.getVersion());

		TipoUsuario updatedTipousuario = tipoUsuarioRepository.save(tipousuario);
		LOGGER.info("METHOD: 'updateTipoUsuario'--PARAMS: '" + tipousuarioDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedTipousuario;
	}

	@DeleteMapping("/TipoUsuarioDelete/{id}")
	public ResponseEntity<?> deleteTipoUsuario(@PathVariable(value = "id") int tipousuarioId) {
		TipoUsuario tipousuario = tipoUsuarioRepository.findById(tipousuarioId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoUsuario", "id", tipousuarioId));

		tipoUsuarioRepository.delete(tipousuario);
		LOGGER.info("METHOD: 'deleteTipoUsuario'--PARAMS: '" + tipousuario + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	//http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
