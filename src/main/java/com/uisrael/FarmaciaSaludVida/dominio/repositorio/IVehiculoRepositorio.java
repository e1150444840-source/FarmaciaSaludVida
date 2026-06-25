package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Vehiculo;

public interface IVehiculoRepositorio {

	Vehiculo guardar(Vehiculo vehiculo);
	Optional<Vehiculo> buscarPorId(int id);
	List<Vehiculo> listarTodos();
	
	void eliminar(int id); 
}
