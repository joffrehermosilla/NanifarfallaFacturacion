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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaClienteTienePedido;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaClienteTienePedidoRepository;
@RestController
@RequestMapping("/apiAuditoriaClienteTienePedido")
public class AuditoriaClienteTienePedidoController {

	
	private static final Log LOGGER = LogFactory.getLog(AuditoriaClienteTienePedidoController.class);

	@Autowired
	AuditoriaClienteTienePedidoRepository auditoriaClienteTienePedidoRepository;
	
	@GetMapping("/auditoriaareas")
	public List<AuditoriaClienteTienePedido> getAllAuditoriaClienteTienePedidos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaClienteTienePedidoRepository.findAll();
	}

	@GetMapping("/AuditoriaClienteTienePedido/{id}")
	public AuditoriaClienteTienePedido getAuditoriaClienteTienePedidoById(@PathVariable(value = "id") int AuditoriaClienteTienePedidoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaClienteTienePedidoRepository.findById(AuditoriaClienteTienePedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaClienteTienePedido", "id", AuditoriaClienteTienePedidoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
