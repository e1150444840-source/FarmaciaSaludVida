package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.TipoClienteEntity;

public class Cliente {

	private final int idCliente;
	private final String ciCliente; 
	private final String nombreCliente; 
	private final String apellidoCliente;
	private final String telefonoCliente;
	private final String direccionCliente;
	private final String correoCliente;
	private TipoClienteEntity fkTipoCliente;
	
	//constructor
	public Cliente(int idCliente, String ciCliente, String nombreCliente, String apellidoCliente,
			String telefonoCliente, String direccionCliente, String correoCliente, TipoClienteEntity fkTipoCliente) {


		this.idCliente = idCliente;
		this.ciCliente = ciCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.telefonoCliente = telefonoCliente;
		this.direccionCliente = direccionCliente;
		this.correoCliente = correoCliente;
		this.fkTipoCliente = fkTipoCliente;
	}
	
	//getter y setter
	public TipoClienteEntity getFkTipoCliente() {
		return fkTipoCliente;
	}

	public void setFkTipoCliente(TipoClienteEntity fkTipoCliente) {
		this.fkTipoCliente = fkTipoCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public String getCiCliente() {
		return ciCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public String getTelefonoCliente() {
		return telefonoCliente;
	}

	public String getDireccionCliente() {
		return direccionCliente;
	}

	public String getCorreoCliente() {
		return correoCliente;
	}

	//to String
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", ciCliente=" + ciCliente + ", nombreCliente=" + nombreCliente
				+ ", apellidoCliente=" + apellidoCliente + ", telefonoCliente=" + telefonoCliente
				+ ", direccionCliente=" + direccionCliente + ", correoCliente=" + correoCliente + ", fkTipoCliente="
				+ fkTipoCliente + "]";
	}
	
}
