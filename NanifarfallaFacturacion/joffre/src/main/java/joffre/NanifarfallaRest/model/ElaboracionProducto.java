package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "elaboracion_producto")
@EntityListeners(AuditingEntityListener.class)
public class ElaboracionProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_elaboracionproducto;

	@OneToMany(mappedBy = "mElaboracionproducto")
	@JsonBackReference
	private Collection<RecetaProductotieneInsumo> recetasproductotieneinsumo = new ArrayList<>();

	@NotBlank
	private String modelo_producto;

	@NotBlank
	private Date temporada_producto;

	@NotBlank
	private String claveApi;

	public int getCodigo_elaboracionproducto() {
		return codigo_elaboracionproducto;
	}

	public void setCodigo_elaboracionproducto(int codigo_elaboracionproducto) {
		this.codigo_elaboracionproducto = codigo_elaboracionproducto;
	}

	public Collection<RecetaProductotieneInsumo> getRecetasproductotieneinsumo() {
		return recetasproductotieneinsumo;
	}

	public void setRecetasproductotieneinsumo(Collection<RecetaProductotieneInsumo> recetasproductotieneinsumo) {
		this.recetasproductotieneinsumo = recetasproductotieneinsumo;
	}

	public String getModelo_producto() {
		return modelo_producto;
	}

	public void setModelo_producto(String modelo_producto) {
		this.modelo_producto = modelo_producto;
	}

	public Date getTemporada_producto() {
		return temporada_producto;
	}

	public void setTemporada_producto(Date temporada_producto) {
		this.temporada_producto = temporada_producto;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}
}
