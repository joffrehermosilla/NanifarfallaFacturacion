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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoClienteTienePedido;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaEstadoClienteTienePedidoRepository;

@RestController
@RequestMapping("/apiAuditoriaEstadoClienteTienePedido")
public class AuditoriaEstadoClienteTienePedidoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaEstadoClienteTienePedidoController.class);

	@Autowired
	AuditoriaEstadoClienteTienePedidoRepository auditoriaEstadoClienteTienePedido;

	@GetMapping("/auditoriaestadoclienteTienePedido")
	public List<AuditoriaEstadoClienteTienePedido> getAllAuditoriaEstadoClienteTienePedido() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaEstadoClienteTienePedido.findAll();
	}

	@GetMapping("/auditoriaarea/{id}")
	public AuditoriaEstadoClienteTienePedido getAuditoriaEstadoClienteTienePedidoById(
			@PathVariable(value = "id") int audiestadoclientetienepedidoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaEstadoClienteTienePedido.findById(audiestadoclientetienepedidoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaEstadoClienteTienePedido", "id",
						audiestadoclientetienepedidoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
