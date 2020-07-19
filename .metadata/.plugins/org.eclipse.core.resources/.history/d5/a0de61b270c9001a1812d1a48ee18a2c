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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaAnuncio;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaAnuncioRepository;

@RestController
@RequestMapping("/apiAuditoriaArea")
public class AuditoriaAnuncioController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaAnuncioController.class);

	@Autowired
	AuditoriaAnuncioRepository auditoriaAnuncioRepository;

	@GetMapping("/auditoriaanuncioss")
	public List<AuditoriaAnuncio> getAllAuditoriaAnuncios() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaAnuncioRepository.findAll();
	}

	@GetMapping("/auditoriaanuncio/{id}")
	public AuditoriaAnuncio getAuditoriaAnuncioById(@PathVariable(value = "id") int audianuncioId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaAnuncioRepository.findById(audianuncioId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaAnuncio", "id", audianuncioId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
