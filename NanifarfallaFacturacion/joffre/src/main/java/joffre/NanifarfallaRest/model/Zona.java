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
@Table(name = "zona")
@EntityListeners(AuditingEntityListener.class)
public class Zona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_zona;
	
	@OneToMany(mappedBy = "zona")
	@JsonBackReference
	private Collection<Zona_tieneDistrito> zonatienedistrito = new ArrayList<>();
	@NotBlank
	private String claveApi;
	
	@NotBlank
	private String nombre_zona;
	
	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	@NotBlank
	private Date version;

	public int getCodigo_zona() {
		return codigo_zona;
	}

	public void setCodigo_zona(int codigo_zona) {
		this.codigo_zona = codigo_zona;
	}

	public Collection<Zona_tieneDistrito> getZonatienedistrito() {
		return zonatienedistrito;
	}

	public void setZonatienedistrito(Collection<Zona_tieneDistrito> zonatienedistrito) {
		this.zonatienedistrito = zonatienedistrito;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public String getNombre_zona() {
		return nombre_zona;
	}

	public void setNombre_zona(String nombre_zona) {
		this.nombre_zona = nombre_zona;
	}

}
