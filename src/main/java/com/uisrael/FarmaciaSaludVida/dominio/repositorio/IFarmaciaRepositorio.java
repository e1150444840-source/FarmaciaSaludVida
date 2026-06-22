package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Farmacia;

public interface IFarmaciaRepositorio {

	Farmacia guardar(Farmacia farmacia);
	Optional<Farmacia> buscarPorId(int id);
	List<Farmacia> listarTodos();
	
	void eliminar(int id); 
	
}
