package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import java.time.LocalDate;

public class Lote {
	private final int idLote;
	private final String numeroLote; 
	private final LocalDate fechaCaducidad; 
	private final LocalDate fechaIngreso;
	
	//constructor
	public Lote(int idLote, String numeroLote, LocalDate fechaCaducidad, LocalDate fechaIngreso) {
		
		this.idLote = idLote;
		this.numeroLote = numeroLote;
		this.fechaCaducidad = fechaCaducidad;
		this.fechaIngreso = fechaIngreso;
	}
	
	//getter y setter
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
	
	//to String
	@Override
	public String toString() {
		return "Lote [idLote=" + idLote + ", numeroLote=" + numeroLote + ", fechaCaducidad=" + fechaCaducidad
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}

	
}
