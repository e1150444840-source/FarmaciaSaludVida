package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class Vehiculo {

	private final int idVehiculo;
	private final String placa; 
	private final String capacidad;
	private final String estadoDisponibilidad;
	
	//constructor
	public Vehiculo(int idVehiculo, String placa, String capacidad, String estadoDisponibilidad) {
		
		this.idVehiculo = idVehiculo;
		this.placa = placa;
		this.capacidad = capacidad;
		this.estadoDisponibilidad = estadoDisponibilidad;
	}
	
	//getter y setter
	public int getIdVehiculo() {
		return idVehiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public String getEstadoDisponibilidad() {
		return estadoDisponibilidad;
	}
	
	//to String
	@Override
	public String toString() {
		return "Vehiculo [idVehiculo=" + idVehiculo + ", placa=" + placa + ", capacidad=" + capacidad
				+ ", estadoDisponibilidad=" + estadoDisponibilidad + "]";
	}
}
