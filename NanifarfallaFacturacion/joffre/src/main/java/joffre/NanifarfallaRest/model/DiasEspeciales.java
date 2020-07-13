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
@Table(name = "diasespeciales")
@EntityListeners(AuditingEntityListener.class)
public class DiasEspeciales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_diasespeciales;
	@NotBlank
	String detalles_diasespeciales;
	@JoinColumn(name = "fkcodigo_pais", referencedColumnName = "codigo_pais")
	@ManyToOne
	@JsonBackReference
	Pais pais;
	@NotBlank
	private Date fecha_diasespeciales;
	@NotBlank
	private String claveApi;
	public int getCodigo_diasespeciales() {
		return codigo_diasespeciales;
	}
	public void setCodigo_diasespeciales(int codigo_diasespeciales) {
		this.codigo_diasespeciales = codigo_diasespeciales;
	}
	public String getDetalles_diasespeciales() {
		return detalles_diasespeciales;
	}
	public void setDetalles_diasespeciales(String detalles_diasespeciales) {
		this.detalles_diasespeciales = detalles_diasespeciales;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Date getFecha_diasespeciales() {
		return fecha_diasespeciales;
	}
	public void setFecha_diasespeciales(Date fecha_diasespeciales) {
		this.fecha_diasespeciales = fecha_diasespeciales;
	}
	public String getClaveApi() {
		return claveApi;
	}
	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}
	@Override
	public String toString() {
		return "DiasEspeciales [codigo_diasespeciales=" + codigo_diasespeciales + ", detalles_diasespeciales="
				+ detalles_diasespeciales + ", pais=" + pais + ", fecha_diasespeciales=" + fecha_diasespeciales
				+ ", claveApi=" + claveApi + "]";
	}
	public DiasEspeciales(int codigo_diasespeciales, String detalles_diasespeciales, Pais pais,
			@NotBlank Date fecha_diasespeciales, @NotBlank String claveApi) {
		super();
		this.codigo_diasespeciales = codigo_diasespeciales;
		this.detalles_diasespeciales = detalles_diasespeciales;
		this.pais = pais;
		this.fecha_diasespeciales = fecha_diasespeciales;
		this.claveApi = claveApi;
	}
	public DiasEspeciales() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	

}
