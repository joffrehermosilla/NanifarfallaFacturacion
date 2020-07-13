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
import joffre.NanifarfallaRest.model.TipoProducto;
import joffre.NanifarfallaRest.repository.TipoProductoRepository;

@RestController
@RequestMapping("/apiTipoProducto")
public class TipoProductoController {
	private static final Log LOGGER = LogFactory.getLog(TipoProductoController.class);
	@Autowired
	TipoProductoRepository tipoProductoRepository;
	
	@GetMapping("/tiposproducto")
	public List<TipoProducto> getAllTipoProductos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoProductoRepository.findAll();
	}

	@PostMapping("/Addarea")
	public TipoProducto createTipoProducto(@Valid @RequestBody TipoProducto tipoproducto) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoProductoRepository.save(tipoproducto);
	}

	@GetMapping("/tipoproducto/{id}")
	public TipoProducto getTipoProductoById(@PathVariable(value = "id") int tipoProductoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return tipoProductoRepository.findById(tipoProductoId).orElseThrow(() -> new ResourceNotFoundException("TipoProducto", "id", tipoProductoId));
	}

	@PutMapping("/tipoproductos/{id}")
	public TipoProducto updateTipoProducto(@PathVariable(value = "id") int tipoProductoId, @Valid @RequestBody TipoProducto tipoproductoDetails) {

		TipoProducto tipoproducto = tipoProductoRepository.findById(tipoProductoId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoProducto", "id", tipoProductoId));
		
		tipoproducto.setNombre_tipoproducto(tipoproductoDetails.getNombre_tipoproducto());
		tipoproducto.setPrecio_costo(tipoproductoDetails.getPrecio_costo());
		tipoproducto.setTiempo_produccion(tipoproductoDetails.getTiempo_produccion());
		tipoproducto.setFoto_ruta(tipoproductoDetails.getFoto_ruta());
		tipoproducto.setClaveApi(tipoproductoDetails.getClaveApi());
		tipoproducto.setVersion(tipoproductoDetails.getVersion());
		tipoproducto.setProductos(tipoproductoDetails.getProductos());
		
		
		
	

		TipoProducto updatedTipoProducto = tipoProductoRepository.save(tipoproducto);
		LOGGER.info("METHOD: 'updateTipoProducto'--PARAMS: '" + tipoproductoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedTipoProducto;
	}

	@DeleteMapping("/tipoproducto/{id}")
	public ResponseEntity<?> deleteTipoProducto(@PathVariable(value = "id") int tipoproductoId) {
		TipoProducto tipoproducto = tipoProductoRepository.findById(tipoproductoId)
				.orElseThrow(() -> new ResourceNotFoundException("TipoProducto", "id", tipoproductoId));

		tipoProductoRepository.delete(tipoproducto);
		LOGGER.info("METHOD: 'deleteTipoProducto'--PARAMS: '" + tipoproducto + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
}
