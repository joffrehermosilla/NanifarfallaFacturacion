package joffre.NanifarfallaRest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "zona_tiene_distrito")
@EntityListeners(AuditingEntityListener.class)
public class Zona_tieneDistrito {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_zona_tiene_distrito;
	
	
	@JoinColumn(name = "fkcodigo_distrito", referencedColumnName = "codigo_distrito")
	@ManyToOne
	@JsonBackReference
	Distrito distrito;
	
	
	@JoinColumn(name = "fkcodigo_zona", referencedColumnName = "codigo_zona")
	@ManyToOne
	@JsonBackReference
	Zona zona;
	
	@NotBlank
	 String claveApi;
	@NotBlank
	Date version;
	
	

	public Zona_tieneDistrito() {

	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public int getCodigo_zona_tiene_distrito() {
		return codigo_zona_tiene_distrito;
	}

	public void setCodigo_zona_tiene_distrito(int codigo_zona_tiene_distrito) {
		this.codigo_zona_tiene_distrito = codigo_zona_tiene_distrito;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}
	
}
