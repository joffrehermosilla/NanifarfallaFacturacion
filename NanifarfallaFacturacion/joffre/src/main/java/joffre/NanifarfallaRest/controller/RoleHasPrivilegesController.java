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
import joffre.NanifarfallaRest.model.RoleHasPrivileges;
import joffre.NanifarfallaRest.repository.RoleHasPrivilegesRepository;

@RestController
@RequestMapping("/apiRoleHasPrivileges")
public class RoleHasPrivilegesController {

	private static final Log LOGGER = LogFactory.getLog(RoleHasPrivilegesController.class);
	@Autowired
	RoleHasPrivilegesRepository roleHasPrivilegesRepository;

	@GetMapping("/RoleHasPrivilegess")
	public List<RoleHasPrivileges> getAllRoleHasPrivileges() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return roleHasPrivilegesRepository.findAll();
	}

	@PostMapping("/Addarea")
	public RoleHasPrivileges createRoleHasPrivileges(@Valid @RequestBody RoleHasPrivileges rolehasprivilege) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return roleHasPrivilegesRepository.save(rolehasprivilege);
	}

	@GetMapping("/RoleHasPrivileges/{id}")
	public RoleHasPrivileges getRoleHasPrivilegesById(@PathVariable(value = "id") int rolehasprivilegeId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return roleHasPrivilegesRepository.findById(rolehasprivilegeId)
				.orElseThrow(() -> new ResourceNotFoundException("RoleHasPrivileges", "id", rolehasprivilegeId));
	}

	@PutMapping("/RoleHasPrivileges/{id}")
	public RoleHasPrivileges updateRoleHasPrivileges(@PathVariable(value = "id") int rolehasprivilegeId,
			@Valid @RequestBody RoleHasPrivileges RoleHasPrivilegesIdDetails) {

		RoleHasPrivileges rolehasprivilege = roleHasPrivilegesRepository.findById(rolehasprivilegeId)
				.orElseThrow(() -> new ResourceNotFoundException("RoleHasPrivileges", "id", rolehasprivilegeId));

		rolehasprivilege.setmPrivilege(RoleHasPrivilegesIdDetails.getmPrivilege());
		rolehasprivilege.setmRole(RoleHasPrivilegesIdDetails.getmRole());
		rolehasprivilege.setVersion(RoleHasPrivilegesIdDetails.getVersion());

		RoleHasPrivileges updatedrolehasprivilege = roleHasPrivilegesRepository.save(rolehasprivilege);
		LOGGER.info("METHOD: 'updateRoleHasPrivileges'--PARAMS: '" + RoleHasPrivilegesIdDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedrolehasprivilege;
	}

	@DeleteMapping("/RoleHasPrivileges/{id}")
	public ResponseEntity<?> deleteRoleHasPrivileges(@PathVariable(value = "id") int RoleHasPrivilegesId) {
		RoleHasPrivileges area = roleHasPrivilegesRepository.findById(RoleHasPrivilegesId)
				.orElseThrow(() -> new ResourceNotFoundException("RoleHasPrivileges", "id", RoleHasPrivilegesId));

		roleHasPrivilegesRepository.delete(area);
		LOGGER.info("METHOD: 'deleteRoleHasPrivileges'--PARAMS: '" + area + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
