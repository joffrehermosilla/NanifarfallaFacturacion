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
import joffre.NanifarfallaRest.model.MenuV1;
import joffre.NanifarfallaRest.repository.MenuV1Repository;

@RestController
@RequestMapping("/apiMenuV1")
public class MenuV1Controller {
	private static final Log LOGGER = LogFactory.getLog(MenuV1Controller.class);
	@Autowired
	MenuV1Repository menuV1Repository;

	@GetMapping("/menusv1")
	public List<MenuV1> getAllAreas() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return menuV1Repository.findAll();
	}

	@PostMapping("/AddMenuV1")
	public MenuV1 createMenuV1(@Valid @RequestBody MenuV1 menuv1) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return menuV1Repository.save(menuv1);
	}

	@GetMapping("/MenuV1/{id}")
	public MenuV1 getMenuV1ById(@PathVariable(value = "id") int MenuV1Id) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return menuV1Repository.findById(MenuV1Id)
				.orElseThrow(() -> new ResourceNotFoundException("MenuV1", "id", MenuV1Id));
	}

	@PutMapping("/MenusV1/{id}")
	public MenuV1 updateMenuV1(@PathVariable(value = "id") int MenuV1Id, @Valid @RequestBody MenuV1 MenuV1Details) {

		MenuV1 menuv1 = menuV1Repository.findById(MenuV1Id)
				.orElseThrow(() -> new ResourceNotFoundException("MenuV1", "id", MenuV1Id));

		menuv1.setRuta(MenuV1Details.getRuta());
		menuv1.setIcon(MenuV1Details.getIcon());
		menuv1.setLft(MenuV1Details.getLft());
		menuv1.setRgt(MenuV1Details.getRgt());
		menuv1.setMenuV1(MenuV1Details.getMenuV1());
		menuv1.setmMenuV1(MenuV1Details.getmMenuV1());
		menuv1.setNombre(MenuV1Details.getNombre());
		menuv1.setVersion(MenuV1Details.getVersion());
		menuv1.setMenuRoles(MenuV1Details.getMenuRoles());

		MenuV1 updatedMenuV1 = menuV1Repository.save(menuv1);
		LOGGER.info("METHOD: 'updateMenuV1'--PARAMS: '" + MenuV1Details + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedMenuV1;
	}

	@DeleteMapping("/menuv1/{id}")
	public ResponseEntity<?> deleteMenuV1(@PathVariable(value = "id") int MenuV1Id) {
		MenuV1 menuv1 = menuV1Repository.findById(MenuV1Id)
				.orElseThrow(() -> new ResourceNotFoundException("MenuV1", "id", MenuV1Id));

		menuV1Repository.delete(menuv1);
		LOGGER.info("METHOD: 'deletemenuv1'--PARAMS: '" + menuv1 + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
