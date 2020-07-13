package joffre.NanifarfallaRest.model;

import java.util.Date;


public class ContactModel {

	private int codigo_usuario;

	private String nombre_usuario;

	private String apellido_usuario;

	private Date fecha_nacimiento;
	
	private String nombre_logeo_usuario;

	private String password_usuario;

	private String ruta_foto_usuario;

	private String claveApi;

	public ContactModel(int codigo_usuario, String nombre_usuario, String apellido_usuario, Date fecha_nacimiento,
			String direccion_usuario, String nombre_logeo_usuario, String password_usuario, String ruta_foto_usuario,
			String claveApi) {
		super();
		this.codigo_usuario = codigo_usuario;
		this.nombre_usuario = nombre_usuario;
		this.apellido_usuario = apellido_usuario;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direccion_usuario = direccion_usuario;
		this.nombre_logeo_usuario = nombre_logeo_usuario;
		this.password_usuario = password_usuario;
		this.ruta_foto_usuario = ruta_foto_usuario;
		this.claveApi = claveApi;
	}

	@Override
	public String toString() {
		return "ContactModel [codigo_usuario=" + codigo_usuario + ", nombre_usuario=" + nombre_usuario
				+ ", apellido_usuario=" + apellido_usuario + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", nombre_logeo_usuario=" + nombre_logeo_usuario + ", password_usuario=" + password_usuario
				+ ", ruta_foto_usuario=" + ruta_foto_usuario + ", claveApi=" + claveApi + ", direccion_usuario="
				+ direccion_usuario + "]";
	}

	private String direccion_usuario;

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

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
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

	public String getRuta_foto_usuario() {
		return ruta_foto_usuario;
	}

	public void setRuta_foto_usuario(String ruta_foto_usuario) {
		this.ruta_foto_usuario = ruta_foto_usuario;
	}

	public String getClaveApi() {
		return claveApi;
	}

	public void setClaveApi(String claveApi) {
		this.claveApi = claveApi;
	}

	public ContactModel() {
	
	}


}
