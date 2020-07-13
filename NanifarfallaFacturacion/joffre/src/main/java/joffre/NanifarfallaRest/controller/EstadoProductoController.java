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

import joffre.NanifarfallaRest.model.EstadoProducto;
import joffre.NanifarfallaRest.repository.EstadoProductoRepository;

@RestController
@RequestMapping("/apiEstadoProducto")
public class EstadoProductoController {
	private static final Log LOGGER = LogFactory.getLog(EstadoProductoController.class);
	@Autowired
	EstadoProductoRepository estadoProductoRepository;

	@GetMapping("/estadosProducto")
	public List<EstadoProducto> getAllEstadosProducto() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoProductoRepository.findAll();
	}

	@PostMapping("/AddestadoProducto")
	public EstadoProducto createEstadoProducto(@Valid @RequestBody EstadoProducto estadoProducto) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoProductoRepository.save(estadoProducto);
	}

	@GetMapping("/EstadoProducto/{id}")
	public EstadoProducto getEstadoProductoById(@PathVariable(value = "id") int estadoproductoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoProductoRepository.findById(estadoproductoId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoProducto", "id", estadoproductoId));
	}

	@PutMapping("/estadosProducto/{id}")
	public EstadoProducto updateEstadoProducto(@PathVariable(value = "id") int estadoproductoId,
			@Valid @RequestBody EstadoProducto estadoproductoDetails) {

		EstadoProducto estadoproducto = estadoProductoRepository.findById(estadoproductoId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoProducto", "id", estadoproductoId));
		estadoproducto.setNombre_estado_producto(estadoproductoDetails.getNombre_estado_producto());
		estadoproducto.setClaveApi(estadoproductoDetails.getClaveApi());
		estadoproducto.setVersion(estadoproductoDetails.getVersion());

		EstadoProducto updatedEstadoProducto = estadoProductoRepository.save(estadoproducto);
		LOGGER.info("METHOD: 'updateEstadoProducto'--PARAMS: '" + estadoproductoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedEstadoProducto;
	}

	@DeleteMapping("/estadoproducto/{id}")
	public ResponseEntity<?> deleteEstadoProducto(@PathVariable(value = "id") int estadoproductoId) {
		EstadoProducto estadoproducto = estadoProductoRepository.findById(estadoproductoId)
				.orElseThrow(() -> new ResourceNotFoundException("EstadoProducto", "id", estadoproductoId));

		estadoProductoRepository.delete(estadoproducto);
		LOGGER.info("METHOD: 'deleteEstadoProducto'--PARAMS: '" + estadoproducto + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
