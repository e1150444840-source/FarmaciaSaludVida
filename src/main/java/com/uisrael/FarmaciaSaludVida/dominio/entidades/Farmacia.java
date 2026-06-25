package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Farmacia {
	
	private final int idFarmacia;
	private final String nombreFarmacia; 
	private final String direccion;
	private final String ciudad;
	
	// constructor
	public Farmacia(int idFarmacia, String nombreFarmacia, String direccion, String ciudad) {
		
		this.idFarmacia = idFarmacia;
		this.nombreFarmacia = nombreFarmacia;
		this.direccion = direccion;
		this.ciudad = ciudad;
	}
	
	// getter y setter
	public int getIdFarmacia() {
		return idFarmacia;
	}
	public String getNombreFarmacia() {
		return nombreFarmacia;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	
	// to String
	@Override
	public String toString() {
		return "Farmacia [idFarmacia=" + idFarmacia + ", nombreFarmacia=" + nombreFarmacia + ", direccion=" + direccion
				+ ", ciudad=" + ciudad + "]";
	}
	

}
