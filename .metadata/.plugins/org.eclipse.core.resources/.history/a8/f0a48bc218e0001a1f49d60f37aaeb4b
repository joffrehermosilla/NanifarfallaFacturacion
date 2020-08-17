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

@Entity
@Table(name = "tipo_producto")
@EntityListeners(AuditingEntityListener.class)
public class TipoProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_tipoproducto;
	@OneToMany(mappedBy = "mTipoproducto")
	private Collection<Producto> productos = new ArrayList<>();

	@NotBlank
	private String nombre_tipoproducto;

	@NotBlank
	private Double tiempo_produccion;

	@NotBlank
	private Double precio_costo;

	@NotBlank
	private String foto_ruta;

	public int getCodigo_tipoproducto() {
		return codigo_tipoproducto;
	}

	public void setCodigo_tipoproducto(int codigo_tipoproducto) {
		this.codigo_tipoproducto = codigo_tipoproducto;
	}

	public Collection<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}

	public String getNombre_tipoproducto() {
		return nombre_tipoproducto;
	}

	public void setNombre_tipoproducto(String nombre_tipoproducto) {
		this.nombre_tipoproducto = nombre_tipoproducto;
	}

	public Double getTiempo_produccion() {
		return tiempo_produccion;
	}

	public void setTiempo_produccion(Double tiempo_produccion) {
		this.tiempo_produccion = tiempo_produccion;
	}

	public Double getPrecio_costo() {
		return precio_costo;
	}

	public void setPrecio_costo(Double precio_costo) {
		this.precio_costo = precio_costo;
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
	
	@NotBlank
	Date version;

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}
	
	

}
