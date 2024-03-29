package joffre.NanifarfallaRest.model.auditorias;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "audi_cliente_tiene_catalogo")
@EntityListeners(AuditingEntityListener.class)
public class AuditoriaClienteTieneCatalogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_cliente_tienecatalogo;
	String usuario;
	Date fecha_cambio;
	int fkcodigo_cliente_old;
	int fkcodigo_catalogo_old;
	Date fecha_inicio_old;
	Date fecha_fin_old;
	Double precio_old;
	String claveApi_old;
	Date version_old;
	int fkcodigo_zona_new;
	int fkcodigo_distrito_new;
	Date fecha_inicio_new;
	Date fecha_fin_new;
	Double precio_new;
	String claveApi_new;
	Date version_new;

	public AuditoriaClienteTieneCatalogo() {

	}

	public int getCodigo_cliente_tienecatalogo() {
		return codigo_cliente_tienecatalogo;
	}

	public void setCodigo_cliente_tienecatalogo(int codigo_cliente_tienecatalogo) {
		this.codigo_cliente_tienecatalogo = codigo_cliente_tienecatalogo;
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

	public int getFkcodigo_cliente_old() {
		return fkcodigo_cliente_old;
	}

	public void setFkcodigo_cliente_old(int fkcodigo_cliente_old) {
		this.fkcodigo_cliente_old = fkcodigo_cliente_old;
	}

	public int getFkcodigo_catalogo_old() {
		return fkcodigo_catalogo_old;
	}

	public void setFkcodigo_catalogo_old(int fkcodigo_catalogo_old) {
		this.fkcodigo_catalogo_old = fkcodigo_catalogo_old;
	}

	public Date getFecha_inicio_old() {
		return fecha_inicio_old;
	}

	public void setFecha_inicio_old(Date fecha_inicio_old) {
		this.fecha_inicio_old = fecha_inicio_old;
	}

	public Date getFecha_fin_old() {
		return fecha_fin_old;
	}

	public void setFecha_fin_old(Date fecha_fin_old) {
		this.fecha_fin_old = fecha_fin_old;
	}

	public Double getPrecio_old() {
		return precio_old;
	}

	public void setPrecio_old(Double precio_old) {
		this.precio_old = precio_old;
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

	public int getFkcodigo_zona_new() {
		return fkcodigo_zona_new;
	}

	public void setFkcodigo_zona_new(int fkcodigo_zona_new) {
		this.fkcodigo_zona_new = fkcodigo_zona_new;
	}

	public int getFkcodigo_distrito_new() {
		return fkcodigo_distrito_new;
	}

	public void setFkcodigo_distrito_new(int fkcodigo_distrito_new) {
		this.fkcodigo_distrito_new = fkcodigo_distrito_new;
	}

	public Date getFecha_inicio_new() {
		return fecha_inicio_new;
	}

	public void setFecha_inicio_new(Date fecha_inicio_new) {
		this.fecha_inicio_new = fecha_inicio_new;
	}

	public Date getFecha_fin_new() {
		return fecha_fin_new;
	}

	public void setFecha_fin_new(Date fecha_fin_new) {
		this.fecha_fin_new = fecha_fin_new;
	}

	public Double getPrecio_new() {
		return precio_new;
	}

	public void setPrecio_new(Double precio_new) {
		this.precio_new = precio_new;
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
