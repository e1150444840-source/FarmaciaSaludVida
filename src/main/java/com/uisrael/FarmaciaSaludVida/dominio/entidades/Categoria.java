package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Categoria {

	private final int idCategoria;
	private final String nombreCategoria;
	
	//constructor
	public Categoria(int idCategoria, String nombreCategoria) {
	
		this.idCategoria = idCategoria;
		this.nombreCategoria = nombreCategoria;
	}

	//getter y setter
	public int getIdCategoria() {
		return idCategoria;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	//to String
	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nombreCategoria=" + nombreCategoria + "]";
	}
	
	


	
}
