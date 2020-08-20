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
import joffre.NanifarfallaRest.model.Catalogo;
import joffre.NanifarfallaRest.repository.CatalogoRepository;

@RestController
@RequestMapping("/apiController")
public class CatalogoController {
	private static final Log LOGGER = LogFactory.getLog(CatalogoController.class);
	@Autowired
	CatalogoRepository catalogoRepository;

	@GetMapping("/catalogos")
	public List<Catalogo> getAllCatalogos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return catalogoRepository.findAll();
	}

	@PostMapping("/Addcatalogo")
	public Catalogo createCatalogo(@Valid @RequestBody Catalogo catalogo) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return catalogoRepository.save(catalogo);
	}

	@GetMapping("/catalogo/{id}")
	public Catalogo getCatalogoById(@PathVariable(value = "id") int catalogoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return catalogoRepository.findById(catalogoId)
				.orElseThrow(() -> new ResourceNotFoundException("Catalogo", "id", catalogoId));
	}

	@PutMapping("/catalogos/{id}")
	public Catalogo updateCatalogo(@PathVariable(value = "id") int catalogoId,
			@Valid @RequestBody Catalogo catalogoDetails) {

		Catalogo catalogo = catalogoRepository.findById(catalogoId)
				.orElseThrow(() -> new ResourceNotFoundException("Catalogo", "id", catalogoId));

		catalogo.setCantidadMasPedido(catalogoDetails.getCantidadMasPedido());
		catalogo.setCat_codigo_producto(catalogoDetails.getCat_codigo_producto());
		catalogo.setCat_colores_producto(catalogoDetails.getCat_colores_producto());
		catalogo.setCat_densidad(catalogoDetails.getCat_densidad());
		catalogo.setCat_modelo_receta_producto(catalogoDetails.getCat_modelo_receta_producto());
		catalogo.setCat_nombre_insumo(catalogoDetails.getCat_nombre_insumo());
		catalogo.setCat_nombre_producto(catalogoDetails.getCat_nombre_producto());
		catalogo.setCat_nombre_tipo_producto(catalogoDetails.getCat_nombre_tipo_producto());
		catalogo.setCat_preparacion_producto(catalogoDetails.getCat_preparacion_producto());
		catalogo.setCat_valor_con_igv(catalogoDetails.getValor_con_igv());
		catalogo.setCat_valor_neto(catalogoDetails.getCat_valor_neto());
		catalogo.setmEstadoCatalogo(catalogoDetails.getmEstadoCatalogo());
		catalogo.setPromedioTotalProd(catalogoDetails.getPromedioTotalProd());
		catalogo.setValor_con_igv(catalogoDetails.getValor_con_igv());
		catalogo.setVersion(catalogoDetails.getVersion());
		catalogo.setContratos(catalogoDetails.getContratos());

		Catalogo updatedcatalogo = catalogoRepository.save(catalogo);
		LOGGER.info("METHOD: 'updatecatalogo'--PARAMS: '" + catalogoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedcatalogo;
	}

	@DeleteMapping("/catalogo/{id}")
	public ResponseEntity<?> deleteCatalogo(@PathVariable(value = "id") int catalogoId) {
		Catalogo catalogo = catalogoRepository.findById(catalogoId)
				.orElseThrow(() -> new ResourceNotFoundException("Catalogo", "id", catalogoId));

		catalogoRepository.delete(catalogo);
		LOGGER.info("METHOD: 'deletecatalogo'--PARAMS: '" + catalogo + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
