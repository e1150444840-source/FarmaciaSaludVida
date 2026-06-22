package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Categoria;



public interface ICategoriaRepositorio {
	Categoria guardar(Categoria categoria);
	Optional<Categoria> buscarPorId(int id);
	List<Categoria> listarTodos();
	
	void eliminar(int id);

}
