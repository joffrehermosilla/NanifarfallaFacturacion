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

import joffre.NanifarfallaRest.model.ProductoTieneColores;
import joffre.NanifarfallaRest.repository.ProductoTieneColoresRepository;

@RestController
@RequestMapping("/apiProductoTieneColor")
public class ProductoTieneColorController {
	private static final Log LOGGER = LogFactory.getLog(ProductoTieneColorController.class);
	@Autowired
	ProductoTieneColoresRepository productoTieneColorRepository;

	@GetMapping("/apiProductoTieneColores")
	public List<ProductoTieneColores> getAllAProductoTieneColores() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return productoTieneColorRepository.findAll();
	}

	@PostMapping("/AddProductoTieneColores")
	public ProductoTieneColores createProductoTieneColoresa(
			@Valid @RequestBody ProductoTieneColores productoTieneColores) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return productoTieneColorRepository.save(productoTieneColores);
	}

	@GetMapping("/ProductoTieneColores/{id}")
	public ProductoTieneColores getProductoTieneColoresById(
			@PathVariable(value = "id") int productoTieneColoresareaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return productoTieneColorRepository.findById(productoTieneColoresareaId).orElseThrow(
				() -> new ResourceNotFoundException("ProductoTieneColores", "id", productoTieneColoresareaId));
	}

	@PutMapping("/ProductoTieneColores/{id}")
	public ProductoTieneColores updateProductoTieneColores(@PathVariable(value = "id") int ProductoTieneColoresId,
			@Valid @RequestBody ProductoTieneColores ProductoTieneColoresDetails) {

		ProductoTieneColores productotienecolores = productoTieneColorRepository.findById(ProductoTieneColoresId)
				.orElseThrow(() -> new ResourceNotFoundException("ProductoTieneColores", "id", ProductoTieneColoresId));
		productotienecolores.setmColores(ProductoTieneColoresDetails.getmColores());
		productotienecolores.setmProducto(ProductoTieneColoresDetails.getmProducto());
		productotienecolores.setStock(ProductoTieneColoresDetails.getStock());
		productotienecolores.setDisponible(ProductoTieneColoresDetails.getDisponible());
		productotienecolores.setClaveApi(ProductoTieneColoresDetails.getClaveApi());
		productotienecolores.setVersion(ProductoTieneColoresDetails.getVersion());
		ProductoTieneColores updatedProductoTieneColores = productoTieneColorRepository.save(productotienecolores);
		LOGGER.info("METHOD: 'updateProductoTieneColores'--PARAMS: '" + ProductoTieneColoresDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedProductoTieneColores;
	}

	@DeleteMapping("/ProductoTieneColores/{id}")
	public ResponseEntity<?> deleteProductoTieneColores(@PathVariable(value = "id") int ProductoTieneColoresId) {
		ProductoTieneColores productotienecolores = productoTieneColorRepository.findById(ProductoTieneColoresId)
				.orElseThrow(() -> new ResourceNotFoundException("ProductoTieneColores", "id", ProductoTieneColoresId));

		productoTieneColorRepository.delete(productotienecolores);
		LOGGER.info("METHOD: 'deleteArea'--PARAMS: '" + productotienecolores + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
