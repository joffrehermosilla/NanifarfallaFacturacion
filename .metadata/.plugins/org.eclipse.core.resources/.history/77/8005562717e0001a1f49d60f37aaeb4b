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

@Entity
@Table(name = "lote_insumo")
@EntityListeners(AuditingEntityListener.class)
public class LoteInsumo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_loteinsumo;

	@OneToMany(mappedBy = "mLoteinsumo")

	private Collection<Insumo> insumo = new ArrayList<>();

	@NotBlank
	private String nombre_lote_insumo;

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

	public int getCodigo_loteinsumo() {
		return codigo_loteinsumo;
	}

	public void setCodigo_loteinsumo(int codigo_loteinsumo) {
		this.codigo_loteinsumo = codigo_loteinsumo;
	}

	public Collection<Insumo> getInsumo() {
		return insumo;
	}

	public void setInsumo(Collection<Insumo> insumo) {
		this.insumo = insumo;
	}

	public String getNombre_lote_insumo() {
		return nombre_lote_insumo;
	}

	public void setNombre_lote_insumo(String nombre_lote_insumo) {
		this.nombre_lote_insumo = nombre_lote_insumo;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}
}
