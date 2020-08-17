package joffre.NanifarfallaRest.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "pais")
@EntityListeners(AuditingEntityListener.class)
public class Pais {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_pais;

	@NotBlank
	private String nombre_pais;

	@NotBlank
	private String claveApi;

	@OneToMany(mappedBy = "pais")
	@JsonBackReference
	private Collection<Provincia> provincias = new ArrayList<>();

	@OneToMany(mappedBy = "pais")
	@JsonBackReference
	private Collection<DiasEspeciales> diasespeciales = new ArrayList<>();

	public Collection<DiasEspeciales> getDiasespeciales() {
		return diasespeciales;
	}

	public void setDiasespeciales(Collection<DiasEspeciales> diasespeciales) {
		this.diasespeciales = diasespeciales;
	}

	public Collection<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(Collection<Provincia> provincias) {
		this.provincias = provincias;
	}

//	@Column(nullable = false, updatable = false)
//	@Temporal(TemporalType.TIMESTAMP)
//	@CreatedDate
//	private Date createdAt;
//
//	@Column(nullable = false)
//	@Temporal(TemporalType.TIMESTAMP)
//	@LastModifiedDate
//	private Date updatedAt;

	public int getCodigo_pais() {
		return codigo_pais;
	}

	public void setCodigo_pais(int codigo_pais) {
		this.codigo_pais = codigo_pais;
	}

	public String getNombre_pais() {
		return nombre_pais;
	}

	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

//	public Date getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(Date createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public Date getUpdatedAt() {
//		return updatedAt;
//	}
//
//	public void setUpdatedAt(Date updatedAt) {
//		this.updatedAt = updatedAt;
//	}

	@Override
	public String toString() {
		return "Pais [codigo_pais=" + codigo_pais + ", nombre_pais=" + nombre_pais + ", claveApi=" + claveApi + "]";
	}

	public Pais(int codigo_pais, @NotBlank String nombre_pais, @NotBlank String claveApi) {
		super();
		this.codigo_pais = codigo_pais;
		this.nombre_pais = nombre_pais;
		this.claveApi = claveApi;
	}

	public Pais() {

	}

}
