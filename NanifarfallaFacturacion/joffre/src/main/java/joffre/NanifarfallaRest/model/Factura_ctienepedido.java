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
@Table(name = "factura_c_tiene_pedido")
@EntityListeners(AuditingEntityListener.class)
public class Factura_ctienepedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_factura_cliente_tiene_pedido;

//
	@OneToMany(mappedBy = "mFactura_cliente_tiene_pedido")
	@JsonBackReference
	private Collection<Cliente_tiene_pedido> cliente_tiene_pedido = new ArrayList<>();

	@NotBlank
	String nombre_factura_cliente_tiene_pedido;

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

	public int getCodigo_factura_cliente_tiene_pedido() {
		return codigo_factura_cliente_tiene_pedido;
	}

	public void setCodigo_factura_cliente_tiene_pedido(int codigo_factura_cliente_tiene_pedido) {
		this.codigo_factura_cliente_tiene_pedido = codigo_factura_cliente_tiene_pedido;
	}

	public Collection<Cliente_tiene_pedido> getCliente_tiene_pedido() {
		return cliente_tiene_pedido;
	}

	public void setCliente_tiene_pedido(Collection<Cliente_tiene_pedido> cliente_tiene_pedido) {
		this.cliente_tiene_pedido = cliente_tiene_pedido;
	}

	public String getNombre_factura_cliente_tiene_pedido() {
		return nombre_factura_cliente_tiene_pedido;
	}

	public void setNombre_factura_cliente_tiene_pedido(String nombre_factura_cliente_tiene_pedido) {
		this.nombre_factura_cliente_tiene_pedido = nombre_factura_cliente_tiene_pedido;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

}
