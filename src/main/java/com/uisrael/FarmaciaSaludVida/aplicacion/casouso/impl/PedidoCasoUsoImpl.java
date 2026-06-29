package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IPedidoCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Pedido;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IPedidoRepositorio;

public class PedidoCasoUsoImpl implements IPedidoCasoUso {

	private final IPedidoRepositorio repositorio;

	public PedidoCasoUsoImpl(IPedidoRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Pedido crear(Pedido nuevoPedido) {
		return repositorio.guardar(nuevoPedido);
	}

	@Override
	public Pedido obtenerPorId(int idPedido) {
		return repositorio.buscarPorId(idPedido).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Pedido> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idPedido) {
		repositorio.eliminar(idPedido);
	}

}
