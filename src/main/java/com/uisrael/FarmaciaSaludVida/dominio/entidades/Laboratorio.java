package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Laboratorio {

	private final int id_laboratorio;
	private final String nombre_laboratorio; 
	private final String telefono;
	
	//constructor
	public Laboratorio(int id_laboratorio, String nombre_laboratorio, String telefono) {
		super();
		this.id_laboratorio = id_laboratorio;
		this.nombre_laboratorio = nombre_laboratorio;
		this.telefono = telefono;
	}

	//getter y setter
	public int getId_laboratorio() {
		return id_laboratorio;
	}

	public String getNombre_laboratorio() {
		return nombre_laboratorio;
	}

	public String getTelefono() {
		return telefono;
	}

	//to String
	@Override
	public String toString() {
		return "Laboratorio [id_laboratorio=" + id_laboratorio + ", nombre_laboratorio=" + nombre_laboratorio
				+ ", telefono=" + telefono + "]";
	}
		
	
	
	
}
