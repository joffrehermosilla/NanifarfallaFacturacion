package joffre.NanifarfallaRest.model;

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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "presentacion_insumo")
@EntityListeners(AuditingEntityListener.class)
public class PresentacionInsumo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_presentacioninsumo;

	@NotBlank
	private String nombre_presentacion_insumo;
	@OneToMany(mappedBy = "mPresentacion_insumo")
	@JsonBackReference
	private Collection<Insumo> insumo = new ArrayList<>();

	@NotBlank
	private String claveApi;
	@NotBlank
	private Date version;

	public int getCodigo_presentacioninsumo() {
		return codigo_presentacioninsumo;
	}

	public void setCodigo_presentacioninsumo(int codigo_presentacioninsumo) {
		this.codigo_presentacioninsumo = codigo_presentacioninsumo;
	}

	public String getNombre_presentacion_insumo() {
		return nombre_presentacion_insumo;
	}

	public void setNombre_presentacion_insumo(String nombre_presentacion_insumo) {
		this.nombre_presentacion_insumo = nombre_presentacion_insumo;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public Collection<Insumo> getInsumo() {
		return insumo;
	}

	public void setInsumo(Collection<Insumo> insumo) {
		this.insumo = insumo;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
