package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Pedido;

public interface IPedidoRepositorio {

	Pedido guardar(Pedido pedido);
	Optional<Pedido> buscarPorId(int id);
	List<Pedido> listarTodos();
	
	void eliminar(int id); 
	
}
