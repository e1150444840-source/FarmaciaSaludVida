package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.TipoCliente;

public interface ITipoClienteRepositorio {

	TipoCliente guardar(TipoCliente tipoCliente);
	Optional<TipoCliente> buscarPorId(int id);
	List<TipoCliente> listarTodos();
	
	void eliminar (int id); 
}
