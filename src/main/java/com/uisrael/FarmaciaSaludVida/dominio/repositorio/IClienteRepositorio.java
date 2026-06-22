package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Cliente;

public interface IClienteRepositorio {

	Cliente guardar(Cliente cliente);
	Optional<Cliente> buscarPorId(int id);
	List<Cliente> listarTodos();
	
	void eliminar(int id); 
}
