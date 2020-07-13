package joffre.NanifarfallaRest.model;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Entity
@Table(name = "pin")
@EntityListeners(AuditingEntityListener.class)
public class Pin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_pin;
	String value;
	String idUsuario;
	
	public int getCodigo_pin() {
		return codigo_pin;
	}
	public void setCodigo_pin(int codigo_pin) {
		this.codigo_pin = codigo_pin;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
}
