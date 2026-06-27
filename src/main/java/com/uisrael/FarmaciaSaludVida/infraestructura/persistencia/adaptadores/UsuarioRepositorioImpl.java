package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Usuario;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IUsuarioRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.UsuarioEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IUsuarioJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IUsuarioJpaRepositorio;

public class UsuarioRepositorioImpl implements IUsuarioRepositorio {

	private final IUsuarioJpaRepositorio jpaRepositorio;
	private final IUsuarioJpaMapper entityMapper;

	// constructor
	public UsuarioRepositorioImpl(IUsuarioJpaRepositorio jpaRepositorio, IUsuarioJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------
	@Override
	public Usuario guardar(Usuario nuevoUsuario) {
		UsuarioEntity entity = entityMapper.toEntity(nuevoUsuario);
		UsuarioEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Usuario> buscarPorId(int idUsuario) {
		return jpaRepositorio.findById(idUsuario).map(entityMapper::toDomain);
	}

	@Override
	public List<Usuario> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();

	}

	@Override
	public void eliminar(int idUsuario) {
		jpaRepositorio.deleteById(idUsuario);

	}

}
