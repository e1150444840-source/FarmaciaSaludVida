package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Laboratorio {

	private final int idLaboratorio;
	private final String nombreLaboratorio; 
	private final String telefonoLaboratorio;
	
	//constructor
	public Laboratorio(int idLaboratorio, String nombreLaboratorio, String telefonoLaboratorio) {
		
		this.idLaboratorio = idLaboratorio;
		this.nombreLaboratorio = nombreLaboratorio;
		this.telefonoLaboratorio = telefonoLaboratorio;
	}
	
	//getter y setter
	public int getIdLaboratorio() {
		return idLaboratorio;
	}
	public String getNombreLaboratorio() {
		return nombreLaboratorio;
	}
	public String getTelefonoLaboratorio() {
		return telefonoLaboratorio;
	}
	
	//to String
	@Override
	public String toString() {
		return "Laboratorio [idLaboratorio=" + idLaboratorio + ", nombreLaboratorio=" + nombreLaboratorio
				+ ", telefonoLaboratorio=" + telefonoLaboratorio + "]";
	}
	
	
}
