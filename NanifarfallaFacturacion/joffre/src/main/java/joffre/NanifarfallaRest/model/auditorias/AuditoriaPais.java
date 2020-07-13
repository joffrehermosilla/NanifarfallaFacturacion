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
@Table(name = "auditoria_pais")
@EntityListeners(AuditingEntityListener.class)
public class AuditoriaPais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_audi_pais;
	@NotBlank
	String usuario;
	@NotBlank
	Date fecha_cambio;
	@NotBlank
	String nombre_pais_old;
	@NotBlank
	Date version_old;
	@NotBlank
	String nombre_pais_new;
	@NotBlank
	Date version_new;
	public int getCodigo_audi_pais() {
		return codigo_audi_pais;
	}
	public void setCodigo_audi_pais(int codigo_audi_pais) {
		this.codigo_audi_pais = codigo_audi_pais;
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
	public String getNombre_pais_old() {
		return nombre_pais_old;
	}
	public void setNombre_pais_old(String nombre_pais_old) {
		this.nombre_pais_old = nombre_pais_old;
	}
	public Date getVersion_old() {
		return version_old;
	}
	public void setVersion_old(Date version_old) {
		this.version_old = version_old;
	}
	public String getNombre_pais_new() {
		return nombre_pais_new;
	}
	public void setNombre_pais_new(String nombre_pais_new) {
		this.nombre_pais_new = nombre_pais_new;
	}
	public Date getVersion_new() {
		return version_new;
	}
	public void setVersion_new(Date version_new) {
		this.version_new = version_new;
	}


}
