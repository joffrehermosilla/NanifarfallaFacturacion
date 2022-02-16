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
@Table(name = "linea")
@EntityListeners(AuditingEntityListener.class)
public class Linea {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_linea;

	@OneToMany(mappedBy = "mLinea")
	@JsonBackReference
	private Collection<Producto> productos = new ArrayList<>();

	@NotBlank
	private String nombre_linea;

	@NotBlank
	private String foto_ruta;
	@NotBlank
	private Date version;

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public int getCodigo_linea() {
		return codigo_linea;
	}

	public void setCodigo_linea(int codigo_linea) {
		this.codigo_linea = codigo_linea;
	}

	public Collection<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}

	public String getNombre_linea() {
		return nombre_linea;
	}

	public void setNombre_linea(String nombre_linea) {
		this.nombre_linea = nombre_linea;
	}

	public String getFoto_ruta() {
		return foto_ruta;
	}

	public void setFoto_ruta(String foto_ruta) {
		this.foto_ruta = foto_ruta;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	@NotBlank
	private String claveApi;
}
