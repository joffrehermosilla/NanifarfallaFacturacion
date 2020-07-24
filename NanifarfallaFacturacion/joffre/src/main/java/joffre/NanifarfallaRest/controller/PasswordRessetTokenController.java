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
import joffre.NanifarfallaRest.model.PasswordRessetToken;
import joffre.NanifarfallaRest.repository.PasswordRessetTokenRepository;

@RestController
@RequestMapping("/apiRessetTokenController")
public class PasswordRessetTokenController {
	private static final Log LOGGER = LogFactory.getLog(PasswordRessetTokenController.class);
	@Autowired
	PasswordRessetTokenRepository passwordRessetTokenRepository;

	@GetMapping("/detallespasswordRessetToken")
	public List<PasswordRessetToken> getAllPasswordRessetToken() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return passwordRessetTokenRepository.findAll();
	}

	@PostMapping("/AddPasswordRessetToken")
	public PasswordRessetToken createPasswordRessetToken(@Valid @RequestBody PasswordRessetToken passwordResetToken) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return passwordRessetTokenRepository.save(passwordResetToken);
	}

	@GetMapping("/PasswordRessetToken/{id}")
	public PasswordRessetToken getPasswordRessetTokenById(@PathVariable(value = "id") int passwordResetToken) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return passwordRessetTokenRepository.findById(passwordResetToken)
				.orElseThrow(() -> new ResourceNotFoundException("PasswordRessetToken", "id", passwordResetToken));
	}

	@PutMapping("/passwordResetToken/{id}")
	public PasswordRessetToken updatePasswordRessetToken(@PathVariable(value = "id") int passwordResetTokenId,
			@Valid @RequestBody PasswordRessetToken passwordResetTokenDetails) {

		PasswordRessetToken passwordResetToken = passwordRessetTokenRepository.findById(passwordResetTokenId)
				.orElseThrow(() -> new ResourceNotFoundException("PasswordRessetToken", "id", passwordResetTokenId));
		passwordResetToken.setExpiryDate(passwordResetTokenDetails.getExpiryDate());
		passwordResetToken.setToken(passwordResetTokenDetails.getToken());
		passwordResetToken.setVersion(passwordResetTokenDetails.getVersion());
		passwordResetToken.setmUsuario(passwordResetTokenDetails.getmUsuario());
		passwordResetToken.setClaveApi(passwordResetTokenDetails.getClaveApi());
		
		PasswordRessetToken updatedpasswordResetToken = passwordRessetTokenRepository.save(passwordResetToken);

		LOGGER.info("METHOD: 'updatePasswordRessetToken'--PARAMS: '" + passwordResetTokenDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedpasswordResetToken;
	}

	@DeleteMapping("/Usuariox/{id}")
	public ResponseEntity<?> deletePasswordRessetToken(@PathVariable(value = "id") int passwordResetTokenId) {
		PasswordRessetToken passwordResetToken = passwordRessetTokenRepository.findById(passwordResetTokenId)
				.orElseThrow(() -> new ResourceNotFoundException("PasswordRessetToken", "id", passwordResetTokenId));

		passwordRessetTokenRepository.delete(passwordResetToken);
		LOGGER.info("METHOD: 'deletePasswordRessetToken'--PARAMS: '" + passwordResetToken + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
