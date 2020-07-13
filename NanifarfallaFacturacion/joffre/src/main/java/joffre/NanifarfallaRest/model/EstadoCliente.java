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

@Entity
@Table(name = "estado_cliente")
@EntityListeners(AuditingEntityListener.class)
public class EstadoCliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_estadocliente;

	@OneToMany(mappedBy = "mEstado_cliente")
	private Collection<Cliente> cliente = new ArrayList<>();
	@NotBlank
	private String nombre_estadocliente;

	@NotBlank
	private String claveApi;

	public int getCodigo_estadocliente() {
		return codigo_estadocliente;
	}

	public void setCodigo_estadocliente(int codigo_estadocliente) {
		this.codigo_estadocliente = codigo_estadocliente;
	}

	public Collection<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Collection<Cliente> cliente) {
		this.cliente = cliente;
	}

	public String getNombre_estadocliente() {
		return nombre_estadocliente;
	}

	public void setNombre_estadocliente(String nombre_estadocliente) {
		this.nombre_estadocliente = nombre_estadocliente;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}
}
