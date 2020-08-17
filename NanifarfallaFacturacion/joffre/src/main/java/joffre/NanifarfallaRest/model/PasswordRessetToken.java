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
@Table(name = "passwordresettoken")
@EntityListeners(AuditingEntityListener.class)
public class PasswordRessetToken {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_passwordresttoken;
	@NotBlank
	Date expiryDate;
	@NotBlank
	String token;
	@JoinColumn(name = "fkcodigo_usuario", referencedColumnName = "codigo_usuario")
	@ManyToOne
	@JsonBackReference
	Usuario mUsuario;
	// int fkcodigo_usuario;

	@NotBlank
	Date version;
	@NotBlank
	String claveApi;

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public PasswordRessetToken() {

	}

	public int getCodigo_passwordresttoken() {
		return codigo_passwordresttoken;
	}

	public void setCodigo_passwordresttoken(int codigo_passwordresttoken) {
		this.codigo_passwordresttoken = codigo_passwordresttoken;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Usuario getmUsuario() {
		return mUsuario;
	}

	public void setmUsuario(Usuario mUsuario) {
		this.mUsuario = mUsuario;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

}
