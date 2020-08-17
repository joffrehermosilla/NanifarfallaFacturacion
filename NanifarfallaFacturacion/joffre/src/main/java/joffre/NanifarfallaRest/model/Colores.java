package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "colores")
@EntityListeners(AuditingEntityListener.class)
public class Colores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_colores;
	@NotBlank
	String nombre_color;
	@NotBlank
	String claveApi;
	@NotBlank
	Date version;

	@OneToMany(mappedBy = "mProducto", fetch = FetchType.EAGER)
	@JsonBackReference
	private Collection<ProductoTieneColores> productoTieneColores = new ArrayList<>();

	public Collection<ProductoTieneColores> getProductoTieneColores() {
		return productoTieneColores;
	}

	public void setProductoTieneColores(Collection<ProductoTieneColores> productoTieneColores) {
		this.productoTieneColores = productoTieneColores;
	}

	public int getCodigo_colores() {
		return codigo_colores;
	}

	public void setCodigo_colores(int codigo_colores) {
		this.codigo_colores = codigo_colores;
	}

	public String getNombre_color() {
		return nombre_color;
	}

	public void setNombre_color(String nombre_color) {
		this.nombre_color = nombre_color;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public Colores() {

	}

}
