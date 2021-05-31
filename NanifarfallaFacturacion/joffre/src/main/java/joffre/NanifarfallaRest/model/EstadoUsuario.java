package joffre.NanifarfallaRest.model;
import java.util.ArrayList;
import java.util.Collection;

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
@Table(name = "estadousuario")
@EntityListeners(AuditingEntityListener.class)
public class EstadoUsuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_estadousuario;

	@NotBlank
	String nombre_estadousuario;

	@NotBlank
	String claveApi;
	
	public int getCodigo_estadousuario() {
		return codigo_estadousuario;
	}

	public void setCodigo_estadousuario(int codigo_estadousuario) {
		this.codigo_estadousuario = codigo_estadousuario;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public Collection<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(Collection<Usuario> usuario) {
		this.usuario = usuario;
	}

	@OneToMany(mappedBy = "mEstadousuario")
	@JsonBackReference
	private Collection<Usuario> usuario = new ArrayList<>();

	@JsonProperty("estado")
	public String getNombre_estadousuario() {
		return nombre_estadousuario;
	}

	public void setNombre_estadousuario(String nombre_estadousuario) {
		this.nombre_estadousuario = nombre_estadousuario;
	}
}
