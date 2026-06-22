package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import java.time.LocalDate;

public class Lote {
	private final int id_lote;
	private final String numero_lote; 
	private final LocalDate fecha_caducidad; 
	private final LocalDate fecha_ingreso;
	
	//constructor
	public Lote(int id_lote, String numero_lote, LocalDate fecha_caducidad, LocalDate fecha_ingreso) {
		
		this.id_lote = id_lote;
		this.numero_lote = numero_lote;
		this.fecha_caducidad = fecha_caducidad;
		this.fecha_ingreso = fecha_ingreso;
	}

	//getter y setter
	public int getId_lote() {
		return id_lote;
	}

	public String getNumero_lote() {
		return numero_lote;
	}

	public LocalDate getFecha_caducidad() {
		return fecha_caducidad;
	}

	public LocalDate getFecha_ingreso() {
		return fecha_ingreso;
	}

	
	//to String
	@Override
	public String toString() {
		return "Lote [id_lote=" + id_lote + ", numero_lote=" + numero_lote + ", fecha_caducidad=" + fecha_caducidad
				+ ", fecha_ingreso=" + fecha_ingreso + "]";
	}

	
	
	
}
