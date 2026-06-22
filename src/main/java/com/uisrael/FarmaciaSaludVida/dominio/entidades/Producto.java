package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Producto {

	private final int id_producto;
	private final String nombre_producto; 
	private final String descricion;
	
	//constructor
	public Producto(int id_producto, String nombre_producto, String descricion) {
		
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.descricion = descricion;
	}

	//getter y setter
	public int getId_producto() {
		return id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public String getDescricion() {
		return descricion;
	}

	//to String
	@Override
	public String toString() {
		return "Producto [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", descricion="
				+ descricion + "]";
	}
}
