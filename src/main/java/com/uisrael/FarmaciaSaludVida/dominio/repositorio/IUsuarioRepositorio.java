package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Usuario;

public interface IUsuarioRepositorio {

	Usuario guardar(Usuario nuevoUsuario);
	Optional<Usuario> buscarPorId(int idUsuario);
	List<Usuario> listarTodos();
	
	void eliminar(int idUsuario);  
	
}
