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
@Table(name = "area")
@EntityListeners(AuditingEntityListener.class)
public class Area {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_area;

	@NotBlank
	String nombre_area;

	@NotBlank
	String claveApi;

	@NotBlank
	Date version;

	@OneToMany(mappedBy = "area")
	@JsonBackReference
	private Collection<Vendedor> vendedor = new ArrayList<>();

	public int getCodigo_area() {
		return codigo_area;
	}

	public void setCodigo_area(int codigo_area) {
		this.codigo_area = codigo_area;
	}

	public String getNombre_area() {
		return nombre_area;
	}

	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public Collection<Vendedor> getVendedor() {
		return vendedor;
	}

	public void setVendedor(Collection<Vendedor> vendedor) {
		this.vendedor = vendedor;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
