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
@Table(name = "auditoria_menu_v1")
@EntityListeners(AuditingEntityListener.class)
public class AuditoriaMenuV1 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_audi_menu;
	@NotBlank
	String usuario;
	@NotBlank
	Date fecha_cambio;
	@NotBlank
	String nombre_old;
	@NotBlank
	int padre_id_old;
	@NotBlank
	String ruta_old;
	@NotBlank
	String icon_old;
	@NotBlank
	int lft_old;
	@NotBlank
	int rgt_old;
	@NotBlank
	Date version_old;
	@NotBlank
	String nombre_new;
	@NotBlank
	int padre_id_new;
	@NotBlank
	String ruta_new;
	@NotBlank
	String icon_new;
	@NotBlank
	int lft_new;
	@NotBlank
	int rgt_new;
	@NotBlank
	Date version_new;

	public AuditoriaMenuV1() {

	}

	public int getCodigo_audi_menu() {
		return codigo_audi_menu;
	}

	public void setCodigo_audi_menu(int codigo_audi_menu) {
		this.codigo_audi_menu = codigo_audi_menu;
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

	public String getNombre_old() {
		return nombre_old;
	}

	public void setNombre_old(String nombre_old) {
		this.nombre_old = nombre_old;
	}

	public int getPadre_id_old() {
		return padre_id_old;
	}

	public void setPadre_id_old(int padre_id_old) {
		this.padre_id_old = padre_id_old;
	}

	public String getRuta_old() {
		return ruta_old;
	}

	public void setRuta_old(String ruta_old) {
		this.ruta_old = ruta_old;
	}

	public String getIcon_old() {
		return icon_old;
	}

	public void setIcon_old(String icon_old) {
		this.icon_old = icon_old;
	}

	public int getLft_old() {
		return lft_old;
	}

	public void setLft_old(int lft_old) {
		this.lft_old = lft_old;
	}

	public int getRgt_old() {
		return rgt_old;
	}

	public void setRgt_old(int rgt_old) {
		this.rgt_old = rgt_old;
	}

	public Date getVersion_old() {
		return version_old;
	}

	public void setVersion_old(Date version_old) {
		this.version_old = version_old;
	}

	public String getNombre_new() {
		return nombre_new;
	}

	public void setNombre_new(String nombre_new) {
		this.nombre_new = nombre_new;
	}

	public int getPadre_id_new() {
		return padre_id_new;
	}

	public void setPadre_id_new(int padre_id_new) {
		this.padre_id_new = padre_id_new;
	}

	public String getRuta_new() {
		return ruta_new;
	}

	public void setRuta_new(String ruta_new) {
		this.ruta_new = ruta_new;
	}

	public String getIcon_new() {
		return icon_new;
	}

	public void setIcon_new(String icon_new) {
		this.icon_new = icon_new;
	}

	public int getLft_new() {
		return lft_new;
	}

	public void setLft_new(int lft_new) {
		this.lft_new = lft_new;
	}

	public int getRgt_new() {
		return rgt_new;
	}

	public void setRgt_new(int rgt_new) {
		this.rgt_new = rgt_new;
	}

	public Date getVersion_new() {
		return version_new;
	}

	public void setVersion_new(Date version_new) {
		this.version_new = version_new;
	}

}
