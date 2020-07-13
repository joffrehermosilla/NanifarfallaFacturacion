package joffre.NanifarfallaRest.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import joffre.NanifarfallaRest.exception.ResourceNotFoundException;
import joffre.NanifarfallaRest.model.Pais;
import joffre.NanifarfallaRest.repository.PaisRepository;

@RestController
@RequestMapping("/apiPais")
public class PaisController {
	
	private static final Log LOGGER = LogFactory.getLog(PaisController.class);
	
	
	 @Autowired
	    PaisRepository paisRepository;

	    @GetMapping("/paises")
	    public List<Pais> getAllPaises() {
	    	LOGGER.info("INFO TRACE");
	    	LOGGER.warn("WARNING  TRACE");
	    	LOGGER.error("ERROR TRACE");
	    	LOGGER.debug("DEBUG  TRACE");
	        return paisRepository.findAll();
	    }

	    @PostMapping("/Addpais")
	    public Pais createPais(@Valid @RequestBody Pais pais) {
	     	LOGGER.info("INFO  TRACE");
	    	LOGGER.warn("WARNING  TRACE");
	    	LOGGER.error("ERROR TRACE");
	    	LOGGER.debug("DEBUG  TRACE");
	        return paisRepository.save(pais);
	    }

	    @GetMapping("/pais/{id}")
	    public Pais getPaisById(@PathVariable(value = "id") int paisId) {
	     	LOGGER.info("INFO  TRACE");
	    	LOGGER.warn("WARNING  TRACE");
	    	LOGGER.error("ERROR TRACE");
	    	LOGGER.debug("DEBUG  TRACE");
	        return paisRepository.findById(paisId)
	                .orElseThrow(() -> new ResourceNotFoundException("Pais", "id", paisId));
	    }

	    @PutMapping("/pais/{id}")
	    public Pais updatePais(@PathVariable(value = "id") int paisId,
	                                           @Valid @RequestBody Pais paisDetails) {
	     	

	    	Pais pais = paisRepository.findById(paisId)
	                .orElseThrow(() -> new ResourceNotFoundException("Pais", "id", paisId));

	    	pais.setNombre_pais(paisDetails.getNombre_pais());
	    	pais.setClaveApi(paisDetails.getClaveApi());

	        Pais updatedPais = paisRepository.save(pais);
	        LOGGER.info("METHOD: 'updatePais'--PARAMS: '" +paisDetails+ "'");
	    	LOGGER.warn("WARNING  TRACE");
	    	LOGGER.error("ERROR TRACE");
	    	LOGGER.debug("DEBUG  TRACE");
	        return updatedPais;
	    }

	    @DeleteMapping("/pais/{id}")
	    public ResponseEntity<?> deletePais(@PathVariable(value = "id") int paisId) {
	    	Pais pais = paisRepository.findById(paisId)
	                .orElseThrow(() -> new ResourceNotFoundException("Pais", "id", paisId));

	        paisRepository.delete(pais);
	        LOGGER.info("METHOD: 'deletePais'--PARAMS: '" +pais+ "'");
	    	LOGGER.warn("WARNING  TRACE");
	    	LOGGER.error("ERROR TRACE");
	    	LOGGER.debug("DEBUG  TRACE");
	        return ResponseEntity.ok().build();
	    }
	}//http://localhost:8085/nanifarfalla-service/swagger-ui.html
