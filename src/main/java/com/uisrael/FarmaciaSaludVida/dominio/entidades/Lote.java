package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import java.time.LocalDate;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.ProductoEntity;

public class Lote {
	private final int idLote;
	private final String numeroLote;
	private final LocalDate fechaCaducidad;
	private final LocalDate fechaIngreso;
	private ProductoEntity fkProducto;

	// constructor
	public Lote(int idLote, String numeroLote, LocalDate fechaCaducidad, LocalDate fechaIngreso,
			ProductoEntity fkProducto) {

		this.idLote = idLote;
		this.numeroLote = numeroLote;
		this.fechaCaducidad = fechaCaducidad;
		this.fechaIngreso = fechaIngreso;
		this.fkProducto = fkProducto;
	}

	// getter y setter
	public ProductoEntity getFkProducto() {
		return fkProducto;
	}

	public void setFkProducto(ProductoEntity fkProducto) {
		this.fkProducto = fkProducto;
	}

	public int getIdLote() {
		return idLote;
	}

	public String getNumeroLote() {
		return numeroLote;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	// to String
	@Override
	public String toString() {
		return "Lote [idLote=" + idLote + ", numeroLote=" + numeroLote + ", fechaCaducidad=" + fechaCaducidad
				+ ", fechaIngreso=" + fechaIngreso + ", fkProducto=" + fkProducto + "]";
	}

}
