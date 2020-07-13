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
@Table(name = "tipo_insumo")
@EntityListeners(AuditingEntityListener.class)
public class TipoInsumo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_tipoinsumo;
	
	
	public Collection<Insumo> getInsumo() {
		return insumo;
	}

	public void setInsumo(Collection<Insumo> insumo) {
		this.insumo = insumo;
	}

	@OneToMany(mappedBy = "mTipoinsumo")
   private Collection<Insumo> insumo = new ArrayList<>();
	@NotBlank
	private String nombre_tipo_insumo;

	@NotBlank
	private String claveApi;
	@NotBlank
	private Date version;
	
	
	

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public int getCodigo_tipoinsumo() {
		return codigo_tipoinsumo;
	}

	public void setCodigo_tipoinsumo(int codigo_tipoinsumo) {
		this.codigo_tipoinsumo = codigo_tipoinsumo;
	}

	public String getNombre_tipo_insumo() {
		return nombre_tipo_insumo;
	}

	public void setNombre_tipo_insumo(String nombre_tipo_insumo) {
		this.nombre_tipo_insumo = nombre_tipo_insumo;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}
	
}
