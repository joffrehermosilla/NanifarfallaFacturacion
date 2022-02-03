package joffre.NanifarfallaRest.model.auditorias;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "audi_estado_catalogo")
public class AuditoriaEstadoCatalogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_audi_estado_catalogo;
	@NotBlank
	String usuario;
	@NotBlank
	Date fecha_cambio;
	@NotBlank
	String descripcion_old;
	@NotBlank
	String claveApi_old;
	@NotBlank
	Date version_old;
	@NotBlank
	String descripcion_new;
	@NotBlank
	String claveApi_new;
	@NotBlank
	Date version_new;

	public AuditoriaEstadoCatalogo() {

	}

	public int getCodigo_audi_estado_catalogo() {
		return codigo_audi_estado_catalogo;
	}

	public void setCodigo_audi_estado_catalogo(int codigo_audi_estado_catalogo) {
		this.codigo_audi_estado_catalogo = codigo_audi_estado_catalogo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Date getFecha_cambio() {
		return fecha_cambio;
	}

	public void setFecha_cambio(Date fecha_cambio) {
		this.fecha_cambio = fecha_cambio;
	}

	public String getDescripcion_old() {
		return descripcion_old;
	}

	public void setDescripcion_old(String descripcion_old) {
		this.descripcion_old = descripcion_old;
	}

	public String getClaveApi_old() {
		return claveApi_old;
	}

	public void setClaveApi_old(String claveApi_old) {
		this.claveApi_old = claveApi_old;
	}

	public Date getVersion_old() {
		return version_old;
	}

	public void setVersion_old(Date version_old) {
		this.version_old = version_old;
	}

	public String getDescripcion_new() {
		return descripcion_new;
	}

	public void setDescripcion_new(String descripcion_new) {
		this.descripcion_new = descripcion_new;
	}

	public String getClaveApi_new() {
		return claveApi_new;
	}

	public void setClaveApi_new(String claveApi_new) {
		this.claveApi_new = claveApi_new;
	}

	public Date getVersion_new() {
		return version_new;
	}

	public void setVersion_new(Date version_new) {
		this.version_new = version_new;
	}

}
