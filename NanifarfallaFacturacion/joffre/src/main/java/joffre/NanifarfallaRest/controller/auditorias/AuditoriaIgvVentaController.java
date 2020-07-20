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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaIgvVenta;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaIgvVentaRepository;

@RestController
@RequestMapping("/apiAuditoriaIgvVenta")
public class AuditoriaIgvVentaController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaIgvVentaController.class);

	@Autowired
	AuditoriaIgvVentaRepository auditoriaIgvVentaRepository;

	@GetMapping("/auditoriaigvventas")
	public List<AuditoriaIgvVenta> getAllAuditoriaIgvVenta() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaIgvVentaRepository.findAll();
	}

	@GetMapping("/auditoriaigvVenta/{id}")
	public AuditoriaIgvVenta getAuditoriaIgvVentaById(@PathVariable(value = "id") int audiigvVentaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaIgvVentaRepository.findById(audiigvVentaId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaIgvVenta", "id", audiigvVentaId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
