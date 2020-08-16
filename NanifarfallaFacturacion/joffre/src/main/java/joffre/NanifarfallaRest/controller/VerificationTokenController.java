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
import joffre.NanifarfallaRest.model.VerificationToken;
import joffre.NanifarfallaRest.repository.VerificationTokenRepository;

@RestController
@RequestMapping("/apiVerificationToken")
public class VerificationTokenController {

	private static final Log LOGGER = LogFactory.getLog(VerificationTokenController.class);
	@Autowired
	VerificationTokenRepository verificationTokenRepository;

	@GetMapping("/VerificationTokens")
	public List<VerificationToken> getAllVerificationTokens() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return verificationTokenRepository.findAll();
	}

	@PostMapping("/AddaVerificationToken")
	public VerificationToken createVerificationToken(@Valid @RequestBody VerificationToken verificationtoken) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return verificationTokenRepository.save(verificationtoken);
	}

	@GetMapping("/VerificationToken/{id}")
	public VerificationToken getverificationtokenaById(@PathVariable(value = "id") int verificationtokenId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return verificationTokenRepository.findById(verificationtokenId)
				.orElseThrow(() -> new ResourceNotFoundException("VerificationToken", "id", verificationtokenId));
	}

	@PutMapping("/VerificationTokens/{id}")
	public VerificationToken updateVerificationToken(@PathVariable(value = "id") int verificationtokenId,
			@Valid @RequestBody VerificationToken verificationtokenDetails) {

		VerificationToken verificationtoken = verificationTokenRepository.findById(verificationtokenId)
				.orElseThrow(() -> new ResourceNotFoundException("VerificationToken", "id", verificationtokenId));

		verificationtoken.setExpiryDate(verificationtokenDetails.getExpiryDate());
		verificationtoken.setmUsuario(verificationtokenDetails.getmUsuario());
		verificationtoken.setToken(verificationtokenDetails.getToken());
		verificationtoken.setVersion(verificationtokenDetails.getVersion());

		VerificationToken updateverificationtoken = verificationTokenRepository.save(verificationtoken);
		LOGGER.info("METHOD: 'updateVerificationToken'--PARAMS: '" + verificationtokenDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updateverificationtoken;
	}

	@DeleteMapping("/verificationtoken/{id}")
	public ResponseEntity<?> deleteVerificationToken(@PathVariable(value = "id") int verificationtokenId) {
		VerificationToken verificationtoken = verificationTokenRepository.findById(verificationtokenId)
				.orElseThrow(() -> new ResourceNotFoundException("VerificationToken", "id", verificationtokenId));

		verificationTokenRepository.delete(verificationtoken);
		LOGGER.info("METHOD: 'deleteverificationtoken'--PARAMS: '" + verificationtoken + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html
}
