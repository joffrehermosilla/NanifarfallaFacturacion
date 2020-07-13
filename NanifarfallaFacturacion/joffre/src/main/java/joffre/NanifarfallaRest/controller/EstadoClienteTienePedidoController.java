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
import joffre.NanifarfallaRest.model.Estado_clientetienepedido;
import joffre.NanifarfallaRest.repository.Estado_clientetienePedidoRepository;

@RestController
@RequestMapping("/apiEstadoClienteTienePedido")
public class EstadoClienteTienePedidoController {

	private static final Log LOGGER = LogFactory.getLog(EstadoClienteTienePedidoController.class);
	@Autowired
	Estado_clientetienePedidoRepository estadoClienteTienePedidoRepository;
	
	
	@GetMapping("/estadoclientetienepedido")
	public List<Estado_clientetienepedido> getAllEstadoClienteTienePedido() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoClienteTienePedidoRepository.findAll();
	}

	@PostMapping("/AddEstadoClienteTienePedido")
	public Estado_clientetienepedido createEstadoClienteTienePedido(@Valid @RequestBody Estado_clientetienepedido estadoclientetienepedido) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoClienteTienePedidoRepository.save(estadoclientetienepedido);
	}

	@GetMapping("/estadoclientetienepedido/{id}")
	public Estado_clientetienepedido getEstadoClienteTienePedidoById(@PathVariable(value = "id") int estadoClienteTienePedidoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return estadoClienteTienePedidoRepository.findById(estadoClienteTienePedidoId).orElseThrow(() -> new ResourceNotFoundException("Estado_clientetienepedido", "id", estadoClienteTienePedidoId));
	}

	@PutMapping("/estadoclientetienepedido/{id}")
	public Estado_clientetienepedido updateEstadoClienteTienePedido(@PathVariable(value = "id") int estadoclientetienepedidoId, @Valid @RequestBody Estado_clientetienepedido estadoclientetienepedidoDetails) {

		Estado_clientetienepedido estadoclientetienepedido = estadoClienteTienePedidoRepository.findById(estadoclientetienepedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("Estado_clientetienepedido", "id", estadoclientetienepedidoId));
		
		estadoclientetienepedido.setNombre_estado_cliente_tiene_pedido(estadoclientetienepedidoDetails.getNombre_estado_cliente_tiene_pedido());
		estadoclientetienepedido.setFoto_ruta(estadoclientetienepedidoDetails.getFoto_ruta());
		estadoclientetienepedido.setClaveApi(estadoclientetienepedidoDetails.getClaveApi());
		estadoclientetienepedido.setVersion(estadoclientetienepedidoDetails.getVersion());
		estadoclientetienepedido.setCliente_tiene_pedido(estadoclientetienepedidoDetails.getCliente_tiene_pedido());

		Estado_clientetienepedido updateestadoclientetienepedido = estadoClienteTienePedidoRepository.save(estadoclientetienepedido);
		LOGGER.info("METHOD: 'updateEstado_clientetienepedido'--PARAMS: '" + estadoclientetienepedidoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updateestadoclientetienepedido;
	}

	@DeleteMapping("/area/{id}")
	public ResponseEntity<?> deleteEstadoClienteTienePedido(@PathVariable(value = "id") int estadoclientetienepedidoId) {
		Estado_clientetienepedido estadoclientetienepedido = estadoClienteTienePedidoRepository.findById(estadoclientetienepedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("Estado_clientetienepedido", "id", estadoclientetienepedidoId));

		estadoClienteTienePedidoRepository.delete(estadoclientetienepedido);
		LOGGER.info("METHOD: 'deleteestadoclientetienepedido'--PARAMS: '" + estadoclientetienepedido + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
}
