package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IVentaCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Venta;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IVentaRepositorio;

@Service
public class VentaCasoUsoImlp implements IVentaCasoUso {

	private final IVentaRepositorio repositorio;

	public VentaCasoUsoImlp(IVentaRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Venta crear(Venta nuevaVenta) {
		return repositorio.guardar(nuevaVenta);
	}

	@Override
	public Venta obtenerPorId(int idVenta) {
		return repositorio.buscarPorId(idVenta)
				.orElseThrow(() -> 
				new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Venta> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idVenta) {
		repositorio.eliminar(idVenta);		
	}
}
