package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Farmacia {
	
	private final int id_farmacia;
	private final String nombre_farmacia; 
	private final String direccion;
	private final String ciudad;
	
	// constructor
	public Farmacia(int id_farmacia, String nombre_farmacia, String direccion, String ciudad) {
		
		this.id_farmacia = id_farmacia;
		this.nombre_farmacia = nombre_farmacia;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	// getter y setter
	public int getId_farmacia() {
		return id_farmacia;
	}

	public String getNombre_farmacia() {
		return nombre_farmacia;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	// to String
	@Override
	public String toString() {
		return "Farmacia [id_farmacia=" + id_farmacia + ", nombre_farmacia=" + nombre_farmacia + ", direccion="
				+ direccion + ", ciudad=" + ciudad + "]";
	}

}
