package joffre.NanifarfallaRest.model;

public class RequestUsuario {
	String nombre_usuario;
	String apellido_usuario;
	String fecha_nacimiento;
	String direccion_usuario;
	String nombre_logeo_usuario;
	String password_usuario;
	String distrito;

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
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
}
