package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IDetalleVentaCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.DetalleVenta;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IDetalleVentaRepositorio;

@Service
public class DetalleVentaCasoUsosImpl implements IDetalleVentaCasoUso {

	private final IDetalleVentaRepositorio repositorio;

	public DetalleVentaCasoUsosImpl(IDetalleVentaRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public DetalleVenta crear(DetalleVenta nuevoDetalleVenta) {
		return repositorio.guardar(nuevoDetalleVenta);
	}

	@Override
	public DetalleVenta obtenerPorId(int idDetalleVenta) {
		return repositorio.buscarPorId(idDetalleVenta).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<DetalleVenta> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idDetalleVenta) {
		repositorio.eliminar(idDetalleVenta);

	}

}
