package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ILoteCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Lote;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ILoteRepositorio;

public class LoteCasoUsoImpl implements ILoteCasoUso {

	private final ILoteRepositorio repositorio;

	public LoteCasoUsoImpl(ILoteRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Lote crear(Lote nuevoLote) {
		return repositorio.guardar(nuevoLote);
	}

	@Override
	public Lote obtenerPorId(int idLote) {
		return repositorio.buscarPorId(idLote).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Lote> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idLote) {
		repositorio.eliminar(idLote);
	}

}
