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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaEstadoProducto;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaEstadoProductoRepository;

@RestController
@RequestMapping("/apiAuditoriaEstadoProducto")
public class AuditoriaEstadoProductoController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaEstadoProductoController.class);
	@Autowired
	AuditoriaEstadoProductoRepository auditoriaEstadoProductoRepository;

	@GetMapping("/auditoriaestadoproducto")
	public List<AuditoriaEstadoProducto> getAllAuditoriaEstadoProductos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaEstadoProductoRepository.findAll();
	}

	@GetMapping("/auditoriaestadoproducto/{id}")
	public AuditoriaEstadoProducto getAuditoriaEstadoProductoById(
			@PathVariable(value = "id") int audiestadoproductoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaEstadoProductoRepository.findById(audiestadoproductoId).orElseThrow(
				() -> new ResourceNotFoundException("AuditoriaEstadoProducto", "id", audiestadoproductoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
