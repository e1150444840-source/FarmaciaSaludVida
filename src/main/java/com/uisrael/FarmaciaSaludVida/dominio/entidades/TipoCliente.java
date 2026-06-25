package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class TipoCliente {

	private final int idTipoCliente;
	private final String nombreTipoCliente; //VIP, Mayorista, persona natural
	private final String descripcion;
	private final boolean estado; //activo - eliminado 
	
	// constructor
	public TipoCliente(int idTipoCliente, String nombreTipo, String descripcion, boolean estado) {
	
		this.idTipoCliente = idTipoCliente;
		this.nombreTipoCliente = nombreTipo;
		this.descripcion = descripcion;
		this.estado = estado;
	}
	
	// getter y setter
	public int getIdTipoCliente() {
		return idTipoCliente;
	}
	public String getNombreTipo() {
		return nombreTipoCliente;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public boolean isEstado() {
		return estado;
	}
	
	// to String
	@Override
	public String toString() {
		return "TipoCliente [idTipoCliente=" + idTipoCliente + ", nombreTipo=" + nombreTipoCliente + ", descripcion="
				+ descripcion + ", estado=" + estado + "]";
	}
	
	
	
}