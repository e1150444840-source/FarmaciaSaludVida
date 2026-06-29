package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IVehiculoCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Vehiculo;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IVehiculoRepositorio;

public class VehiculoCasoUsoImpl implements IVehiculoCasoUso {

	private final IVehiculoRepositorio repositorio;

	public VehiculoCasoUsoImpl(IVehiculoRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Vehiculo crear(Vehiculo nuevoVehiculo) {
		return repositorio.guardar(nuevoVehiculo);
	}

	@Override
	public Vehiculo obtenerPorId(int idVehiculo) {
		return repositorio.buscarPorId(idVehiculo).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Vehiculo> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idVehiculo) {
		repositorio.eliminar(idVehiculo);
	}

}
