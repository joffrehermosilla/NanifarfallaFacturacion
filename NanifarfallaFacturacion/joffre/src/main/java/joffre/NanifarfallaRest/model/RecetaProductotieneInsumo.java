package joffre.NanifarfallaRest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "rece_produ_ti_insumo")
@EntityListeners(AuditingEntityListener.class)
public class RecetaProductotieneInsumo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo_rece_produ_ti_insumo;

	@JoinColumn(name = "fkcodigo_producto", referencedColumnName = "codigo_producto")
	@ManyToOne
	@JsonBackReference
	Producto mProducto;

	@JoinColumn(name = "fkcodigo_insumo", referencedColumnName = "codigo_insumo")
	@ManyToOne
	@JsonBackReference
	Insumo mInsumo;

	@JoinColumn(name = "fkcodigo_elaboracionproducto", referencedColumnName = "codigo_elaboracionproducto")
	@ManyToOne
	@JsonBackReference
	ElaboracionProducto mElaboracionproducto;

	@NotBlank
	private Double cantidad_usada;

	@NotBlank
	private Date fecha_creacion;

	@NotBlank
	private String descripcion;

	@NotBlank
	private Double dimension_altura;

	@NotBlank
	private Double dimension_anchura;

	@NotBlank
	private Double dimension_espesor;

	@NotBlank
	private Double dimension_profundidad;

	@NotBlank
	private Double porcentaje_en_producto;

	@NotBlank
	private Double peso;

	@NotBlank
	private String claveApi;

	@NotBlank
	private Date version;

	public RecetaProductotieneInsumo() {

	}

	public Producto getmProducto() {
		return mProducto;
	}

	public void setmProducto(Producto mProducto) {
		this.mProducto = mProducto;
	}

	public Insumo getmInsumo() {
		return mInsumo;
	}

	public void setmInsumo(Insumo mInsumo) {
		this.mInsumo = mInsumo;
	}

	public ElaboracionProducto getmElaboracionproducto() {
		return mElaboracionproducto;
	}

	public void setmElaboracionproducto(ElaboracionProducto mElaboracionproducto) {
		this.mElaboracionproducto = mElaboracionproducto;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public int getCodigo_rece_produ_ti_insumo() {
		return codigo_rece_produ_ti_insumo;
	}

	public void setCodigo_rece_produ_ti_insumo(int codigo_rece_produ_ti_insumo) {
		this.codigo_rece_produ_ti_insumo = codigo_rece_produ_ti_insumo;
	}

	public Producto getProducto() {
		return mProducto;
	}

	public void setProducto(Producto producto) {
		this.mProducto = producto;
	}

	public Insumo getInsumo() {
		return mInsumo;
	}

	public void setInsumo(Insumo insumo) {
		this.mInsumo = insumo;
	}

	public ElaboracionProducto getElaboracionproducto() {
		return mElaboracionproducto;
	}

	public void setElaboracionproducto(ElaboracionProducto elaboracionproducto) {
		this.mElaboracionproducto = elaboracionproducto;
	}

	public Double getCantidad_usada() {
		return cantidad_usada;
	}

	public void setCantidad_usada(Double cantidad_usada) {
		this.cantidad_usada = cantidad_usada;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getDimension_altura() {
		return dimension_altura;
	}

	public void setDimension_altura(Double dimension_altura) {
		this.dimension_altura = dimension_altura;
	}

	public Double getDimension_anchura() {
		return dimension_anchura;
	}

	public void setDimension_anchura(Double dimension_anchura) {
		this.dimension_anchura = dimension_anchura;
	}

	public Double getDimension_espesor() {
		return dimension_espesor;
	}

	public void setDimension_espesor(Double dimension_espesor) {
		this.dimension_espesor = dimension_espesor;
	}

	public Double getDimension_profundidad() {
		return dimension_profundidad;
	}

	public void setDimension_profundidad(Double dimension_profundidad) {
		this.dimension_profundidad = dimension_profundidad;
	}

	public Double getPorcentaje_en_producto() {
		return porcentaje_en_producto;
	}

	public void setPorcentaje_en_producto(Double porcentaje_en_producto) {
		this.porcentaje_en_producto = porcentaje_en_producto;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

}
