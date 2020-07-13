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
import joffre.NanifarfallaRest.model.IgvVenta;
import joffre.NanifarfallaRest.repository.IgvVentaRepository;

@RestController
@RequestMapping("/apiIgvVenta")
public class IgvVentaController {
	private static final Log LOGGER = LogFactory.getLog(IgvVentaController.class);
	@Autowired
	IgvVentaRepository igvVentarepository;

	@GetMapping("/igvVenta")
	public List<IgvVenta> getAllIgvVenta() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return igvVentarepository.findAll();
	}

	@PostMapping("/AddIgvVenta")
	public IgvVenta createIgvVenta(@Valid @RequestBody IgvVenta igvventa) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return igvVentarepository.save(igvventa);
	}

	@GetMapping("/IgvVenta/{id}")
	public IgvVenta getIgvVentaById(@PathVariable(value = "id") int igvventaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return igvVentarepository.findById(igvventaId)
				.orElseThrow(() -> new ResourceNotFoundException("IgvVenta", "id", igvventaId));
	}

	@PutMapping("/IgvVenta/{id}")
	public IgvVenta updateIgvVenta(@PathVariable(value = "id") int igvventaId,
			@Valid @RequestBody IgvVenta igvVentaDetails) {

		IgvVenta igvVenta = igvVentarepository.findById(igvventaId)
				.orElseThrow(() -> new ResourceNotFoundException("IgvVenta", "id", igvventaId));

		igvVenta.setClientetienepedido(igvVentaDetails.getClientetienepedido());
		igvVenta.setTipoimpuesto(igvVentaDetails.getTipoimpuesto());
		igvVenta.setPorcentaje_igv(igvVentaDetails.getPorcentaje_igv());
		igvVenta.setClaveApi(igvVentaDetails.getClaveApi());

		IgvVenta updatedIgvVenta = igvVentarepository.save(igvVenta);
		LOGGER.info("METHOD: 'updateIgvVenta'--PARAMS: '" + igvVentaDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedIgvVenta;
	}

	@DeleteMapping("/igvVenta/{id}")
	public ResponseEntity<?> deleteIgvVenta(@PathVariable(value = "id") int igvventaId) {
		IgvVenta igvVenta = igvVentarepository.findById(igvventaId)
				.orElseThrow(() -> new ResourceNotFoundException("IgvVenta", "id", igvventaId));

		igvVentarepository.delete(igvVenta);
		LOGGER.info("METHOD: 'deleteIgvVenta'--PARAMS: '" + igvVenta + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
