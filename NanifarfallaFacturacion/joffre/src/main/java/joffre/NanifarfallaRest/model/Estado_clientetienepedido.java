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

@Entity
@Table(name = "estado_cliente_tiene_pedido")
@EntityListeners(AuditingEntityListener.class)
public class Estado_clientetienepedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_estado_cliente_tiene_pedido;

	@OneToMany(mappedBy = "mEstado_cliente_tiene_pedido")
	private Collection<Cliente_tiene_pedido> cliente_tiene_pedido = new ArrayList<>();

	@NotBlank
	String nombre_estado_cliente_tiene_pedido;

	@NotBlank
	String foto_ruta;

	@NotBlank
	String claveApi;
	
	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	@NotBlank
	Date version;

	public int getCodigo_estado_cliente_tiene_pedido() {
		return codigo_estado_cliente_tiene_pedido;
	}

	public void setCodigo_estado_cliente_tiene_pedido(int codigo_estado_cliente_tiene_pedido) {
		this.codigo_estado_cliente_tiene_pedido = codigo_estado_cliente_tiene_pedido;
	}

	public Collection<Cliente_tiene_pedido> getCliente_tiene_pedido() {
		return cliente_tiene_pedido;
	}

	public void setCliente_tiene_pedido(Collection<Cliente_tiene_pedido> cliente_tiene_pedido) {
		this.cliente_tiene_pedido = cliente_tiene_pedido;
	}

	public String getNombre_estado_cliente_tiene_pedido() {
		return nombre_estado_cliente_tiene_pedido;
	}

	public void setNombre_estado_cliente_tiene_pedido(String nombre_estado_cliente_tiene_pedido) {
		this.nombre_estado_cliente_tiene_pedido = nombre_estado_cliente_tiene_pedido;
	}

	public String getFoto_ruta() {
		return foto_ruta;
	}

	public void setFoto_ruta(String foto_ruta) {
		this.foto_ruta = foto_ruta;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}
}
