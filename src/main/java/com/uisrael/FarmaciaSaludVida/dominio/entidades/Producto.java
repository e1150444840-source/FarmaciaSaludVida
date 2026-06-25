package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Producto {

	private final int idProducto;
	private final String nombreProducto; 
	private final String descripcion;
	//constructor
	public Producto(int idProducto, String nombreProducto, String descricion) {
		
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.descripcion = descricion;
	}
	//getter y setter
	public int getIdProducto() {
		return idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public String getDescricion() {
		return descripcion;
	}
	
	//to String
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descricion="
				+ descripcion + "]";
	}
	
}
