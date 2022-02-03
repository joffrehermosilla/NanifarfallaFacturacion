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

@Entity
@Table(name = "user_anuncios")
@EntityListeners(AuditingEntityListener.class)
public class UserAnuncios {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_user_anuncio;
	@JoinColumn(name = "fkcodigo_anuncio", referencedColumnName = "codigo_anuncio")
	@ManyToOne
	@JsonBackReference
	Anuncio mAnuncio;
	// int fkcodigo_anuncio;
	@JoinColumn(name = "fkcodigo_usuario", referencedColumnName = "codigo_usuario")
	@ManyToOne
	@JsonBackReference
	Usuario mUsuario;
	// int fkcodigo_usuario;
	@NotBlank
	Date fecha_inicio;
	@NotBlank
	Date fecha_fin;
	@NotBlank
	Double precio;
	@NotBlank
	Date version;

	@OneToMany(mappedBy = "mUserAnuncios")
	@JsonBackReference
	private Collection<Contrato> contratos = new ArrayList<>();

	public Collection<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(Collection<Contrato> contratos) {
		this.contratos = contratos;
	}

	public UserAnuncios() {

	}

	public int getCodigo_user_anuncio() {
		return codigo_user_anuncio;
	}

	public void setCodigo_user_anuncio(int codigo_user_anuncio) {
		this.codigo_user_anuncio = codigo_user_anuncio;
	}

	public Anuncio getmAnuncio() {
		return mAnuncio;
	}

	public void setmAnuncio(Anuncio mAnuncio) {
		this.mAnuncio = mAnuncio;
	}

	public Usuario getmUsuario() {
		return mUsuario;
	}

	public void setmUsuario(Usuario mUsuario) {
		this.mUsuario = mUsuario;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
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

}
