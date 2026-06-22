package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Usuario;

public interface IUsuarioRepositorio {

	Usuario guardar(Usuario usuario);
	Optional<Usuario> buscarPorId(int id);
	List<Usuario> listarTodos();
	
	void eliminar(int id);  
	
}
