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
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "igv_venta")
@EntityListeners(AuditingEntityListener.class)
public class IgvVenta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_igv_venta;

	@OneToMany(mappedBy = "mIgv_venta")
	private Collection<Cliente_tiene_pedido> clientetienepedido = new ArrayList<>();

	@JoinColumn(name = "fkcodigo_tipo_impuesto", referencedColumnName = "codigo_tipo_impuesto")
	@ManyToOne
	@JsonBackReference
	TipoImpuesto mTipoimpuesto;

	@NotBlank
	private Double porcentaje_igv;

	public int getCodigo_igvventa() {
		return codigo_igv_venta;
	}

	public void setCodigo_igvventa(int codigo_igvventa) {
		this.codigo_igv_venta = codigo_igvventa;
	}

	public Collection<Cliente_tiene_pedido> getClientetienepedido() {
		return clientetienepedido;
	}

	public void setClientetienepedido(Collection<Cliente_tiene_pedido> clientetienepedido) {
		this.clientetienepedido = clientetienepedido;
	}

	public TipoImpuesto getTipoimpuesto() {
		return mTipoimpuesto;
	}

	public void setTipoimpuesto(TipoImpuesto tipoimpuesto) {
		this.mTipoimpuesto = tipoimpuesto;
	}

	public Double getPorcentaje_igv() {
		return porcentaje_igv;
	}

	public void setPorcentaje_igv(Double porcentaje_igv) {
		this.porcentaje_igv = porcentaje_igv;
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
