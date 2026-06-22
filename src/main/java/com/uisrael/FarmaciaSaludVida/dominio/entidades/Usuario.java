package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Usuario {
	private final int id_usuario;
    private final String username;
    private final String password;
    private final String nombre_usuario;
    private final String apellido_usuario;
    private final String nombre_rol;
    private final boolean estado;
    
    // constructor
	public Usuario(int id_usuario, String username, String password, String nombre_usuario, String apellido_usuario,
			String nombre_rol, boolean estado) {
		
		this.id_usuario = id_usuario;
		this.username = username;
		this.password = password;
		this.nombre_usuario = nombre_usuario;
		this.apellido_usuario = apellido_usuario;
		this.nombre_rol = nombre_rol;
		this.estado = estado;
	}
	
	// getter y setter
	public int getId_usuario() {
		return id_usuario;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public String getApellido_usuario() {
		return apellido_usuario;
	}

	public String getNombre_rol() {
		return nombre_rol;
	}

	public boolean isEstado() {
		return estado;
	}

	// to String
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", username=" + username + ", password=" + password
				+ ", nombre_usuario=" + nombre_usuario + ", apellido_usuario=" + apellido_usuario + ", nombre_rol="
				+ nombre_rol + ", estado=" + estado + "]";
	} 
}
