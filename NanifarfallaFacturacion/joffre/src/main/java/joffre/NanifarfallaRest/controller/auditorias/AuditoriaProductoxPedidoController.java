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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaProductoxPedido;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaProductoxPedidoRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaProductoxPedidoController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaProductoxPedidoController.class);

	@Autowired
	AuditoriaProductoxPedidoRepository auditoriaProductoxPedidoRepository;

	@GetMapping("/AuditoriaProductoxPedido")
	public List<AuditoriaProductoxPedido> getAllAuditoriaProductoxPedidos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaProductoxPedidoRepository.findAll();
	}

	@GetMapping("/AuditoriaProductoxPedido/{id}")
	public AuditoriaProductoxPedido getAuditoriaProductoxPedidoById(
			@PathVariable(value = "id") int AuditoriaProductoxPedidoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaProductoxPedidoRepository.findById(AuditoriaProductoxPedidoId).orElseThrow(
				() -> new ResourceNotFoundException("AuditoriaProductoxPedido", "id", AuditoriaProductoxPedidoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
