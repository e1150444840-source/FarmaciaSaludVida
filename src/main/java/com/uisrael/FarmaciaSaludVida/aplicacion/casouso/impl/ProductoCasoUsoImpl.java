package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IProductoCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Producto;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IProductoRepositorio;

public class ProductoCasoUsoImpl implements IProductoCasoUso {

	private final IProductoRepositorio repositorio;

	public ProductoCasoUsoImpl(IProductoRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Producto crear(Producto nuevoProducto) {
		return repositorio.guardar(nuevoProducto);
	}

	@Override
	public Producto obtenerPorId(int idProducto) {
		return repositorio.buscarPorId(idProducto).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Producto> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idProducto) {
		repositorio.eliminar(idProducto);
	}

}
