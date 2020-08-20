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
import joffre.NanifarfallaRest.model.Cliente;
import joffre.NanifarfallaRest.repository.ClienteRepository;

@RestController
@RequestMapping("/apiCliente")
public class ClienteController {
	private static final Log LOGGER = LogFactory.getLog(ClienteController.class);
	@Autowired
	ClienteRepository clienterepository;

	@GetMapping("/cliente")
	public List<Cliente> getAllCliente() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return clienterepository.findAll();
	}

	@PostMapping("/AddCliente")
	public Cliente createCliente(@Valid @RequestBody Cliente cliente) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return clienterepository.save(cliente);
	}

	@GetMapping("/cliente/{id}")
	public Cliente getClienteById(@PathVariable(value = "id") int clienteId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return clienterepository.findById(clienteId)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente", "id", clienteId));
	}

	@PutMapping("/cliente/{id}")
	public Cliente updateCliente(@PathVariable(value = "id") int clienteId,
			@Valid @RequestBody Cliente clienteDetails) {

		Cliente cliente = clienterepository.findById(clienteId)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente", "id", clienteId));

		cliente.setUsuario(clienteDetails.getUsuario());
		cliente.setRegimen_cliente(clienteDetails.getRegimen_cliente());
		cliente.setEstado_cliente(clienteDetails.getEstado_cliente());
		cliente.setLatitud_cliente(clienteDetails.getLatitud_cliente());
		cliente.setLongitud_cliente(clienteDetails.getLongitud_cliente());
		cliente.setType_cliente(clienteDetails.getType_cliente());
		cliente.setFoto_ruta(clienteDetails.getFoto_ruta());
		cliente.setRuc_cliente(clienteDetails.getRuc_cliente());
		cliente.setDni_cliente(clienteDetails.getDni_cliente());
		cliente.setFecha_empadronamiento_cliente(clienteDetails.getFecha_empadronamiento_cliente());
		cliente.setClaveApi(clienteDetails.getClaveApi());
		cliente.setCliente_tiene_pedido(clienteDetails.getCliente_tiene_pedido());
		cliente.setmEstado_cliente(clienteDetails.getmEstado_cliente());
		cliente.setmRegimen_cliente(clienteDetails.getmRegimen_cliente());
		cliente.setmUsuario(clienteDetails.getmUsuario());
		cliente.setVersion(clienteDetails.getVersion());
		cliente.setContratos(clienteDetails.getContratos());
		cliente.setClienteTienePreferencia(clienteDetails.getClienteTienePreferencia());

		Cliente updatedEstadoCliente = clienterepository.save(cliente);
		LOGGER.info("METHOD: 'updateCliente'--PARAMS: '" + clienteDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedEstadoCliente;
	}

	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<?> deleteCliente(@PathVariable(value = "id") int clienteId) {
		Cliente cliente = clienterepository.findById(clienteId)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente", "id", clienteId));

		clienterepository.delete(cliente);
		LOGGER.info("METHOD: 'deleteCliente'--PARAMS: '" + cliente + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
