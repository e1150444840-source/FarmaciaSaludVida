package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Cliente;

public interface IClienteRepositorio {

	Cliente guardar(Cliente nuevoCliente);
	Optional<Cliente> buscarPorId(int idCliente);
	List<Cliente> listarTodos();
	
	void eliminar(int idCliente); 
}
