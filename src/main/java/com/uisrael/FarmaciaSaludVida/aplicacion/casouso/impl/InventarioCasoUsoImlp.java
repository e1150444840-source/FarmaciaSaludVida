package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IInventarioCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Inventario;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IInventarioRepositorio;

@Service
public class InventarioCasoUsoImlp implements IInventarioCasoUso {

	private final IInventarioRepositorio repositorio;

	public InventarioCasoUsoImlp(IInventarioRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Inventario crear(Inventario nuevoInventario) {
		return repositorio.guardar(nuevoInventario);
	}

	@Override
	public Inventario obtenerPorId(int idInventario) {
		return repositorio.buscarPorId(idInventario)
				.orElseThrow(() -> 
				new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Inventario> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idInventario) {
		repositorio.eliminar(idInventario);

	}

}
