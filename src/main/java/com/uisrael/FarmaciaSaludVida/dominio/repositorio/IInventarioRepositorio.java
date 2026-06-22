package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Inventario;

public interface IInventarioRepositorio {

	Inventario guardar(Inventario inventario);
	Optional<Inventario> buscarPorId(int id);
	List<Inventario> listarTodos();
	
	void eliminar(int id);
}
