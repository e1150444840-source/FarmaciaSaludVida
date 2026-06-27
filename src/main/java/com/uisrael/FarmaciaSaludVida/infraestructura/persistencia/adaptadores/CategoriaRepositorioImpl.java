package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Categoria;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ICategoriaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.CategoriaEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.ICategoriaJpaRepositorio;

public class CategoriaRepositorioImpl implements ICategoriaRepositorio {

	private final ICategoriaJpaRepositorio jpaRepositorio;
	private final ICategoriaJpaMapper entityMapper;

	// constructor
	public CategoriaRepositorioImpl(ICategoriaJpaRepositorio jpaRepositorio, ICategoriaJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------

	@Override
	public Categoria guardar(Categoria nuevaCategoria) {
		CategoriaEntity entity = entityMapper.toEntity(nuevaCategoria);
		CategoriaEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Categoria> buscarPorId(int idCategoria) {
		return jpaRepositorio.findById(idCategoria).map(entityMapper::toDomain);
	}

	@Override
	public List<Categoria> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idCategoria) {
		jpaRepositorio.deleteById(idCategoria);
	}

}
