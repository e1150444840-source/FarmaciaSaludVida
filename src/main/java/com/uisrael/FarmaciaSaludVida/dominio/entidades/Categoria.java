package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Categoria {

	private final int id_categoria;
	private final String nombre_categoria;
	
	
	//constructor
	public Categoria(int id_categoria, String nombre_categoria) {
	
		this.id_categoria = id_categoria;
		this.nombre_categoria = nombre_categoria;
	}
	
	//getter y setter
	public int getId_categoria() {
		return id_categoria;
	}
	public String getNombre_categoria() {
		return nombre_categoria;
	}

	//to String
	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", nombre_categoria=" + nombre_categoria + "]";
	}
	
}
