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
@Table(name = "promocion_venta")
@EntityListeners(AuditingEntityListener.class)
public class PromocionVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_promocion_venta;

	@OneToMany(mappedBy = "mPromocion_venta")
	private Collection<Cliente_tiene_pedido> cliente_tiene_pedido = new ArrayList<>();

	@NotBlank
	int cantidad_sku_pedido;

	@NotBlank
	Double descuento_sku_pedido;

	@NotBlank
	Date fecha_inicio_promocion;

	@NotBlank
	Date fecha_expiracion_promocion;

	@NotBlank
	String descripcion_promocion;

	public int getCodigo_promocion_venta() {
		return codigo_promocion_venta;
	}

	public void setCodigo_promocion_venta(int codigo_promocion_venta) {
		this.codigo_promocion_venta = codigo_promocion_venta;
	}

	public Collection<Cliente_tiene_pedido> getCliente_tiene_pedido() {
		return cliente_tiene_pedido;
	}

	public void setCliente_tiene_pedido(Collection<Cliente_tiene_pedido> cliente_tiene_pedido) {
		this.cliente_tiene_pedido = cliente_tiene_pedido;
	}

	public int getCantidad_sku_pedido() {
		return cantidad_sku_pedido;
	}

	public void setCantidad_sku_pedido(int cantidad_sku_pedido) {
		this.cantidad_sku_pedido = cantidad_sku_pedido;
	}

	public Double getDescuento_sku_pedido() {
		return descuento_sku_pedido;
	}

	public void setDescuento_sku_pedido(Double descuento_sku_pedido) {
		this.descuento_sku_pedido = descuento_sku_pedido;
	}

	public Date getFecha_inicio_promocion() {
		return fecha_inicio_promocion;
	}

	public void setFecha_inicio_promocion(Date fecha_inicio_promocion) {
		this.fecha_inicio_promocion = fecha_inicio_promocion;
	}

	public Date getFecha_expiracion_promocion() {
		return fecha_expiracion_promocion;
	}

	public void setFecha_expiracion_promocion(Date fecha_expiracion_promocion) {
		this.fecha_expiracion_promocion = fecha_expiracion_promocion;
	}

	public String getDescripcion_promocion() {
		return descripcion_promocion;
	}

	public void setDescripcion_promocion(String descripcion_promocion) {
		this.descripcion_promocion = descripcion_promocion;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

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

}
