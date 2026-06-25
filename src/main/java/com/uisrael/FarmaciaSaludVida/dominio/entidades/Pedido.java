package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Pedido {
	private final int idPedido;
	private final String fechaPedido; 
	private final String estadoPedido; 
	private final String direccionPedido;
	
	//constructor
	public Pedido(int idPedido, String fechaPedido, String estadoPedido, String direccionPedido) {
		
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.estadoPedido = estadoPedido;
		this.direccionPedido = direccionPedido;
	}
	
	//getter y setter
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
	
	//to String
	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", fechaPedido=" + fechaPedido + ", estadoPedido=" + estadoPedido
				+ ", direccionPedido=" + direccionPedido + "]";
	}

	
}
