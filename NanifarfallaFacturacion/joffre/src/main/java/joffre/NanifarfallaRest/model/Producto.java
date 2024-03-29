package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

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
@Table(name = "producto")
@EntityListeners(AuditingEntityListener.class)
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_producto;
	@NotBlank
	private String colores_producto;

	@NotBlank
	private String qr_producto;

	@NotBlank
	private Double pvv_producto;

	@NotBlank
	private Double pvf_producto;
	@NotBlank
	private Date ingreso_almacen_producto;

	@NotBlank
	private Date salida_almacen_producto;

	@NotBlank
	private String stock_producto;

	@NotBlank
	private String preparacion_producto;

	@NotBlank
	private String foto_ruta;

	@NotBlank
	private String claveApi;

	@NotBlank
	String nombre_producto;

	@NotBlank
	Date version;
	@NotBlank
	String foto_ruta1;
	@NotBlank
	String foto_ruta2;
	@NotBlank
	String foto_ruta3;
	@NotBlank
	String foto_ruta4;

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public String getFoto_ruta1() {
		return foto_ruta1;
	}

	public void setFoto_ruta1(String foto_ruta1) {
		this.foto_ruta1 = foto_ruta1;
	}

	public String getFoto_ruta2() {
		return foto_ruta2;
	}

	public void setFoto_ruta2(String foto_ruta2) {
		this.foto_ruta2 = foto_ruta2;
	}

	public String getFoto_ruta3() {
		return foto_ruta3;
	}

	public void setFoto_ruta3(String foto_ruta3) {
		this.foto_ruta3 = foto_ruta3;
	}

	public String getFoto_ruta4() {
		return foto_ruta4;
	}

	public void setFoto_ruta4(String foto_ruta4) {
		this.foto_ruta4 = foto_ruta4;
	}

	public Linea getmLinea() {
		return mLinea;
	}

	public void setmLinea(Linea mLinea) {
		this.mLinea = mLinea;
	}

	public TipoProducto getmTipoproducto() {
		return mTipoproducto;
	}

	public void setmTipoproducto(TipoProducto mTipoproducto) {
		this.mTipoproducto = mTipoproducto;
	}

	public EstadoProducto getmEstadoproducto() {
		return mEstadoproducto;
	}

	public void setmEstadoproducto(EstadoProducto mEstadoproducto) {
		this.mEstadoproducto = mEstadoproducto;
	}

	@JoinColumn(name = "fkcodigo_linea", referencedColumnName = "codigo_linea")
	@ManyToOne
	@JsonBackReference
	Linea mLinea;

	@JoinColumn(name = "fkcodigo_tipoproducto", referencedColumnName = "codigo_tipoproducto")
	@ManyToOne
	@JsonBackReference
	TipoProducto mTipoproducto;

	@JoinColumn(name = "fkcodigo_estadoproducto", referencedColumnName = "codigo_estadoproducto")
	@ManyToOne
	@JsonBackReference
	EstadoProducto mEstadoproducto;

	@OneToMany(mappedBy = "mProducto")
	@JsonBackReference
	private Collection<ProductoxPedido> productoxpedido = new ArrayList<>();

	@OneToMany(mappedBy = "mProducto")
	@JsonBackReference
	private Collection<RecetaProductotieneInsumo> recetasproductosinsumos = new ArrayList<>();

	@OneToMany(mappedBy = "mProducto")
	@JsonBackReference
	private Collection<ProductoTieneColores> productoTieneColores = new ArrayList<>();

	@OneToMany(mappedBy = "mProducto")
	@JsonBackReference
	private Collection<Cliente_tiene_preferencia> clienteTienePreferencia = new ArrayList<>();

	public Collection<Cliente_tiene_preferencia> getClienteTienePreferencia() {
		return clienteTienePreferencia;
	}

	public void setClienteTienePreferencia(Collection<Cliente_tiene_preferencia> clienteTienePreferencia) {
		this.clienteTienePreferencia = clienteTienePreferencia;
	}

	public Collection<ProductoTieneColores> getProductoTieneColores() {
		return productoTieneColores;
	}

	public void setProductoTieneColores(Collection<ProductoTieneColores> productoTieneColores) {
		this.productoTieneColores = productoTieneColores;
	}

	public int getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(int codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public Linea getLinea() {
		return mLinea;
	}

	public void setLinea(Linea linea) {
		this.mLinea = linea;
	}

	public TipoProducto getTipoproducto() {
		return mTipoproducto;
	}

	public void setTipoproducto(TipoProducto tipoproducto) {
		this.mTipoproducto = tipoproducto;
	}

	public EstadoProducto getEstadoproducto() {
		return mEstadoproducto;
	}

	public void setEstadoproducto(EstadoProducto estadoproducto) {
		this.mEstadoproducto = estadoproducto;
	}

	public Collection<ProductoxPedido> getProductoxpedido() {
		return productoxpedido;
	}

	public void setProductoxpedido(Collection<ProductoxPedido> productoxpedido) {
		this.productoxpedido = productoxpedido;
	}

	public Collection<RecetaProductotieneInsumo> getRecetasproductosinsumos() {
		return recetasproductosinsumos;
	}

	public void setRecetasproductosinsumos(Collection<RecetaProductotieneInsumo> recetasproductosinsumos) {
		this.recetasproductosinsumos = recetasproductosinsumos;
	}

	public Date getIngreso_almacen_producto() {
		return ingreso_almacen_producto;
	}

	public void setIngreso_almacen_producto(Date ingreso_almacen_producto) {
		this.ingreso_almacen_producto = ingreso_almacen_producto;
	}

	public Date getSalida_almacen_producto() {
		return salida_almacen_producto;
	}

	public void setSalida_almacen_producto(Date salida_almacen_producto) {
		this.salida_almacen_producto = salida_almacen_producto;
	}

	public String getStock_producto() {
		return stock_producto;
	}

	public void setStock_producto(String stock_producto) {
		this.stock_producto = stock_producto;
	}

	public String getPreparacion_producto() {
		return preparacion_producto;
	}

	public void setPreparacion_producto(String preparacion_producto) {
		this.preparacion_producto = preparacion_producto;
	}

	public String getFoto_ruta() {
		return foto_ruta;
	}

	public void setFoto_ruta(String foto_ruta) {
		this.foto_ruta = foto_ruta;
	}

	public String getColores_producto() {
		return colores_producto;
	}

	public void setColores_producto(String colores_producto) {
		this.colores_producto = colores_producto;
	}

	public String getQr_producto() {
		return qr_producto;
	}

	public void setQr_producto(String qr_producto) {
		this.qr_producto = qr_producto;
	}

	public Double getPvv_producto() {
		return pvv_producto;
	}

	public void setPvv_producto(Double pvv_producto) {
		this.pvv_producto = pvv_producto;
	}

	public Double getPvf_producto() {
		return pvf_producto;
	}

	public void setPvf_producto(Double pvf_producto) {
		this.pvf_producto = pvf_producto;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

}
