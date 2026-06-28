package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ICategoriaCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Categoria;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ICategoriaRepositorio;

@Service
public class CategoriaCasoUsosImpl implements ICategoriaCasoUso {

	private final ICategoriaRepositorio repositorio;

	public CategoriaCasoUsosImpl(ICategoriaRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------

	@Override
	public Categoria crear(Categoria nuevaCategoria) {
		return repositorio.guardar(nuevaCategoria);
	}

	@Override
	public Categoria obtenerPorId(int idCategoria) {
		return repositorio.buscarPorId(idCategoria)
				.orElseThrow(() -> 
				new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Categoria> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idCategoria) {
		repositorio.eliminar(idCategoria);
	}

}
