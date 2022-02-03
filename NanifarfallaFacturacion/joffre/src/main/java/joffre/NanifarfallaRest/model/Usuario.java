package joffre.NanifarfallaRest.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.jboss.aerogear.security.otp.api.Base32;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuario")
@EntityListeners(AuditingEntityListener.class)
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int codigo_usuario;
	@NotBlank
	String nombre_usuario;
	@NotBlank
	String apellido_usuario;

	@NotBlank
	String direccion_usuario;
	@NotBlank
	String nombre_logeo_usuario;
	@NotBlank
	String email;
	@NotBlank
	String claveApi;
	private String foto_usuario;
	private String mensaje_usuario;
	Date version;
	Date fecha_nacimiento_usuario;
	String ruta_foto;

	private boolean enabled;
	private boolean isUsing2FA;
	private String secret;
	@NotBlank
	String password_usuario;

	@NotBlank
	String genero;
	@JoinColumn(name = "fkcodigo_distrito", referencedColumnName = "codigo_distrito")
	@JsonBackReference
	@ManyToOne
	Distrito mDistrito;

	@JoinColumn(name = "fkcodigo_tipousuario", referencedColumnName = "codigo_tipousuario")
	@JsonBackReference
	@ManyToOne
	TipoUsuario mTipousuario;

	@JoinColumn(name = "fkcodigo_estadousuario", referencedColumnName = "codigo_estadousuario")
	@JsonBackReference
	@ManyToOne
	EstadoUsuario mEstadousuario;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "fkcodigo_usuario", referencedColumnName = "codigo_usuario"), inverseJoinColumns = @JoinColumn(name = "fkcodigo_role", referencedColumnName = "codigo_role"))
	private Collection<Role> roles;

	@OneToMany(mappedBy = "mUsuario")
	@JsonBackReference
	private Collection<UserAnuncios> useranuncios = new ArrayList<>();

	@OneToMany(mappedBy = "mUsuario")
	@JsonBackReference
	private Collection<PasswordRessetToken> passwordResetTokens = new ArrayList<>();

	@OneToMany(mappedBy = "mUsuario")
	@JsonBackReference
	private Collection<Cliente_tiene_pedido> cliente_tiene_pedido = new ArrayList<>();

	@OneToMany(mappedBy = "mUsuario")
	@JsonBackReference
	private Collection<Vendedor> vendedor = new ArrayList<>();

	@OneToMany(mappedBy = "mUsuario")
	private Collection<UserRoles> userRoles = new ArrayList<>();

	@OneToMany(mappedBy = "mUsuario")
	@JsonBackReference
	private Collection<VerificationToken> verificationToken = new ArrayList<>();
	

	
	

	@OneToMany(mappedBy = "mUsuario")
	@JsonBackReference
	private Collection<Contrato> contratos = new ArrayList<>();

	@OneToMany(mappedBy = "mUsuario")
	@JsonBackReference
	private Collection<UserAlerta> useralertas = new ArrayList<>();

	@OneToMany(mappedBy = "mUsuario")
	@JsonBackReference
	private Collection<Cliente> cliente = new ArrayList<>();
	
	
	
	 public Usuario() {
	        super();
	        this.secret = Base32.random();
	        this.enabled = false;
	    }
	
	

	public TipoUsuario getmTipousuario() {
		return mTipousuario;
	}

	public void setmTipousuario(TipoUsuario mTipousuario) {
		this.mTipousuario = mTipousuario;
	}

	public EstadoUsuario getmEstadousuario() {
		return mEstadousuario;
	}

	public void setmEstadousuario(EstadoUsuario mEstadousuario) {
		this.mEstadousuario = mEstadousuario;
	}

	public String getFoto_usuario() {
		return foto_usuario;
	}

	public void setFoto_usuario(String foto_usuario) {
		this.foto_usuario = foto_usuario;
	}

	public String getMensaje_usuario() {
		return mensaje_usuario;
	}

	public void setMensaje_usuario(String mensaje_usuario) {
		this.mensaje_usuario = mensaje_usuario;
	}

	public Date getVersion() {
		return version;
	}

	public void setVersion(Date version) {
		this.version = version;
	}

	public Date getFecha_nacimiento_usuario() {
		return fecha_nacimiento_usuario;
	}

	public void setFecha_nacimiento_usuario(Date fecha_nacimiento_usuario) {
		this.fecha_nacimiento_usuario = fecha_nacimiento_usuario;
	}

	public String getRuta_foto() {
		return ruta_foto;
	}

	public void setRuta_foto(String ruta_foto) {
		this.ruta_foto = ruta_foto;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean isUsing2FA() {
		return isUsing2FA;
	}

	public void setUsing2FA(boolean isUsing2FA) {
		this.isUsing2FA = isUsing2FA;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public Collection<UserRoles> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Collection<UserRoles> userRoles) {
		this.userRoles = userRoles;
	}

	public Distrito getmDistrito() {
		return mDistrito;
	}

	public void setmDistrito(Distrito mDistrito) {
		this.mDistrito = mDistrito;
	}

	public Usuario(@NotBlank String nombre_usuario, @NotBlank String apellido_usuario, @NotBlank String email) {
		super();
		this.nombre_usuario = nombre_usuario;
		this.apellido_usuario = apellido_usuario;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Collection<UserAlerta> getUseralertas() {
		return useralertas;
	}

	public void setUseralertas(Collection<UserAlerta> useralertas) {
		this.useralertas = useralertas;
	}

	public Collection<Contrato> getContratos() {
		return contratos;
	}

	public void setContratos(Collection<Contrato> contratos) {
		this.contratos = contratos;
	}

	public Collection<VerificationToken> getVerificationToken() {
		return verificationToken;
	}

	public void setVerificationToken(Collection<VerificationToken> verificationToken) {
		this.verificationToken = verificationToken;
	}

	public Collection<PasswordRessetToken> getPasswordResetTokens() {
		return passwordResetTokens;
	}

	public void setPasswordResetTokens(Collection<PasswordRessetToken> passwordResetTokens) {
		this.passwordResetTokens = passwordResetTokens;
	}

	public Collection<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Collection<Cliente> cliente) {
		this.cliente = cliente;
	}

	public Collection<Vendedor> getVendedor() {
		return vendedor;
	}

	public void setVendedor(Collection<Vendedor> vendedor) {
		this.vendedor = vendedor;
	}

	public Collection<Cliente_tiene_pedido> getCliente_tiene_pedido() {
		return cliente_tiene_pedido;
	}

	public void setCliente_tiene_pedido(Collection<Cliente_tiene_pedido> cliente_tiene_pedido) {
		this.cliente_tiene_pedido = cliente_tiene_pedido;
	}

	public Collection<UserAnuncios> getUseranuncios() {
		return useranuncios;
	}

	public void setUseranuncios(Collection<UserAnuncios> useranuncios) {
		this.useranuncios = useranuncios;
	}

	public int getCodigo_usuario() {
		return codigo_usuario;
	}

	public void setCodigo_usuario(int codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getApellido_usuario() {
		return apellido_usuario;
	}

	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}

	public String getDireccion_usuario() {
		return direccion_usuario;
	}

	public void setDireccion_usuario(String direccion_usuario) {
		this.direccion_usuario = direccion_usuario;
	}

	public String getNombre_logeo_usuario() {
		return nombre_logeo_usuario;
	}

	public void setNombre_logeo_usuario(String nombre_logeo_usuario) {
		this.nombre_logeo_usuario = nombre_logeo_usuario;
	}

	public String getPassword_usuario() {
		return password_usuario;
	}

	public void setPassword_usuario(String password_usuario) {
		this.password_usuario = password_usuario;
	}

	@JsonIgnore
	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public Usuario(@NotBlank String nombre_logeo_usuario, @NotBlank String password_usuario) {
		super();
		this.nombre_logeo_usuario = nombre_logeo_usuario;
		this.password_usuario = password_usuario;
	}


	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((getEmail() == null) ? 0 : getEmail().hashCode());
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
		final Usuario user = (Usuario) obj;
		if (!getEmail().equals(user.getEmail())) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append("Usuario [codigo_usuario=")
		.append(codigo_usuario)
		.append(", nombre_usuario=")
				.append(nombre_usuario).
				append(", apellido_usuario=")
				.append(apellido_usuario)
				.append(", email_usuario=")
				.append(email)
				.append(", password_usuario=")
				.append(password_usuario)
				.append(", enabled=")
				.append(enabled)
				.append(", isUsing2FA2=")
				.append(isUsing2FA)
				.append(", secret=")
				.append(secret)
				.append(", roles=")
				.append(roles).
				append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
