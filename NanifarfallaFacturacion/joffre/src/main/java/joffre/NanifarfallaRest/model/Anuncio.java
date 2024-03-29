package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "anuncios")
@EntityListeners(AuditingEntityListener.class)
public class Anuncio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_anuncio;
	@NotBlank
	private String mensaje_anuncio;
	@NotBlank
	private String anuncio_principal;
	@NotBlank
	private String pie_mensaje;
	@NotBlank
	private String link_mensaje = "";
	@NotBlank
	private String ruta_imagen = "";
	@NotBlank
	private Double precio = 0.0;
	// private int fkcodigo_tipoalerta;
	@NotBlank
	private Date version;

	@NotBlank
	String claveApi;

	@OneToMany(mappedBy = "mAnuncio", fetch = FetchType.EAGER)
	@JsonBackReference
	private Collection<UserAnuncios> useranuncios = new ArrayList<>();
	
	

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public Collection<UserAnuncios> getUseranuncios() {
		return useranuncios;
	}

	public void setUseranuncios(Collection<UserAnuncios> useranuncios) {
		this.useranuncios = useranuncios;
	}

	public Anuncio() {

	}

	public int getCodigo_anuncio() {
		return codigo_anuncio;
	}

	public void setCodigo_anuncio(int codigo_anuncio) {
		this.codigo_anuncio = codigo_anuncio;
	}

	public String getMensaje_anuncio() {
		return mensaje_anuncio;
	}

	public void setMensaje_anuncio(String mensaje_anuncio) {
		this.mensaje_anuncio = mensaje_anuncio;
	}

	public String getAnuncio_principal() {
		return anuncio_principal;
	}

	public void setAnuncio_principal(String anuncio_principal) {
		this.anuncio_principal = anuncio_principal;
	}

	public String getPie_mensaje() {
		return pie_mensaje;
	}

	public void setPie_mensaje(String pie_mensaje) {
		this.pie_mensaje = pie_mensaje;
	}

	public String getLink_mensaje() {
		return link_mensaje;
	}

	public void setLink_mensaje(String link_mensaje) {
		this.link_mensaje = link_mensaje;
	}

	public String getRuta_imagen() {
		return ruta_imagen;
	}

	public void setRuta_imagen(String ruta_imagen) {
		this.ruta_imagen = ruta_imagen;
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
