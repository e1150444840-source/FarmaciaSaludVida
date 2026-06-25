package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Inventario {
	
	private final int idInventario;
	private final int stockActual;
	
	// constructor
	public Inventario(int idInventario, int stockActual) {
	
		this.idInventario = idInventario;
		this.stockActual = stockActual;
	}
	
	// getter y setter
	public int getIdInventario() {
		return idInventario;
	}
	public int getStockActual() {
		return stockActual;
	}
	
	// to String
	@Override
	public String toString() {
		return "Inventario [idInventario=" + idInventario + ", stockActual=" + stockActual + "]";
	}
	
}
