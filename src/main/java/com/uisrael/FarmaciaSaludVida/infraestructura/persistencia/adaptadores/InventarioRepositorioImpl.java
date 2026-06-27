package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Inventario;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IInventarioRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.InventarioEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IInventarioJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IInventarioJpaRepositorio;

public class InventarioRepositorioImpl implements IInventarioRepositorio {

	private final IInventarioJpaRepositorio jpaRepositorio;
	private final IInventarioJpaMapper entityMapper;

	// constructor
	public InventarioRepositorioImpl(IInventarioJpaRepositorio jpaRepositorio, IInventarioJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------
	@Override
	public Inventario guardar(Inventario nuevoInventario) {
		InventarioEntity entity = entityMapper.toEntity(nuevoInventario);
		InventarioEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Inventario> buscarPorId(int idInventario) {
		return jpaRepositorio.findById(idInventario).map(entityMapper::toDomain);
	}

	@Override
	public List<Inventario> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idInventario) {
		jpaRepositorio.deleteById(idInventario);

	}

}
