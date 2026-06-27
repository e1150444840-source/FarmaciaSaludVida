package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Categoria;



public interface ICategoriaRepositorio {
	Categoria guardar(Categoria nuevaCategoria);
	Optional<Categoria> buscarPorId(int idCategoria);
	List<Categoria> listarTodos();
	
	void eliminar(int idCategoria);

}
