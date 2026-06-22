package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class DetalleVenta {

	private final int id_detalle_venta;
	private final int cantidad; 
	private final double precio_unitario; 
	
	// constructor
	public DetalleVenta(int id_detalle_venta, int cantidad, double precio_unitario) {
		
		this.id_detalle_venta = id_detalle_venta;
		this.cantidad = cantidad;
		this.precio_unitario = precio_unitario;
	}

	// getter y setter
	public int getId_detalle_venta() {
		return id_detalle_venta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public double getPrecio_unitario() {
		return precio_unitario;
	}

	// to String
	@Override
	public String toString() {
		return "DetalleVenta [id_detalle_venta=" + id_detalle_venta + ", cantidad=" + cantidad + ", precio_unitario="
				+ precio_unitario + "]";
	}


	
	
}
