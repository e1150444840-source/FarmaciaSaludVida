package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Inventario {
	
	private final int id_inventario;
	private final int stock_actual;
	
	// constructor
	public Inventario(int id_inventario, int stock_actual) {
		super();
		this.id_inventario = id_inventario;
		this.stock_actual = stock_actual;
	}

	// getter y setter
	public int getId_inventario() {
		return id_inventario;
	}

	public int getStock_actual() {
		return stock_actual;
	}

	// to String
	@Override
	public String toString() {
		return "Inventario [id_inventario=" + id_inventario + ", stock_actual=" + stock_actual + "]";
	} 
}
