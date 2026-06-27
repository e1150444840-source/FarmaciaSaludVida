package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VehiculoEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VentaEntity;

public class Pedido {
	private final int idPedido;
	private final String fechaPedido;
	private final String estadoPedido;
	private final String direccionPedido;
	private VentaEntity fkVenta;
	private VehiculoEntity fkVehiculo;

	// constructor
	public Pedido(int idPedido, String fechaPedido, String estadoPedido, String direccionPedido, VentaEntity fkVenta,
			VehiculoEntity fkVehiculo) {
	
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.estadoPedido = estadoPedido;
		this.direccionPedido = direccionPedido;
		this.fkVenta = fkVenta;
		this.fkVehiculo = fkVehiculo;
	}

	// getter y setter
	public VentaEntity getFkVenta() {
		return fkVenta;
	}

	public void setFkVenta(VentaEntity fkVenta) {
		this.fkVenta = fkVenta;
	}

	public VehiculoEntity getFkVehiculo() {
		return fkVehiculo;
	}

	public void setFkVehiculo(VehiculoEntity fkVehiculo) {
		this.fkVehiculo = fkVehiculo;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public String getFechaPedido() {
		return fechaPedido;
	}

	public String getEstadoPedido() {
		return estadoPedido;
	}

	public String getDireccionPedido() {
		return direccionPedido;
	}

	// to String
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaPedido=" + fechaPedido + ", estadoPedido=" + estadoPedido
				+ ", direccionPedido=" + direccionPedido + ", fkVenta=" + fkVenta + ", fkVehiculo=" + fkVehiculo + "]";
	}

}
