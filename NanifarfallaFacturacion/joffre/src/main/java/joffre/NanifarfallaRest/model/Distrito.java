package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "distrito")
@EntityListeners(AuditingEntityListener.class)
public class Distrito {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_distrito;

	public int getCodigo_distrito() {
		return codigo_distrito;
	}

	public void setCodigo_distrito(int codigo_distrito) {
		this.codigo_distrito = codigo_distrito;
	}

	public String getNombre_distrito() {
		return nombre_distrito;
	}

	public void setNombre_distrito(String nombre_distrito) {
		this.nombre_distrito = nombre_distrito;
	}

	@JsonIgnore
	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	@JoinColumn(name = "fkcodigo_ciudad", referencedColumnName = "codigo_ciudad")
	@ManyToOne
	@JsonBackReference
	Ciudad ciudad;

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@OneToMany(mappedBy = "distrito")
	@JsonBackReference
	private Collection<Usuario> usuario = new ArrayList<>();

	public Collection<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Collection<Usuario> usuario) {
		this.usuario = usuario;
	}

	@OneToMany(mappedBy = "distrito")
	@JsonBackReference
	private Collection<Zona_tieneDistrito> zonatienedistrito = new ArrayList<>();

	public Collection<Zona_tieneDistrito> getZonatienedistrito() {
		return zonatienedistrito;
	}

	public void setZonatienedistrito(Collection<Zona_tieneDistrito> zonatienedistrito) {
		this.zonatienedistrito = zonatienedistrito;
	}

	@NotBlank
	String nombre_distrito;
	@NotBlank
	String claveApi;
	@NotBlank
	Date version;

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
