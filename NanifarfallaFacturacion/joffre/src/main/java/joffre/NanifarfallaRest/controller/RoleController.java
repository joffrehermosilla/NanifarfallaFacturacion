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

import joffre.NanifarfallaRest.model.Role;
import joffre.NanifarfallaRest.repository.RoleRepository;

@RestController
@RequestMapping("/apiRole")
public class RoleController {
	private static final Log LOGGER = LogFactory.getLog(RoleController.class);
	@Autowired
	RoleRepository roleRepository;

	@GetMapping("/roles")
	public List<Role> getAllRoles() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return roleRepository.findAll();
	}

	@PostMapping("/Addrole")
	public Role createRole(@Valid @RequestBody Role role) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return roleRepository.save(role);
	}

	@GetMapping("/role/{id}")
	public Role getRoleById(@PathVariable(value = "id") int roleId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return roleRepository.findById(roleId).orElseThrow(() -> new ResourceNotFoundException("Role", "id", roleId));
	}

	@PutMapping("/roles/{id}")
	public Role updateRole(@PathVariable(value = "id") int roleId, @Valid @RequestBody Role roleDetails) {

		Role role = roleRepository.findById(roleId)
				.orElseThrow(() -> new ResourceNotFoundException("Role", "id", roleId));
		role.setName(roleDetails.getName());
		role.setVersion(roleDetails.getVersion());
		role.setRoleHasPrivileges(roleDetails.getRoleHasPrivileges());
		role.setMenuRoles(roleDetails.getMenuRoles());

		Role updatedRole = roleRepository.save(role);
		LOGGER.info("METHOD: 'updateRole'--PARAMS: '" + roleDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedRole;
	}

	@DeleteMapping("/role/{id}")
	public ResponseEntity<?> deleteRole(@PathVariable(value = "id") int roleId) {
		Role role = roleRepository.findById(roleId)
				.orElseThrow(() -> new ResourceNotFoundException("Role", "id", roleId));

		roleRepository.delete(role);
		LOGGER.info("METHOD: 'deleteRole'--PARAMS: '" + role + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
