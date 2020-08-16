package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;

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
@Table(name = "ciudad")
@EntityListeners(AuditingEntityListener.class)
public class Ciudad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_ciudad;
	String nombre_ciudad;

	String claveApi;

	@JoinColumn(name = "fkcodigo_provincia", referencedColumnName = "codigo_provincia")
	@ManyToOne
	@JsonBackReference
	Provincia provincia;

	@OneToMany(mappedBy = "ciudad")
	private Collection<Distrito> distrito = new ArrayList<>();

	public Collection<Distrito> getDistrito() {
		return distrito;
	}

	public void setDistrito(Collection<Distrito> distrito) {
		this.distrito = distrito;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public int getCodigo_ciudad() {
		return codigo_ciudad;
	}

	public void setCodigo_ciudad(int codigo_ciudad) {
		this.codigo_ciudad = codigo_ciudad;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}

	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

}
