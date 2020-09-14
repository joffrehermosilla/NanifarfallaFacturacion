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
import joffre.NanifarfallaRest.model.MenuRoles;
import joffre.NanifarfallaRest.repository.MenuRolesRepository;

@RestController
@RequestMapping("/apiMenuRoles")
public class MenuRolesController {
	private static final Log LOGGER = LogFactory.getLog(MenuRolesController.class);
	@Autowired
	MenuRolesRepository menuRolesRepository;

	@GetMapping("/areas")
	public List<MenuRoles> getAllMenuRoles() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return menuRolesRepository.findAll();
	}

	@PostMapping("/AddMenuRoles")
	public MenuRoles createMenuRoles(@Valid @RequestBody MenuRoles menuroles) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return menuRolesRepository.save(menuroles);
	}

	@GetMapping("/menuroles/{id}")
	public MenuRoles getMenuRolesById(@PathVariable(value = "id") int menurolesId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return menuRolesRepository.findById(menurolesId)
				.orElseThrow(() -> new ResourceNotFoundException("MenuRoles", "id", menurolesId));
	}

	@PutMapping("/menuroles/{id}")
	public MenuRoles updateMenuRoles(@PathVariable(value = "id") int menurolesId,
			@Valid @RequestBody MenuRoles menurolesDetails) {

		MenuRoles menuroles = menuRolesRepository.findById(menurolesId)
				.orElseThrow(() -> new ResourceNotFoundException("MenuRoles", "id", menurolesId));

		menuroles.setmMenuV1(menurolesDetails.getmMenuV1());
		menuroles.setmRole(menurolesDetails.getmRole());
		menuroles.setVersion(menurolesDetails.getVersion());

		MenuRoles updatedMenuroles = menuRolesRepository.save(menuroles);
		LOGGER.info("METHOD: 'updateMenuRoles'--PARAMS: '" + menurolesDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedMenuroles;
	}

	@DeleteMapping("/menuroles/{id}")
	public ResponseEntity<?> deleteMenuRoles(@PathVariable(value = "id") int menurolesId) {
		MenuRoles menuroles = menuRolesRepository.findById(menurolesId)
				.orElseThrow(() -> new ResourceNotFoundException("MenuRoles", "id", menurolesId));

		menuRolesRepository.delete(menuroles);
		LOGGER.info("METHOD: 'deleteMenuRoles'--PARAMS: '" + menuroles + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
