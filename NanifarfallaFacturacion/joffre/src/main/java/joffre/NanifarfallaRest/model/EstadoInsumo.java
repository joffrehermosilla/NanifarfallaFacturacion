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
@Table(name = "estado_insumo")
@EntityListeners(AuditingEntityListener.class)
public class EstadoInsumo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_estadoinsumo;

	@OneToMany(mappedBy = "mEstadoinsumo")
	@JsonBackReference
	private Collection<Insumo> insumo = new ArrayList<>();

	@NotBlank
	private String nombre_estado_insumo;

	@NotBlank
	private String claveApi;

	@NotBlank
	Date version;

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public int getCodigo_estadoinsumo() {
		return codigo_estadoinsumo;
	}

	public void setCodigo_estadoinsumo(int codigo_estadoinsumo) {
		this.codigo_estadoinsumo = codigo_estadoinsumo;
	}

	public Collection<Insumo> getInsumo() {
		return insumo;
	}

	public void setInsumo(Collection<Insumo> insumo) {
		this.insumo = insumo;
	}

	public String getNombre_estado_insumo() {
		return nombre_estado_insumo;
	}

	public void setNombre_estado_insumo(String nombre_estado_insumo) {
		this.nombre_estado_insumo = nombre_estado_insumo;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}
}
