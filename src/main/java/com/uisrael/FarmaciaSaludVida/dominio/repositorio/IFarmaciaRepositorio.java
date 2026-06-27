package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Farmacia;

public interface IFarmaciaRepositorio {

	Farmacia guardar(Farmacia nuevaFarmacia);
	Optional<Farmacia> buscarPorId(int idFarmacia);
	List<Farmacia> listarTodos();
	
	void eliminar(int idFarmacia); 
	
}
