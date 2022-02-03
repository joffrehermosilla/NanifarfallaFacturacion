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
@Table(name = "tipo_alerta")
@EntityListeners(AuditingEntityListener.class)
public class TipoAlerta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_tipoalerta;
	@NotBlank
	String nombre_tipoalerta;
	@NotBlank
	Date version;

	@OneToMany(mappedBy = "mTipoAlerta")
	@JsonBackReference
	private Collection<Alerta> alertas = new ArrayList<>();

	@OneToMany(mappedBy = "mTipoAlerta")
	@JsonBackReference
	private Collection<UserAlerta> useralertas = new ArrayList<>();


	@OneToMany(mappedBy = "mTipoAlerta")
	@JsonBackReference
	private transient Collection<Anuncio> anuncios = new ArrayList<>();
	
	
	
	public Collection<Alerta> getAlertas() {
		return alertas;
	}

	public void setAlertas(Collection<Alerta> alertas) {
		this.alertas = alertas;
	}

	public Collection<UserAlerta> getUseralertas() {
		return useralertas;
	}

	public void setUseralertas(Collection<UserAlerta> useralertas) {
		this.useralertas = useralertas;
	}

	public TipoAlerta() {

	}

	public int getCodigo_tipoalerta() {
		return codigo_tipoalerta;
	}

	public void setCodigo_tipoalerta(int codigo_tipoalerta) {
		this.codigo_tipoalerta = codigo_tipoalerta;
	}

	public String getNombre_tipoalerta() {
		return nombre_tipoalerta;
	}

	public void setNombre_tipoalerta(String nombre_tipoalerta) {
		this.nombre_tipoalerta = nombre_tipoalerta;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
