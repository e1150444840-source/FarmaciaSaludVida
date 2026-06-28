package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Vehiculo;

public interface IVehiculoCasoUso {

	Vehiculo crear(Vehiculo nuevoVehiculo);

	Vehiculo obtenerPorId(int idVehiculo);

	List<Vehiculo> listar();

	void eliminar(int idVehiculo);
}
