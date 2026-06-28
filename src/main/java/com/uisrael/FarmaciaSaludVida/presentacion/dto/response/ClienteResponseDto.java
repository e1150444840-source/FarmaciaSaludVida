package com.uisrael.FarmaciaSaludVida.presentacion.dto.response;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.TipoClienteEntity;

public class ClienteResponseDto {

	private int idCliente;
	private String ciCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private String telefonoCliente;
	private String direccionCliente;
	private String correoCliente;
	private TipoClienteEntity fkTipoCliente;

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getCiCliente() {
		return ciCliente;
	}

	public void setCiCliente(String ciCliente) {
		this.ciCliente = ciCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public void setTelefonoCliente(String telefonoCliente) {
		this.telefonoCliente = telefonoCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public void setDireccionCliente(String direccionCliente) {
		this.direccionCliente = direccionCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	public void setCorreoCliente(String correoCliente) {
		this.correoCliente = correoCliente;
	}

	public TipoClienteEntity getFkTipoCliente() {
		return fkTipoCliente;
	}

	public void setFkTipoCliente(TipoClienteEntity fkTipoCliente) {
		this.fkTipoCliente = fkTipoCliente;
	}

}
