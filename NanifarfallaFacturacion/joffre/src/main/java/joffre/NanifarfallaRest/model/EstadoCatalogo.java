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

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "estado_catalogo")
@EntityListeners(AuditingEntityListener.class)
public class EstadoCatalogo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_estadoCatalogo;
	String descripcion;
	String claveApi;
	Date version;

	@OneToMany(mappedBy = "mEstadoCatalogo")
	@JsonBackReference
	private Collection<Catalogo> catalogos = new ArrayList<>();

	public EstadoCatalogo() {

	}

	public int getCodigo_estadoCatalogo() {
		return codigo_estadoCatalogo;
	}

	public void setCodigo_estadoCatalogo(int codigo_estadoCatalogo) {
		this.codigo_estadoCatalogo = codigo_estadoCatalogo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public Collection<Catalogo> getCatalogos() {
		return catalogos;
	}

	public void setCatalogos(Collection<Catalogo> catalogos) {
		this.catalogos = catalogos;
	}

}
