package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Usuario {
	private final int idUsuario;
    private final String username;
    private final String password;
    private final String nombreUsuario;
    private final String apellidoUsuario;
    private final String rol;
    private final boolean estado; //activo - eliminado 
    
    // constructor
	public Usuario(int idUsuario, String username, String password, String nombreUsuario, String apellidoUsuario,
			String rol, boolean estado) {
	
		this.idUsuario = idUsuario;
		this.username = username;
		this.password = password;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.rol = rol;
		this.estado = estado;
	}
	
    // getter y setter
	public int getIdUsuario() {
		return idUsuario;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	public String getRol() {
		return rol;
	}
	public boolean isEstado() {
		return estado;
	}
	
	// to String
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", username=" + username + ", password=" + password
				+ ", nombreUsuario=" + nombreUsuario + ", apellidoUsuario=" + apellidoUsuario + ", rol=" + rol
				+ ", estado=" + estado + "]";
	}
	
	
}
