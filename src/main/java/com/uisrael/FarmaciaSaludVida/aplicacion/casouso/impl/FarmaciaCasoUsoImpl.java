package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IFarmaciaCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Farmacia;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IFarmaciaRepositorio;

public class FarmaciaCasoUsoImpl implements IFarmaciaCasoUso {

	private final IFarmaciaRepositorio repositorio;

	public FarmaciaCasoUsoImpl(IFarmaciaRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Farmacia crear(Farmacia nuevaFarmacia) {
		return repositorio.guardar(nuevaFarmacia);
	}

	@Override
	public Farmacia obtenerPorId(int idFarmacia) {
		return repositorio.buscarPorId(idFarmacia).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Farmacia> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idFarmacia) {
		repositorio.eliminar(idFarmacia);

	}

}
