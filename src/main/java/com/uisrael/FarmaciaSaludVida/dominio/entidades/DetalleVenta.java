package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.InventarioEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VentaEntity;

public class DetalleVenta {

	private final int idDetalleVenta;
	private final int cantidad;
	private final double precioUnitario;
	private VentaEntity fkVenta;
	private InventarioEntity fkInventario;

	// constructor
	public DetalleVenta(int idDetalleVenta, int cantidad, double precioUnitario, VentaEntity fkVenta,
			InventarioEntity fkInventario) {

		this.idDetalleVenta = idDetalleVenta;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.fkVenta = fkVenta;
		this.fkInventario = fkInventario;
	}

	// getter y setter
	public VentaEntity getFkVenta() {
		return fkVenta;
	}

	public void setFkVenta(VentaEntity fkVenta) {
		this.fkVenta = fkVenta;
	}

	public InventarioEntity getFkInventario() {
		return fkInventario;
	}

	public void setFkInventario(InventarioEntity fkInventario) {
		this.fkInventario = fkInventario;
	}

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
				+ precioUnitario + ", fkVenta=" + fkVenta + ", fkInventario=" + fkInventario + "]";
	}

}
