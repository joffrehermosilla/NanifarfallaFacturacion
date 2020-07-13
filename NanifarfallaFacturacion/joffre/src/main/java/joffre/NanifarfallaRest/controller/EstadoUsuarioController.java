package joffre.NanifarfallaRest.controller;

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

import joffre.NanifarfallaRest.model.EstadoUsuario;
import joffre.NanifarfallaRest.repository.EstadoUsuarioRepository;


@RestController
@RequestMapping("/apiEstadoUsuario")
public class EstadoUsuarioController {
	@Autowired
	EstadoUsuarioRepository estadoUsuariorepository;

	private static final Log LOGGER = LogFactory.getLog(EstadoUsuarioController.class);

	@GetMapping("/detallesEstadoUsuario")
	public List<EstadoUsuario> getAllEstadoUsuario() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoUsuariorepository.findAll();
	}

	@PostMapping("/AddEstadoUsuario")
	public EstadoUsuario createEstadosUsuario(@Valid @RequestBody EstadoUsuario estadoUsuario) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoUsuariorepository.save(estadoUsuario);
	}

	@GetMapping("/estadoUsuario/{id}")
	public EstadoUsuario getEstadoUsuarioById(@PathVariable(value = "id") int estadousuarioId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoUsuariorepository.findById(estadousuarioId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoUsuario", "id", estadousuarioId));
	}

	@PutMapping("/estadoUsuario/{id}")
	public EstadoUsuario updateEstadoUsuario(@PathVariable(value = "id") int estadousuarioId,
			@Valid @RequestBody EstadoUsuario estadousuarioDetails) {

		EstadoUsuario estadousuario = estadoUsuariorepository.findById(estadousuarioId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoUsuario", "id", estadousuarioId));

		estadousuario.setNombre_estadousuario(estadousuarioDetails.getNombre_estadousuario());
		estadousuario.setUsuario(estadousuarioDetails.getUsuario());

		estadousuario.setClaveApi(estadousuarioDetails.getClaveApi());

		EstadoUsuario updatedEstadoUsuario = estadoUsuariorepository.save(estadousuario);

		LOGGER.info("METHOD: 'updateEstadoUsuario'--PARAMS: '" + estadousuarioDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedEstadoUsuario;
	}

	@DeleteMapping("/estadoUsuario/{id}")
	public ResponseEntity<?> deleteEstadoUsuario(@PathVariable(value = "id") int estadousuarioId) {
		EstadoUsuario estadousuario = estadoUsuariorepository.findById(estadousuarioId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoUsuario", "id", estadousuarioId));

		estadoUsuariorepository.delete(estadousuario);
		LOGGER.info("METHOD: 'deleteEstadoUsuario'--PARAMS: '" + estadousuario + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
