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
@Table(name = "estado_producto")
@EntityListeners(AuditingEntityListener.class)
public class EstadoProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonBackReference
	private int codigo_estadoproducto;

	@OneToMany(mappedBy = "mEstadoproducto")
	@JsonBackReference
	private Collection<Producto> productos = new ArrayList<>();

	@NotBlank
	private String nombre_estado_producto;

	public int getCodigo_estadoproducto() {
		return codigo_estadoproducto;
	}

	public void setCodigo_estadoproducto(int codigo_estadoproducto) {
		this.codigo_estadoproducto = codigo_estadoproducto;
	}

	public Collection<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}

	public String getNombre_estado_producto() {
		return nombre_estado_producto;
	}

	public void setNombre_estado_producto(String nombre_estado_producto) {
		this.nombre_estado_producto = nombre_estado_producto;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	@NotBlank
	private String claveApi;
	@NotBlank
	Date version;

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
