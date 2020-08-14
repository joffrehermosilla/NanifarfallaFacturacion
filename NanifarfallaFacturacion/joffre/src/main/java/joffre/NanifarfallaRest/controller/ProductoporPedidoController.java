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
import joffre.NanifarfallaRest.model.ProductoxPedido;
import joffre.NanifarfallaRest.repository.ProductoxPedidoRepository;

@RestController
@RequestMapping("/apiProductoporPedido")
public class ProductoporPedidoController {
	private static final Log LOGGER = LogFactory.getLog(ProductoporPedidoController.class);
	@Autowired
	ProductoxPedidoRepository productoxpedidorepository;

	@GetMapping("/ProductoxPedido")
	public List<ProductoxPedido> getAllProductoxPedido() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return productoxpedidorepository.findAll();
	}

	@PostMapping("/AddProductoxPedido")
	public ProductoxPedido createProductoxPedido(@Valid @RequestBody ProductoxPedido productoxpedido) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return productoxpedidorepository.save(productoxpedido);
	}

	@GetMapping("/ProductoxPedido/{id}")
	public ProductoxPedido getProductoxPedidoById(@PathVariable(value = "id") int productoxpedidoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return productoxpedidorepository.findById(productoxpedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("ProductoxPedido", "id", productoxpedidoId));
	}

	@PutMapping("/ProductoxPedido/{id}")
	public ProductoxPedido updateProductoxPedido(@PathVariable(value = "id") int productoxpedidoId,
			@Valid @RequestBody ProductoxPedido productoxpedidoDetails) {

		ProductoxPedido productoxpedido = productoxpedidorepository.findById(productoxpedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("ProductoxPedido", "id", productoxpedidoId));

		productoxpedido.setClaveApi(productoxpedidoDetails.getClaveApi());
		productoxpedido.setCantidad_producto(productoxpedidoDetails.getCantidad_producto());
		productoxpedido.setClientetienepedido(productoxpedidoDetails.getClientetienepedido());
		productoxpedido.setDescuento_promocion(productoxpedidoDetails.getDescuento_promocion());
		productoxpedido.setmClientetienepedido(productoxpedidoDetails.getmClientetienepedido());
		productoxpedido.setmProducto(productoxpedidoDetails.getmProducto());
		productoxpedido.setProducto(productoxpedidoDetails.getProducto());
		productoxpedido.setValor_con_igv(productoxpedidoDetails.getValor_con_igv());
		productoxpedido.setValor_neto(productoxpedidoDetails.getValor_neto());
		productoxpedido.setVersion(productoxpedidoDetails.getVersion());

		ProductoxPedido updatedProductoxPedido = productoxpedidorepository.save(productoxpedido);
		LOGGER.info("METHOD: 'updateProductoxPedido'--PARAMS: '" + productoxpedidoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedProductoxPedido;
	}

	@DeleteMapping("/productoxPedido/{id}")
	public ResponseEntity<?> deleteProductoxPedido(@PathVariable(value = "id") int productoxpedidoId) {
		ProductoxPedido productoxpedido = productoxpedidorepository.findById(productoxpedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("ProductoxPedido", "id", productoxpedidoId));

		productoxpedidorepository.delete(productoxpedido);
		LOGGER.info("METHOD: 'deleteProductoxPedido'--PARAMS: '" + productoxpedido + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
