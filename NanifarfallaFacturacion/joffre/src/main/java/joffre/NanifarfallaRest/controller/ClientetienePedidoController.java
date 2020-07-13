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
import joffre.NanifarfallaRest.model.Cliente_tiene_pedido;
import joffre.NanifarfallaRest.repository.ClientetienePedidoRepository;


@RestController
@RequestMapping("/apiClienteTienePedido")
public class ClientetienePedidoController {

	private static final Log LOGGER = LogFactory.getLog(ClientetienePedidoController.class);
	@Autowired
	ClientetienePedidoRepository clientetienepedidorepository;

	@GetMapping("/ClienteTienePedido")
	public List<Cliente_tiene_pedido> getAllClientetienePedido() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return clientetienepedidorepository.findAll();
	}

	@PostMapping("/AddClientetienePedido")
	public Cliente_tiene_pedido createClienteTienePedido(@Valid @RequestBody Cliente_tiene_pedido clientetienepedido) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return clientetienepedidorepository.save(clientetienepedido);
	}

	@GetMapping("/ClientetienePedido/{id}")
	public Cliente_tiene_pedido getClientetienePedidoById(@PathVariable(value = "id") int clientetienepedidoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return clientetienepedidorepository.findById(clientetienepedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente_tiene_pedido", "id", clientetienepedidoId));
	}

	@PutMapping("/ClientetienePedido/{id}")
	public Cliente_tiene_pedido updateClienteTienePedido(@PathVariable(value = "id") int clientetienepedidoId,
			@Valid @RequestBody Cliente_tiene_pedido clientetienepedidoDetails) {

		Cliente_tiene_pedido clientetienepedido = clientetienepedidorepository.findById(clientetienepedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente_tiene_pedido", "id", clientetienepedidoId));


		clientetienepedido.setClaveApi(clientetienepedidoDetails.getClaveApi());

		Cliente_tiene_pedido updatedClientetienePedido = clientetienepedidorepository.save(clientetienepedido);
		LOGGER.info("METHOD: 'updateClienteTienePedido'--PARAMS: '" + clientetienepedidoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedClientetienePedido;
	}

	@DeleteMapping("/clienteTienePedido/{id}")
	public ResponseEntity<?> deleteClienteTienePedido(@PathVariable(value = "id") int clientetienepedidoId) {
		Cliente_tiene_pedido clientetienepedido = clientetienepedidorepository.findById(clientetienepedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente_tiene_pedido", "id", clientetienepedidoId));

		clientetienepedidorepository.delete(clientetienepedido);
		LOGGER.info("METHOD: 'deleteClienteTienePedido'--PARAMS: '" + clientetienepedido + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
