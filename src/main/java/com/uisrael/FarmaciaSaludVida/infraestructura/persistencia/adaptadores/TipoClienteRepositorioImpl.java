package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.TipoCliente;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ITipoClienteRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.TipoClienteEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.ITipoClienteJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.ITipoClienteJpaRepositorio;

public class TipoClienteRepositorioImpl implements ITipoClienteRepositorio {

	private final ITipoClienteJpaRepositorio jpaRepositorio;
	private final ITipoClienteJpaMapper entityMapper;

	// constructor
	public TipoClienteRepositorioImpl(ITipoClienteJpaRepositorio jpaRepositorio, ITipoClienteJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------
	@Override
	public TipoCliente guardar(TipoCliente nuevoTipoCliente) {
		TipoClienteEntity entity = entityMapper.toEntity(nuevoTipoCliente);
		TipoClienteEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<TipoCliente> buscarPorId(int idTipoCliente) {
		return jpaRepositorio.findById(idTipoCliente).map(entityMapper::toDomain);
	}

	@Override
	public List<TipoCliente> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idTipoCliente) {
		jpaRepositorio.deleteById(idTipoCliente);

	}

}
