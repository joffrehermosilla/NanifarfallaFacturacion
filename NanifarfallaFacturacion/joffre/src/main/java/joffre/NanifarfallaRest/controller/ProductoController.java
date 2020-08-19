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
import joffre.NanifarfallaRest.model.Producto;
import joffre.NanifarfallaRest.repository.ProductoRepository;

@RestController
@RequestMapping("/apiProducto")
public class ProductoController {
	private static final Log LOGGER = LogFactory.getLog(ProductoController.class);
	@Autowired
	ProductoRepository productoRepository;

	@GetMapping("/productos")
	public List<Producto> getAllProductos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return productoRepository.findAll();
	}

	@PostMapping("/Addproducto")
	public Producto createProducto(@Valid @RequestBody Producto producto) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return productoRepository.save(producto);
	}

	@GetMapping("/producto/{id}")
	public Producto getProductoById(@PathVariable(value = "id") int productoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return productoRepository.findById(productoId)
				.orElseThrow(() -> new ResourceNotFoundException("Producto", "id", productoId));
	}

	@PutMapping("/productos/{id}")
	public Producto updateProducto(@PathVariable(value = "id") int productoId,
			@Valid @RequestBody Producto productoDetails) {

		Producto producto = productoRepository.findById(productoId)
				.orElseThrow(() -> new ResourceNotFoundException("Producto", "id", productoId));

		producto.setClaveApi(productoDetails.getClaveApi());
		producto.setColores_producto(productoDetails.getColores_producto());
		producto.setEstadoproducto(productoDetails.getEstadoproducto());
		producto.setFoto_ruta(productoDetails.getFoto_ruta());
		producto.setFoto_ruta1(productoDetails.getFoto_ruta());
		producto.setFoto_ruta2(productoDetails.getFoto_ruta2());
		producto.setFoto_ruta3(productoDetails.getFoto_ruta3());
		producto.setFoto_ruta4(productoDetails.getFoto_ruta4());
		producto.setIngreso_almacen_producto(productoDetails.getIngreso_almacen_producto());
		producto.setLinea(productoDetails.getLinea());
		producto.setmEstadoproducto(productoDetails.getEstadoproducto());
		producto.setmLinea(productoDetails.getLinea());
		producto.setmTipoproducto(productoDetails.getmTipoproducto());
		producto.setNombre_producto(productoDetails.getNombre_producto());
		producto.setPreparacion_producto(productoDetails.getPreparacion_producto());
		producto.setProductoxpedido(productoDetails.getProductoxpedido());
		producto.setPvf_producto(productoDetails.getPvf_producto());
		producto.setPvv_producto(productoDetails.getPvv_producto());
		producto.setQr_producto(productoDetails.getQr_producto());
		producto.setRecetasproductosinsumos(productoDetails.getRecetasproductosinsumos());
		producto.setSalida_almacen_producto(productoDetails.getSalida_almacen_producto());
		producto.setIngreso_almacen_producto(productoDetails.getIngreso_almacen_producto());
		producto.setVersion(productoDetails.getVersion());
		producto.setClienteTienePreferencia(productoDetails.getClienteTienePreferencia());

		Producto updatedProducto = productoRepository.save(producto);
		LOGGER.info("METHOD: 'updateProducto'--PARAMS: '" + productoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedProducto;
	}

	@DeleteMapping("/producto/{id}")
	public ResponseEntity<?> deleteProducto(@PathVariable(value = "id") int productoId) {
		Producto producto = productoRepository.findById(productoId)
				.orElseThrow(() -> new ResourceNotFoundException("Producto", "id", productoId));

		productoRepository.delete(producto);
		LOGGER.info("METHOD: 'deleteArea'--PARAMS: '" + producto + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
