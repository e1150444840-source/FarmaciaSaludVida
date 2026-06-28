package com.uisrael.FarmaciaSaludVida.presentacion.dto.response;

public class TipoClienteResponseDto {

	private int idTipoCliente;
	private String nombreTipoCliente; // VIP, Mayorista, persona natural
	private String descripcion;
	private boolean estado; // activo - eliminado

	public int getIdTipoCliente() {
		return idTipoCliente;
	}

	public void setIdTipoCliente(int idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}

	public String getNombreTipoCliente() {
		return nombreTipoCliente;
	}

	public void setNombreTipoCliente(String nombreTipoCliente) {
		this.nombreTipoCliente = nombreTipoCliente;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
