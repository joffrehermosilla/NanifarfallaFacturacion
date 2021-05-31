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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "alertas")
@EntityListeners(AuditingEntityListener.class)
public class Alerta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_alerta;
	private String mensaje_alerta;
	private String categoria;
	private Double precio;

	private Date version;

	@JoinColumn(name = "fkcodigo_tipoalerta", referencedColumnName = "codigo_tipoalerta")
	@ManyToOne
	@JsonBackReference
	TipoAlerta mTipoAlerta;

	@OneToMany(mappedBy = "mAlerta")
	@JsonBackReference
	private Collection<UserAlerta> useralertas = new ArrayList<>();
	
	
	
	public Collection<UserAlerta> getUseralertas() {
		return useralertas;
	}

	public void setUseralertas(Collection<UserAlerta> useralertas) {
		this.useralertas = useralertas;
	}

	public Alerta() {

	}

	public int getCodigo_alerta() {
		return codigo_alerta;
	}

	public void setCodigo_alerta(int codigo_alerta) {
		this.codigo_alerta = codigo_alerta;
	}

	public String getMensaje_alerta() {
		return mensaje_alerta;
	}

	public void setMensaje_alerta(String mensaje_alerta) {
		this.mensaje_alerta = mensaje_alerta;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public TipoAlerta getmTipoAlerta() {
		return mTipoAlerta;
	}

	public void setmTipoAlerta(TipoAlerta mTipoAlerta) {
		this.mTipoAlerta = mTipoAlerta;
	}

}