package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Laboratorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ILaboratorioRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.LaboratorioEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.ILaboratorioJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.ILaboratorioJpaRepositorio;

public class LaboratorioRepositorioImpl implements ILaboratorioRepositorio {

	private final ILaboratorioJpaRepositorio jpaRepositorio;
	private final ILaboratorioJpaMapper entityMapper;

	// constructor
	public LaboratorioRepositorioImpl(ILaboratorioJpaRepositorio jpaRepositorio, ILaboratorioJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------

	@Override
	public Laboratorio guardar(Laboratorio nuevoLaboratorio) {
		LaboratorioEntity entity = entityMapper.toEntity(nuevoLaboratorio);
		LaboratorioEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Laboratorio> buscarPorId(int idLaboratorio) {
		return jpaRepositorio.findById(idLaboratorio).map(entityMapper::toDomain);
	}

	@Override
	public List<Laboratorio> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idLaboratorio) {
		jpaRepositorio.deleteById(idLaboratorio);

	}

}
