package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.TipoCliente;

public interface ITipoClienteRepositorio {

	TipoCliente guardar(TipoCliente nuevoTipoCliente);
	Optional<TipoCliente> buscarPorId(int idTipoCliente);
	List<TipoCliente> listarTodos();
	
	void eliminar (int idTipoCliente); 
}
