package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Cliente {

	private final int idCliente;
	private final String ciCliente; 
	private final String nombreCliente; 
	private final String apellidoCliente;
	private final String telefonoCliente;
	private final String direccionCliente;
	private final String correoCliente;
		
	//constructor
	public Cliente(int idCliente, String ciCliente, String nombreCliente, String apellidoCliente,
			String telefonoCliente, String direccionCliente, String correoCliente) {
		super();
		this.idCliente = idCliente;
		this.ciCliente = ciCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.telefonoCliente = telefonoCliente;
		this.direccionCliente = direccionCliente;
		this.correoCliente = correoCliente;
	}

	//getter y setter
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
				+ ", direccionCliente=" + direccionCliente + ", correoCliente=" + correoCliente + "]";
	}
	
	
}
