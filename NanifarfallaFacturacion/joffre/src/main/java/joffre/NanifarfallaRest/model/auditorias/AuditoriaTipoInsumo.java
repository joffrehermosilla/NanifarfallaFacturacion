package joffre.NanifarfallaRest.model.auditorias;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "auditoria_tipoinsumo")
@EntityListeners(AuditingEntityListener.class)
public class AuditoriaTipoInsumo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_auditipoinsumo;
	@NotBlank
	String usuario;
	@NotBlank
	Date fecha_cambio;
	@NotBlank
	String nombre_tipo_insumo_old;
	@NotBlank
	String claveApi_old;
	@NotBlank
	Date version_old;
	@NotBlank
	String nombre_tipo_insumo_new;
	@NotBlank
	String claveApi_new;
	@NotBlank
	Date version_new;

	public AuditoriaTipoInsumo() {

	}

	public int getCodigo_auditipoinsumo() {
		return codigo_auditipoinsumo;
	}

	public void setCodigo_auditipoinsumo(int codigo_auditipoinsumo) {
		this.codigo_auditipoinsumo = codigo_auditipoinsumo;
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

	public String getNombre_tipo_insumo_old() {
		return nombre_tipo_insumo_old;
	}

	public void setNombre_tipo_insumo_old(String nombre_tipo_insumo_old) {
		this.nombre_tipo_insumo_old = nombre_tipo_insumo_old;
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

	public String getNombre_tipo_insumo_new() {
		return nombre_tipo_insumo_new;
	}

	public void setNombre_tipo_insumo_new(String nombre_tipo_insumo_new) {
		this.nombre_tipo_insumo_new = nombre_tipo_insumo_new;
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
