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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaTipoProducto;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaTipoProductoRepository;

@RestController
@RequestMapping("/apiAuditoriaTipoProducto")
public class AuditoriaTipoProductoController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaTipoProductoController.class);

	@Autowired
	AuditoriaTipoProductoRepository auditoriaTipoProductoRepository;
	@GetMapping("/auditoriatipoProducto")
	
	
	public List<AuditoriaTipoProducto> getAllAuditoriaTipoProducto() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaTipoProductoRepository.findAll();
	}

	@GetMapping("/auditoriaarea/{id}")
	public AuditoriaTipoProducto getAuditoriaTipoProductoById(@PathVariable(value = "id") int auditipoProductoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaTipoProductoRepository.findById(auditipoProductoId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaTipoProducto", "id", auditipoProductoId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
	
}
