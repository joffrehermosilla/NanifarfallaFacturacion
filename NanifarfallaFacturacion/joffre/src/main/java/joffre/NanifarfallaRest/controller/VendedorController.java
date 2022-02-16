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
import joffre.NanifarfallaRest.model.Vendedor;
import joffre.NanifarfallaRest.repository.VendedorRepository;

@RestController
@RequestMapping("/apiVendedor")
public class VendedorController {
	private static final Log LOGGER = LogFactory.getLog(VendedorController.class);
	@Autowired
	VendedorRepository vendedorrepository;

	@GetMapping("/vendedor")
	public List<Vendedor> getAllVendedor() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return vendedorrepository.findAll();
	}

	@PostMapping("/AddVendedor")
	public Vendedor createVendedor(@Valid @RequestBody Vendedor vendedor) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return vendedorrepository.save(vendedor);
	}

	@GetMapping("/vendedor/{id}")
	public Vendedor getVendedorById(@PathVariable(value = "id") int vendedorId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return vendedorrepository.findById(vendedorId)
				.orElseThrow(() -> new ResourceNotFoundException("Vendedor", "id", vendedorId));
	}

	@PutMapping("/vendedor/{id}")
	public Vendedor updateVendedor(@PathVariable(value = "id") int vendedorId,
			@Valid @RequestBody Vendedor vendedorDetails) {

		Vendedor vendedor = vendedorrepository.findById(vendedorId)
				.orElseThrow(() -> new ResourceNotFoundException("Vendedor", "id", vendedorId));

		vendedor.setUsuario(vendedorDetails.getUsuario());
		vendedor.setArea(vendedorDetails.getArea());
		vendedor.setCliente_tiene_pedido(vendedorDetails.getCliente_tiene_pedido());
		vendedor.setCodigo_venta_vendedor(vendedorDetails.getCodigo_venta_vendedor());
		vendedor.setClaveApi(vendedorDetails.getClaveApi());
		vendedor.setUsuario(vendedorDetails.getUsuario());
		vendedor.setVersion(vendedorDetails.getVersion());

		Vendedor updatedVendedor = vendedorrepository.save(vendedor);
		LOGGER.info("METHOD: 'updateVendedor'--PARAMS: '" + vendedorDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedVendedor;
	}

	@DeleteMapping("/vendedor/{id}")
	public ResponseEntity<?> deleteVendedor(@PathVariable(value = "id") int vendedorId) {
		Vendedor vendedor = vendedorrepository.findById(vendedorId)
				.orElseThrow(() -> new ResourceNotFoundException("Vendedor", "id", vendedorId));

		vendedorrepository.delete(vendedor);
		LOGGER.info("METHOD: 'deleteVendedor'--PARAMS: '" + vendedor + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
