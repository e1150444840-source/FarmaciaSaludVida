package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Cliente {

	private final int id;
	private final String ci; 
	private final String nombre; 
	private final String apellido;
	private final String telefono;
	private final String direccion;
	private final String correo;
	
	
	//constructor
	public Cliente(int id, String ci, String nombre, String apellido, String telefono, String direccion,
			String correo) {
		this.id = id;
		this.ci = ci;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}
	
	//getter y setter
	public int getId() {
		return id;
	}
	public String getCi() {
		return ci;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCorreo() {
		return correo;
	} 
	
	//to String
	@Override
	public String toString() {
		return "cliente [id=" + id + ", ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono="
				+ telefono + ", direccion=" + direccion + ", correo=" + correo + "]";
	}
	
}
