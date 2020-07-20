package joffre.NanifarfallaRest.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
import joffre.NanifarfallaRest.model.Anuncio;
import joffre.NanifarfallaRest.repository.AnuncioRepository;

@RestController
@RequestMapping("/apiAnuncio")
public class AnuncioController {
	private static final Log LOGGER = LogFactory.getLog(AnuncioController.class);
	@Autowired
	AnuncioRepository anuncioRepository;

	@GetMapping("/anuncios")
	public List<Anuncio> getAllAnuncios() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return anuncioRepository.findAll();
	}

	@PostMapping("/Addanuncio")
	public Anuncio createAnuncio(@Valid @RequestBody Anuncio anuncio) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return anuncioRepository.save(anuncio);
	}

	@GetMapping("/anuncio/{id}")
	public Anuncio getAnuncioById(@PathVariable(value = "id") int anuncioId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return anuncioRepository.findById(anuncioId)
				.orElseThrow(() -> new ResourceNotFoundException("Anuncio", "id", anuncioId));
	}

	@PutMapping("/anuncios/{id}")
	public Anuncio updateAnuncio(@PathVariable(value = "id") int anuncioId,
			@Valid @RequestBody Anuncio anuncioDetails) {

		Anuncio anuncio = anuncioRepository.findById(anuncioId)
				.orElseThrow(() -> new ResourceNotFoundException("Anuncio", "id", anuncioId));

		anuncio.setMensaje_anuncio(anuncioDetails.getMensaje_anuncio());
		anuncio.setAnuncio_principal(anuncioDetails.getAnuncio_principal());
		anuncio.setLink_mensaje(anuncioDetails.getLink_mensaje());
		anuncio.setPie_mensaje(anuncioDetails.getPie_mensaje());
		anuncio.setPrecio(anuncioDetails.getPrecio());
		anuncio.setRuta_imagen(anuncioDetails.getRuta_imagen());
		anuncio.setVersion(anuncioDetails.getVersion());
		anuncio.setUseranuncios(anuncioDetails.getUseranuncios());
		anuncio.setClaveApi(anuncioDetails.getAnuncio_principal());
		
		
		
		Anuncio updatedAnuncio = anuncioRepository.save(anuncio);
		LOGGER.info("METHOD: 'updateAnuncio'--PARAMS: '" + anuncioDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedAnuncio;
	}

	@DeleteMapping("/anuncio/{id}")
	public ResponseEntity<?> deleteAnuncio(@PathVariable(value = "id") int anuncioId) {
		Anuncio anuncio = anuncioRepository.findById(anuncioId)
				.orElseThrow(() -> new ResourceNotFoundException("Anuncio", "id", anuncioId));

		anuncioRepository.delete(anuncio);
		LOGGER.info("METHOD: 'deleteanuncio'--PARAMS: '" + anuncio + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
