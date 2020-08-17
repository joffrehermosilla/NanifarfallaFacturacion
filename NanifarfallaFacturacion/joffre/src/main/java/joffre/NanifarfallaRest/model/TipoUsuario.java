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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "tipousuario")
@EntityListeners(AuditingEntityListener.class)
public class TipoUsuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_tipousuario;

	@NotBlank
	String nombre_tipousuario;

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

	public int getCodigo_tipousuario() {
		return codigo_tipousuario;
	}

	public void setCodigo_tipousuario(int codigo_tipousuario) {
		this.codigo_tipousuario = codigo_tipousuario;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	@OneToMany(mappedBy = "tipousuario")
	@JsonBackReference
	private Collection<Usuario> usuario = new ArrayList<>();

	@JsonProperty("tipo")
	public String getNombre_tipousuario() {
		return nombre_tipousuario;
	}

	public void setNombre_tipousuario(String nombre_tipousuario) {
		this.nombre_tipousuario = nombre_tipousuario;
	}

	public Collection<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Collection<Usuario> usuario) {
		this.usuario = usuario;
	}
}
