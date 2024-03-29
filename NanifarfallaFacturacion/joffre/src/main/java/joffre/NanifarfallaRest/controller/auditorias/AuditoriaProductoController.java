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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaProducto;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaProductoRepository;

@RestController
@RequestMapping("/apiAuditoriaProducto")
public class AuditoriaProductoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaProductoController.class);

	@Autowired
	AuditoriaProductoRepository auditoriaProductorepository;

	@GetMapping("/auditoriaproductos")
	public List<AuditoriaProducto> getAllAuditoriaProductos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaProductorepository.findAll();
	}

	@GetMapping("/auditoriaproducto/{id}")
	public AuditoriaProducto getAuditoriaProductoById(@PathVariable(value = "id") int audiprosuctoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaProductorepository.findById(audiprosuctoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaProducto", "id", audiprosuctoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
