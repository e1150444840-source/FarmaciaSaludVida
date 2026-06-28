package com.uisrael.FarmaciaSaludVida.presentacion.dto.response;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.LoteEntity;

public class InventarioResponseDto {

	private int idInventario;
	private int stockActual;
	private LoteEntity fkLote;

	public int getIdInventario() {
		return idInventario;
	}

	public void setIdInventario(int idInventario) {
		this.idInventario = idInventario;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public LoteEntity getFkLote() {
		return fkLote;
	}

	public void setFkLote(LoteEntity fkLote) {
		this.fkLote = fkLote;
	}

}
