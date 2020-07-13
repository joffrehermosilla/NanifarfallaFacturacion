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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaFacturaClienteTienePedido;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaFacturaClienteTienePedidoRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaFacturaClienteTienePedidoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaFacturaClienteTienePedidoController.class);

	@Autowired
	AuditoriaFacturaClienteTienePedidoRepository auditoriaFacturaClienteTienePedidoRepository;

	@GetMapping("/AuditoriaFacturaClienteTienePedido")
	public List<AuditoriaFacturaClienteTienePedido> getAllAuditoriaFacturaClienteTienePedidos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaFacturaClienteTienePedidoRepository.findAll();
	}

	@GetMapping("/AuditoriaFacturaClienteTienePedido/{id}")
	public AuditoriaFacturaClienteTienePedido getAuditoriaFacturaClienteTienePedidoById(
			@PathVariable(value = "id") int AuditoriaFacturaClienteTienePedidoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaFacturaClienteTienePedidoRepository.findById(AuditoriaFacturaClienteTienePedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaFacturaClienteTienePedido", "id",
						AuditoriaFacturaClienteTienePedidoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
