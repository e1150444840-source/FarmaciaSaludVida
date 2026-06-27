package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.LoteEntity;

public class Inventario {

	private final int idInventario;
	private final int stockActual;
	private LoteEntity fkLote;

	// constructor
	public Inventario(int idInventario, int stockActual, LoteEntity fkLote) {
		
		this.idInventario = idInventario;
		this.stockActual = stockActual;
		this.fkLote = fkLote;
	}

	// getter y setter
	public LoteEntity getFkLote() {
		return fkLote;
	}

	public void setFkLote(LoteEntity fkLote) {
		this.fkLote = fkLote;
	}

	public int getIdInventario() {
		return idInventario;
	}

	public int getStockActual() {
		return stockActual;
	}

	// to String
	@Override
	public String toString() {
		return "Inventario [idInventario=" + idInventario + ", stockActual=" + stockActual + ", fkLote=" + fkLote + "]";
	}

}
