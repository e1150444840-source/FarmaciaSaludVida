package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Pedido;

public interface IPedidoRepositorio {

	Pedido guardar(Pedido nuevoPedido);
	Optional<Pedido> buscarPorId(int idPedido);
	List<Pedido> listarTodos();
	
	void eliminar(int idPedido); 
	
}
