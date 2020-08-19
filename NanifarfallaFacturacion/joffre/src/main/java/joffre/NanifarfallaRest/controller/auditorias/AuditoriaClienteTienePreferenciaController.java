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

import joffre.NanifarfallaRest.model.auditorias.AuditoriaClienteTienePreferencia;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaClienteTienePreferenciaRepository;

@RestController
@RequestMapping("/apiAuditoriaClienteTienePreferencia")
public class AuditoriaClienteTienePreferenciaController {

	private static final Log LOGGER = LogFactory.getLog(AuditoriaClienteTienePreferenciaController.class);

	@Autowired
	AuditoriaClienteTienePreferenciaRepository auditoriaClienteTienePreferenciaRepository;

	@GetMapping("/AuditoriaClienteTienePreferencias")
	public List<AuditoriaClienteTienePreferencia> getAllAuditoriaClienteTienePreferencia() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaClienteTienePreferenciaRepository.findAll();
	}

	@GetMapping("/AuditoriaClienteTienePreferencia/{id}")
	public AuditoriaClienteTienePreferencia getauditoriaClienteTienePreferenciaRepositoryID(
			@PathVariable(value = "id") int AuditoriaClienteTienePreferenciaId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaClienteTienePreferenciaRepository.findById(AuditoriaClienteTienePreferenciaId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaClienteTienePreferencia", "id",
						AuditoriaClienteTienePreferenciaId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
