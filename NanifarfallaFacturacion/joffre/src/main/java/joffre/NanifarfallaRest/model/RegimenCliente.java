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

@Entity
@Table(name = "regimen_cliente")
@EntityListeners(AuditingEntityListener.class)
public class RegimenCliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_regimencliente;

	@OneToMany(mappedBy = "mRegimen_cliente")
	@JsonBackReference
	private Collection<Cliente> cliente = new ArrayList<>();

	@NotBlank
	private String nombre_regimencliente;

	public int getCodigo_regimencliente() {
		return codigo_regimencliente;
	}

	public void setCodigo_regimencliente(int codigo_regimencliente) {
		this.codigo_regimencliente = codigo_regimencliente;
	}

	public Collection<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Collection<Cliente> cliente) {
		this.cliente = cliente;
	}

	public String getNombre_regimencliente() {
		return nombre_regimencliente;
	}

	public void setNombre_regimencliente(String nombre_regimencliente) {
		this.nombre_regimencliente = nombre_regimencliente;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	@NotBlank
	private String claveApi;
}
