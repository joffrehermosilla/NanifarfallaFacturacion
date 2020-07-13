package joffre.NanifarfallaRest.model;

import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "provincia")
@EntityListeners(AuditingEntityListener.class)

public class Provincia {

	public Provincia() {

		// TODO Auto-generated constructor stub
	}

	public Provincia(int codigo_provincia, int fkcodigo_pais, String nombre_provincia, String claveApi) {
		super();
		this.codigo_provincia = codigo_provincia;

		this.nombre_provincia = nombre_provincia;
		this.claveApi = claveApi;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_provincia;

	@OneToMany(mappedBy = "provincia")
	private Collection<Ciudad> ciudad = new ArrayList<>();

	public Collection<Ciudad> getCiudad() {
		return ciudad;
	}

	public void setCiudad(Collection<Ciudad> ciudad) {
		this.ciudad = ciudad;
	}

	public int getCodigo_provincia() {
		return codigo_provincia;
	}

	public void setCodigo_provincia(int codigo_provincia) {
		this.codigo_provincia = codigo_provincia;
	}

	public String getNombre_provincia() {
		return nombre_provincia;
	}

	public void setNombre_provincia(String nombre_provincia) {
		this.nombre_provincia = nombre_provincia;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	/**
	 * Creado por Joffre Hermosilla 19.05.2019
	 */
//	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
//	@JoinColumn(name = "fkcodigo_pais")
	@JoinColumn(name = "fkcodigo_pais", referencedColumnName = "codigo_pais")
	@ManyToOne
	@JsonBackReference
	Pais pais;

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@NotBlank
	String nombre_provincia;
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
