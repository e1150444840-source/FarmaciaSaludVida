package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import java.time.LocalDate;

public class Venta {
	
	private final int id_venta;
	private final LocalDate fecha_emison; 
	private final String canal_venta; 
	private final double subtotal;
	private final double iva;
	private final double total;
	
	// constructor
	public Venta(int id_venta, LocalDate fecha_emison, String canal_venta, double subtotal, double iva, double total) {
		
		this.id_venta = id_venta;
		this.fecha_emison = fecha_emison;
		this.canal_venta = canal_venta;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
	}
	
	// getter y setter
	public int getId_venta() {
		return id_venta;
	}

	public LocalDate getFecha_emison() {
		return fecha_emison;
	}

	public String getCanal_venta() {
		return canal_venta;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public double getIva() {
		return iva;
	}

	public double getTotal() {
		return total;
	}

	// to String
	@Override
	public String toString() {
		return "Venta [id_venta=" + id_venta + ", fecha_emison=" + fecha_emison + ", canal_venta=" + canal_venta
				+ ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + "]";
	}

	
}
