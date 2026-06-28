package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Pedido;

public interface IPedidoCasoUso {

	Pedido crear(Pedido nuevoPedido);

	Pedido obtenerPorId(int idPedido);

	List<Pedido> listar();

	void eliminar(int idPedido);
}
