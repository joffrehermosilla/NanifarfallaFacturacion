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
import joffre.NanifarfallaRest.model.UserRoles;
import joffre.NanifarfallaRest.repository.UserRolesRepository;

@RestController
@RequestMapping("/apiArea")
public class UserRolesController {

	private static final Log LOGGER = LogFactory.getLog(UserRolesController.class);
	@Autowired
	UserRolesRepository userRolesRepository;

	@GetMapping("/UserRoles")
	public List<UserRoles> getAllUserRoles() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return userRolesRepository.findAll();
	}

	@PostMapping("/AdduserRoles")
	public UserRoles createuserRoles(@Valid @RequestBody UserRoles userRoles) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return userRolesRepository.save(userRoles);
	}

	@GetMapping("/UserRoles/{id}")
	public UserRoles getUserRolesById(@PathVariable(value = "id") int UserRolesId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return userRolesRepository.findById(UserRolesId)
				.orElseThrow(() -> new ResourceNotFoundException("UserRoles", "id", UserRolesId));
	}

	@PutMapping("/UserRolesId/{id}")
	public UserRoles updateUserRoles(@PathVariable(value = "id") int UserRolesId,
			@Valid @RequestBody UserRoles UserRolesDetails) {

		UserRoles userroles = userRolesRepository.findById(UserRolesId)
				.orElseThrow(() -> new ResourceNotFoundException("UserRoles", "id", UserRolesId));
		userroles.setClaveApi(UserRolesDetails.getClaveApi());
		userroles.setmRole(UserRolesDetails.getmRole());
		userroles.setmUsuario(UserRolesDetails.getmUsuario());
		userroles.setVersion(UserRolesDetails.getVersion());

		UserRoles updatedUserRoles = userRolesRepository.save(userroles);
		LOGGER.info("METHOD: 'updatedUserRoles'--PARAMS: '" + UserRolesDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedUserRoles;
	}

	@DeleteMapping("/UserRoles/{id}")
	public ResponseEntity<?> deleteUserRoles(@PathVariable(value = "id") int UserRolesId) {
		UserRoles userroles = userRolesRepository.findById(UserRolesId)
				.orElseThrow(() -> new ResourceNotFoundException("UserRoles", "id", UserRolesId));

		userRolesRepository.delete(userroles);
		LOGGER.info("METHOD: 'deleteUserRoles'--PARAMS: '" + userroles + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
