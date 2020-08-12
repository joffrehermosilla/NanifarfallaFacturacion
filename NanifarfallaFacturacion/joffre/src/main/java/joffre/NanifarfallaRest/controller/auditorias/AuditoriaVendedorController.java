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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaVendedor;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaVendedorRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaVendedorController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaVendedorController.class);

	@Autowired
	AuditoriaVendedorRepository auditoriaVendedorRepository;

	@GetMapping("/AuditoriaVendedor")
	public List<AuditoriaVendedor> getAllAuditoriaVendedor() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaVendedorRepository.findAll();
	}

	@GetMapping("/AuditoriaVendedor/{id}")
	public AuditoriaVendedor getAuditoriaVendedorById(@PathVariable(value = "id") int AuditoriaVendedoraId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaVendedorRepository.findById(AuditoriaVendedoraId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaVendedor", "id", AuditoriaVendedoraId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
