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
import joffre.NanifarfallaRest.model.Factura_ctienepedido;
import joffre.NanifarfallaRest.repository.Factura_ctienepedidoRepository;

@RestController
@RequestMapping("/apiFacturaclientetienePedido")
public class FacturaclientetienePedidoController {
	private static final Log LOGGER = LogFactory.getLog(FacturaclientetienePedidoController.class);
	@Autowired
	Factura_ctienepedidoRepository factura_ctienepedidorepository;

	@GetMapping("/facturaClientetienepedido")
	public List<Factura_ctienepedido> getAllFacturaclientetienePedido() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return factura_ctienepedidorepository.findAll();
	}

	@PostMapping("/AddFacturaClientetienepedido")
	public Factura_ctienepedido createFacturaclientetienePedido(
			@Valid @RequestBody Factura_ctienepedido facturaclientetienepedido) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return factura_ctienepedidorepository.save(facturaclientetienepedido);
	}

	@GetMapping("/facturaClientetienePedido/{id}")
	public Factura_ctienepedido getFacturaclientetienePedidoById(
			@PathVariable(value = "id") int facturaclientetieneId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return factura_ctienepedidorepository.findById(facturaclientetieneId)
				.orElseThrow(() -> new ResourceNotFoundException("Factura_ctienepedido", "id", facturaclientetieneId));
	}

	@PutMapping("/facturaClienteTienePedido/{id}")
	public Factura_ctienepedido updateFacturaclientetienePedido(@PathVariable(value = "id") int facturaclientetieneId,
			@Valid @RequestBody Factura_ctienepedido facturaClientetienePedidoDetails) {

		Factura_ctienepedido facturaclientetienepedido = factura_ctienepedidorepository.findById(facturaclientetieneId)
				.orElseThrow(() -> new ResourceNotFoundException("Factura_ctienepedido", "id", facturaclientetieneId));

		facturaclientetienepedido.setNombre_factura_cliente_tiene_pedido(
				facturaClientetienePedidoDetails.getNombre_factura_cliente_tiene_pedido());
		facturaclientetienepedido.setCliente_tiene_pedido(facturaClientetienePedidoDetails.getCliente_tiene_pedido());
		facturaclientetienepedido.setCodigo_factura_cliente_tiene_pedido(
				facturaClientetienePedidoDetails.getCodigo_factura_cliente_tiene_pedido());

		facturaclientetienepedido.setClaveApi(facturaClientetienePedidoDetails.getClaveApi());
		facturaclientetienepedido.setVersion(facturaClientetienePedidoDetails.getVersion());

		Factura_ctienepedido updatedFacturaclientetienePedido = factura_ctienepedidorepository
				.save(facturaclientetienepedido);
		LOGGER.info("METHOD: 'updateFacturaclienteTienePedido'--PARAMS: '" + facturaClientetienePedidoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedFacturaclientetienePedido;
	}

	@DeleteMapping("/facturaclientetienePedido/{id}")
	public ResponseEntity<?> deleteFacturaClienteTienePedido(@PathVariable(value = "id") int facturaclientetieneId) {
		Factura_ctienepedido facturaclientetienepedido = factura_ctienepedidorepository.findById(facturaclientetieneId)
				.orElseThrow(() -> new ResourceNotFoundException("Factura_ctienepedido", "id", facturaclientetieneId));

		factura_ctienepedidorepository.delete(facturaclientetienepedido);
		LOGGER.info("METHOD: 'deleteFacturaClienteTienePedido'--PARAMS: '" + facturaclientetienepedido + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
