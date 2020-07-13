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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaElaboracionProducto;

import joffre.NanifarfallaRest.repository.auditorias.AuditoriaElaboracionProductoRepository;

@RestController
@RequestMapping("/apiAuditoriaElaboracionProductos")
public class AuditoriaElaboracionProductoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaElaboracionProductoController.class);

	@Autowired
	AuditoriaElaboracionProductoRepository audiElaboracionProductoRepository;
	
	@GetMapping("/auditoriaElaboracionProductos")
	public List<AuditoriaElaboracionProducto> getAllAuditoriaElaboracionProductos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audiElaboracionProductoRepository.findAll();
	}

	@GetMapping("/auditoriaelaboracionproducto/{id}")
	public AuditoriaElaboracionProducto getAuditoriaElaboracionProductoById(@PathVariable(value = "id") int audielaboracionproductoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return audiElaboracionProductoRepository.findById(audielaboracionproductoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaElaboracionProducto", "id", audielaboracionproductoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
	
	
}
