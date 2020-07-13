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
import joffre.NanifarfallaRest.model.PromocionVenta;
import joffre.NanifarfallaRest.repository.PromocionVentaRepository;

@RestController
@RequestMapping("/apiPromocionVenta")
public class PromocionVentaController {
	private static final Log LOGGER = LogFactory.getLog(PromocionVentaController.class);
	@Autowired
	PromocionVentaRepository promocionventarepository;

	@GetMapping("/promocionVenta")
	public List<PromocionVenta> getAllPromocionVenta() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return promocionventarepository.findAll();
	}

	@PostMapping("/AddPromocionVenta")
	public PromocionVenta createPromocionVenta(@Valid @RequestBody PromocionVenta promocionventa) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return promocionventarepository.save(promocionventa);
	}

	@GetMapping("/promocionVenta/{id}")
	public PromocionVenta getPromocionVentaById(@PathVariable(value = "id") int promocionventaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return promocionventarepository.findById(promocionventaId)
				.orElseThrow(() -> new ResourceNotFoundException("PromocionVenta", "id", promocionventaId));
	}

	@PutMapping("/promocionVenta/{id}")
	public PromocionVenta updatePromocionVenta(@PathVariable(value = "id") int promocionventaId,
			@Valid @RequestBody PromocionVenta promocionventaDetails) {

		PromocionVenta promocionventa = promocionventarepository.findById(promocionventaId)
				.orElseThrow(() -> new ResourceNotFoundException("PromocionVenta", "id", promocionventaId));
		promocionventa.setCantidad_sku_pedido(promocionventaDetails.getCantidad_sku_pedido());
		promocionventa.setDescuento_sku_pedido(promocionventaDetails.getDescuento_sku_pedido());
		promocionventa.setFecha_inicio_promocion(promocionventaDetails.getFecha_inicio_promocion());
		promocionventa.setFecha_expiracion_promocion(promocionventaDetails.getFecha_expiracion_promocion());
		promocionventa.setDescripcion_promocion(promocionventaDetails.getDescripcion_promocion());
		promocionventa.setClaveApi(promocionventaDetails.getClaveApi());
		promocionventa.setVersion(promocionventaDetails.getVersion());
		promocionventa.setCliente_tiene_pedido(promocionventaDetails.getCliente_tiene_pedido());
		
		
		PromocionVenta updatedPromocionVenta = promocionventarepository.save(promocionventa);
		LOGGER.info("METHOD: 'updatePromocionVenta'--PARAMS: '" + promocionventaDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedPromocionVenta;
	}

	@DeleteMapping("/promocionVenta/{id}")
	public ResponseEntity<?> deletePromocionVenta(@PathVariable(value = "id") int promocionventaId) {
		PromocionVenta promocionventa = promocionventarepository.findById(promocionventaId)
				.orElseThrow(() -> new ResourceNotFoundException("PromocionVenta", "id", promocionventaId));

		promocionventarepository.delete(promocionventa);
		LOGGER.info("METHOD: 'deletePromocionVenta'--PARAMS: '" + promocionventa + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
