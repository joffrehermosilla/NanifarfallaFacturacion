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
@Table(name = "auditoria_role")
@EntityListeners(AuditingEntityListener.class)
public class AuditoriaRole {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_audi_role;
	@NotBlank
	String usuario;
	@NotBlank
	Date fecha_cambio;
	@NotBlank
	String nombre_role_old;
	@NotBlank
	Date version_old;
	@NotBlank
	String nombre_role_new;
	@NotBlank
	Date version_new;

	public AuditoriaRole() {

	}

	public int getCodigo_audi_role() {
		return codigo_audi_role;
	}

	public void setCodigo_audi_role(int codigo_audi_role) {
		this.codigo_audi_role = codigo_audi_role;
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

	public String getNombre_role_old() {
		return nombre_role_old;
	}

	public void setNombre_role_old(String nombre_role_old) {
		this.nombre_role_old = nombre_role_old;
	}

	public Date getVersion_old() {
		return version_old;
	}

	public void setVersion_old(Date version_old) {
		this.version_old = version_old;
	}

	public String getNombre_role_new() {
		return nombre_role_new;
	}

	public void setNombre_role_new(String nombre_role_new) {
		this.nombre_role_new = nombre_role_new;
	}

	public Date getVersion_new() {
		return version_new;
	}

	public void setVersion_new(Date version_new) {
		this.version_new = version_new;
	}

}
