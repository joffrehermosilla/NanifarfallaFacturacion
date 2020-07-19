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
import joffre.NanifarfallaRest.model.auditorias.AuditoriaUserAnuncio;
import joffre.NanifarfallaRest.repository.auditorias.AuditoriaUserAnuncioRepository;

@RestController
@RequestMapping("/apiAuditoriaUserAnuncio")
public class AuditoriaUserAnuncioController {
	private static final Log LOGGER = LogFactory.getLog(AuditoriaUserAnuncioController.class);

	@Autowired
	AuditoriaUserAnuncioRepository auditoriaUserAnuncioRepository;

	@GetMapping("/auditoriaUseranuncioss")
	public List<AuditoriaUserAnuncio> getAllAuditoriaUserAnuncios() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaUserAnuncioRepository.findAll();
	}

	@GetMapping("/auditoriaUseranuncio/{id}")
	public AuditoriaUserAnuncio getAuditoriaUserAnuncioById(@PathVariable(value = "id") int audiUseranuncioId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return auditoriaUserAnuncioRepository.findById(audiUseranuncioId)
				.orElseThrow(() -> new ResourceNotFoundException("AuditoriaUserAnuncio", "id", audiUseranuncioId));
	}

	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
