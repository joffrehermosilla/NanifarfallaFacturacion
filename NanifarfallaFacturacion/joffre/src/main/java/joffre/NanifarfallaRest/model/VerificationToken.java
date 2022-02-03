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

import java.util.Calendar;



import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "verificationtoken")
@EntityListeners(AuditingEntityListener.class)
public class VerificationToken {
	
    private static final int EXPIRATION = 60 * 24;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_verificationtoken;
	Date expiryDate;
	String token;
	
	
	@JoinColumn(name = "fkcodigo_usuario", referencedColumnName = "codigo_usuario")
	@ManyToOne
	@JsonBackReference
	Usuario mUsuario;
	
	
	
	
	
	// int fkcodigo_usuario;
	Date version;

	public VerificationToken() {

	}
	
    public VerificationToken(final String token) {
        super();

        this.token = token;
        this.expiryDate = calculateExpiryDate(EXPIRATION);
    }

    public VerificationToken(final String token, final Usuario user) {
        super();

        this.token = token;
        this.mUsuario = user;
        this.expiryDate = calculateExpiryDate(EXPIRATION);
    }

	public int getCodigo_verificationtoken() {
		return codigo_verificationtoken;
	}

	public void setCodigo_verificationtoken(int codigo_verificationtoken) {
		this.codigo_verificationtoken = codigo_verificationtoken;
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
	
	
	   private Date calculateExpiryDate(final int expiryTimeInMinutes) {
	        final Calendar cal = Calendar.getInstance();
	        cal.setTimeInMillis(new Date().getTime());
	        cal.add(Calendar.MINUTE, expiryTimeInMinutes);
	        return new Date(cal.getTime().getTime());
	    }

	    public void updateToken(final String token) {
	        this.token = token;
	        this.expiryDate = calculateExpiryDate(EXPIRATION);
	    }

	    //

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((getExpiryDate() == null) ? 0 : getExpiryDate().hashCode());
	        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
	        result = prime * result + ((getmUsuario() == null) ? 0 : getmUsuario().hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(final Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final VerificationToken other = (VerificationToken) obj;
	        if (getExpiryDate() == null) {
	            if (other.getExpiryDate() != null) {
	                return false;
	            }
	        } else if (!getExpiryDate().equals(other.getExpiryDate())) {
	            return false;
	        }
	        if (getToken() == null) {
	            if (other.getToken() != null) {
	                return false;
	            }
	        } else if (!getToken().equals(other.getToken())) {
	            return false;
	        }
	        if (getmUsuario() == null) {
	            if (other.getmUsuario() != null) {
	                return false;
	            }
	        } else if (!getmUsuario().equals(other.getmUsuario())) {
	            return false;
	        }
	        return true;
	    }

	    @Override
	    public String toString() {
	        final StringBuilder builder = new StringBuilder();
	        builder.append("Token [String=").append(token).append("]").append("[Expires").append(expiryDate).append("]");
	        return builder.toString();
	    }

	
	

}
