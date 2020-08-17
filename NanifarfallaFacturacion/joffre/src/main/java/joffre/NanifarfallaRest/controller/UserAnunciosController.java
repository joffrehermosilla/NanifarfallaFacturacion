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
import joffre.NanifarfallaRest.model.UserAnuncios;
import joffre.NanifarfallaRest.repository.UserAnunciosRepository;

@RestController
@RequestMapping("/apiUserAnuncio")
public class UserAnunciosController {
	private static final Log LOGGER = LogFactory.getLog(UserAnunciosController.class);
	@Autowired
	UserAnunciosRepository userAnunciosRepository;

	@GetMapping("/Useranuncios")
	public List<UserAnuncios> getAllUserAnuncios() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return userAnunciosRepository.findAll();
	}

	@PostMapping("/AddUseranuncio")
	public UserAnuncios createUserAnuncio(@Valid @RequestBody UserAnuncios Useranuncio) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return userAnunciosRepository.save(Useranuncio);
	}

	@GetMapping("/Useranuncio/{id}")
	public UserAnuncios getUserAnuncioById(@PathVariable(value = "id") int useranuncioId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return userAnunciosRepository.findById(useranuncioId)
				.orElseThrow(() -> new ResourceNotFoundException("UserAnuncios", "id", useranuncioId));
	}

	@PutMapping("/Useranuncios/{id}")
	public UserAnuncios updateUserAnuncio(@PathVariable(value = "id") int useranuncioId,
			@Valid @RequestBody UserAnuncios useranuncioDetails) {

		UserAnuncios useranuncio = userAnunciosRepository.findById(useranuncioId)
				.orElseThrow(() -> new ResourceNotFoundException("UserAnuncios", "id", useranuncioId));

		useranuncio.setFecha_inicio(useranuncioDetails.getFecha_inicio());
		useranuncio.setFecha_fin(useranuncioDetails.getFecha_fin());
		useranuncio.setPrecio(useranuncioDetails.getPrecio());
		useranuncio.setVersion(useranuncioDetails.getVersion());
		useranuncio.setmAnuncio(useranuncioDetails.getmAnuncio());
		useranuncio.setmUsuario(useranuncioDetails.getmUsuario());
		useranuncio.setContratos(useranuncioDetails.getContratos());

		UserAnuncios updatedUserAnuncio = userAnunciosRepository.save(useranuncio);
		LOGGER.info("METHOD: 'updateUserAnuncio'--PARAMS: '" + useranuncioDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedUserAnuncio;
	}

	@DeleteMapping("/Useranuncio/{id}")
	public ResponseEntity<?> deleteUserAnuncio(@PathVariable(value = "id") int useranuncioId) {
		UserAnuncios useranuncio = userAnunciosRepository.findById(useranuncioId)
				.orElseThrow(() -> new ResourceNotFoundException("UserAnuncios", "id", useranuncioId));

		userAnunciosRepository.delete(useranuncio);
		LOGGER.info("METHOD: 'deleteUseranuncio'--PARAMS: '" + useranuncio + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
