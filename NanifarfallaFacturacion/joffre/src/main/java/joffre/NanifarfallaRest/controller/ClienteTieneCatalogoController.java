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
import joffre.NanifarfallaRest.model.ClienteTieneCatalogo;
import joffre.NanifarfallaRest.repository.ClienteTieneCatalogoRepository;

@RestController
@RequestMapping("/apiClienteTieneCatalogoController")
public class ClienteTieneCatalogoController {

	private static final Log LOGGER = LogFactory.getLog(ClienteTieneCatalogoController.class);
	@Autowired
	ClienteTieneCatalogoRepository clienteTieneCatalogoRepository;

	@GetMapping("/ClienteTieneCatalogos")
	public List<ClienteTieneCatalogo> getAllClienteTieneCatalogo() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return clienteTieneCatalogoRepository.findAll();
	}

	@PostMapping("/AddClienteTieneCatalogoa")
	public ClienteTieneCatalogo createClienteTieneCatalogo(
			@Valid @RequestBody ClienteTieneCatalogo clienteTieneCatalogo) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return clienteTieneCatalogoRepository.save(clienteTieneCatalogo);
	}

	@GetMapping("/ClienteTieneCatalogo/{id}")
	public ClienteTieneCatalogo getClienteTieneCatalogoById(@PathVariable(value = "id") int clienteTieneCatalogoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return clienteTieneCatalogoRepository.findById(clienteTieneCatalogoId)
				.orElseThrow(() -> new ResourceNotFoundException("ClienteTieneCatalogo", "id", clienteTieneCatalogoId));
	}

	@PutMapping("/ClienteTieneCatalogos/{id}")
	public ClienteTieneCatalogo updateClienteTieneCatalogo(@PathVariable(value = "id") int clienteTieneCatalogoId,
			@Valid @RequestBody ClienteTieneCatalogo clientetienecatalogoDetails) {

		ClienteTieneCatalogo clientetienecatalogo = clienteTieneCatalogoRepository.findById(clienteTieneCatalogoId)
				.orElseThrow(() -> new ResourceNotFoundException("ClienteTieneCatalogo", "id", clienteTieneCatalogoId));

		clientetienecatalogo.setmCliente(clientetienecatalogoDetails.getmCliente());
		clientetienecatalogo.setClaveApi(clientetienecatalogoDetails.getClaveApi());
		clientetienecatalogo.setFecha_fin(clientetienecatalogoDetails.getFecha_fin());
		clientetienecatalogo.setFecha_inicio(clientetienecatalogoDetails.getFecha_inicio());
		clientetienecatalogo.setmCatalogo(clientetienecatalogoDetails.getmCatalogo());
		clientetienecatalogo.setPrecio(clientetienecatalogoDetails.getPrecio());
		clientetienecatalogo.setVersion(clientetienecatalogoDetails.getVersion());

		ClienteTieneCatalogo updatedclienteTieneCatalogoRepository = clienteTieneCatalogoRepository
				.save(clientetienecatalogo);
		LOGGER.info("METHOD: 'updateClienteTieneCatalogo'--PARAMS: '" + clientetienecatalogoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedclienteTieneCatalogoRepository;
	}

	@DeleteMapping("/clientetienecatalogo/{id}")
	public ResponseEntity<?> deleteclientetienecatalogo(@PathVariable(value = "id") int clienteTieneCatalogoId) {
		ClienteTieneCatalogo clientetienecatalogo = clienteTieneCatalogoRepository.findById(clienteTieneCatalogoId)
				.orElseThrow(() -> new ResourceNotFoundException("ClienteTieneCatalogo", "id", clienteTieneCatalogoId));

		clienteTieneCatalogoRepository.delete(clientetienecatalogo);
		LOGGER.info("METHOD: 'deleteClienteTieneCatalogo'--PARAMS: '" + clientetienecatalogo + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
