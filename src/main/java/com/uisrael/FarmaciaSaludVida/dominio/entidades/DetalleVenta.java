package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class DetalleVenta {

	private final int idDetalleVenta;
	private final int cantidad; 
	private final double precioUnitario;

	
	// constructor
	public DetalleVenta(int idDetalleVenta, int cantidad, double precioUnitario) {
		
		this.idDetalleVenta = idDetalleVenta;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	// getter y setter
	public int getIdDetalleVenta() {
		return idDetalleVenta;
	}


	public int getCantidad() {
		return cantidad;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}

	// to String
	@Override
	public String toString() {
		return "DetalleVenta [idDetalleVenta=" + idDetalleVenta + ", cantidad=" + cantidad + ", precioUnitario="
				+ precioUnitario + "]";
	} 





	
	
}
