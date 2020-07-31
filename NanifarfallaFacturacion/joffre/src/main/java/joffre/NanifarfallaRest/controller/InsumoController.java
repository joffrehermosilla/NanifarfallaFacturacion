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
import joffre.NanifarfallaRest.model.Insumo;
import joffre.NanifarfallaRest.repository.InsumoRepository;

@RestController
@RequestMapping("/apiInsumo")
public class InsumoController {
	private static final Log LOGGER = LogFactory.getLog(InsumoController.class);
	@Autowired
	InsumoRepository insumoRepository;

	@GetMapping("/insumos")
	public List<Insumo> getAllInsumos() {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return insumoRepository.findAll();
	}

	@PostMapping("/Addinsumo")
	public Insumo createInsumo(@Valid @RequestBody Insumo insumo) {
		LOGGER.info("INFO TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return insumoRepository.save(insumo);
	}

	@GetMapping("/insumo/{id}")
	public Insumo getInsumoById(@PathVariable(value = "id") int insumoId) {
		LOGGER.info("INFO  TRACE");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return insumoRepository.findById(insumoId)
				.orElseThrow(() -> new ResourceNotFoundException("Insumo", "id", insumoId));
	}

	@PutMapping("/insumos/{id}")
	public Insumo updateInsumo(@PathVariable(value = "id") int insumoId, @Valid @RequestBody Insumo insumoDetails) {

		Insumo insumo = insumoRepository.findById(insumoId)
				.orElseThrow(() -> new ResourceNotFoundException("Insumo", "id", insumoId));

		insumo.setCantidad_uni_insumo_almacen(insumoDetails.getCantidad_uni_insumo_almacen());
		insumo.setClaveApi(insumoDetails.getClaveApi());
		insumo.setCodigo_barras(insumoDetails.getCodigo_barras());
		insumo.setCodigo_insumo(insumoDetails.getCodigo_insumo());
		insumo.setCodigo_marca(insumoDetails.getCodigo_marca());
		insumo.setCodigo_qr(insumoDetails.getCodigo_qr());
		insumo.setDescripcion_insumo(insumoDetails.getDescripcion_insumo());
		insumo.setEstadoinsumo(insumoDetails.getEstadoinsumo());
		insumo.setFecha_ingreso(insumoDetails.getFecha_ingreso());
		insumo.setFecha_salida(insumoDetails.getFecha_salida());
		insumo.setFecha_vencimiento(insumoDetails.getFecha_vencimiento());
		insumo.setFoto_ruta(insumoDetails.getFoto_ruta());
		insumo.setLote_marca_insumo(insumoDetails.getLote_marca_insumo());
		insumo.setLoteinsumo(insumoDetails.getLoteinsumo());
		insumo.setMarca_insumo(insumoDetails.getMarca_insumo());
		insumo.setmEstadoinsumo(insumoDetails.getmEstadoinsumo());
		insumo.setmLoteinsumo(insumoDetails.getmLoteinsumo());
		insumo.setmPresentacion_insumo(insumoDetails.getmPresentacion_insumo());
		insumo.setmTipoinsumo(insumoDetails.getmTipoinsumo());
		insumo.setNombre_insumo(insumoDetails.getNombre_insumo());
		insumo.setPrecio_uni_promocion(insumoDetails.getPrecio_uni_promocion());
		insumo.setPrecio_unitario(insumoDetails.getPrecio_unitario());
		insumo.setPresentacioninsumo(insumoDetails.getmPresentacion_insumo());
		insumo.setRecetasproductoinsumos(insumoDetails.getRecetasproductoinsumos());
		insumo.setStock_actual(insumoDetails.getStock_actual());
		insumo.setTemperatura_ambiente(insumoDetails.getTemperatura_ambiente());
		insumo.setTipoinsumo(insumoDetails.getTipoinsumo());
		insumo.setUnidad_medida(insumoDetails.getUnidad_medida());
		insumo.setVersion(insumoDetails.getVersion());
		

		Insumo updatedInsumo = insumoRepository.save(insumo);
		LOGGER.info("METHOD: 'updateInsumo'--PARAMS: '" + insumoDetails + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return updatedInsumo;
	}

	@DeleteMapping("/insumo/{id}")
	public ResponseEntity<?> deleteInsumo(@PathVariable(value = "id") int insumoId) {
		Insumo insumo = insumoRepository.findById(insumoId)
				.orElseThrow(() -> new ResourceNotFoundException("Insumo", "id", insumoId));

		insumoRepository.delete(insumo);
		LOGGER.info("METHOD: 'deleteArea'--PARAMS: '" + insumo + "'");
		LOGGER.warn("WARNING  TRACE");
		LOGGER.error("ERROR TRACE");
		LOGGER.debug("DEBUG  TRACE");
		return ResponseEntity.ok().build();
	}
	// http://localhost:8085/nanifarfalla-service/swagger-ui.html

}
