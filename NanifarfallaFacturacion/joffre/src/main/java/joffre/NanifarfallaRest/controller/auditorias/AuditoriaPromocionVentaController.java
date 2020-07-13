package joffre.NanifarfallaRest.controller.auditorias;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
import joffre.NanifarfallaRest.model.auditorias.AuditoriaPromocionVenta;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaPromocionVentaRepository;

@RestController
@RequestMapping("/apiAuditoriaPromocionVenta")
public class AuditoriaPromocionVentaController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaPromocionVentaController.class);

	@Autowired
	AuditoriaPromocionVentaRepository auditoriaPromocionVentaRepository;
	
	@GetMapping("/AuditoriaPromocionVenta")
	public List<AuditoriaPromocionVenta> getAllAuditoriaPromocionVenta() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaPromocionVentaRepository.findAll();
	}

	@GetMapping("/auditoriapromocionventa/{id}")
	public AuditoriaPromocionVenta getAuditoriaPromocionVentaById(@PathVariable(value = "id") int AuditoriaPromocionVentaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaPromocionVentaRepository.findById(AuditoriaPromocionVentaId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaPromocionVenta", "id", AuditoriaPromocionVentaId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
		
	
}
