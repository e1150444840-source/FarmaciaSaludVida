package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IUsuarioCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Usuario;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IUsuarioRepositorio;

@Service
public class UsuarioCasoUsoImlp implements IUsuarioCasoUso {
	
	private final IUsuarioRepositorio repositorio;

	public UsuarioCasoUsoImlp(IUsuarioRepositorio repositorio) {
		
		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Usuario crear(Usuario nuevoUsuario) {
		return repositorio.guardar(nuevoUsuario);
	}

	@Override
	public Usuario obtenerPorId(int idUsuario) {
		return repositorio.buscarPorId(idUsuario)
				.orElseThrow(() -> 
				new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Usuario> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idUsuario) {
		repositorio.eliminar(idUsuario);
	}


}
