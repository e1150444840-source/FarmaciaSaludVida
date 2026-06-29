package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Farmacia;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IFarmaciaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.FarmaciaEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IFarmaciaJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IFarmaciaJpaRepositorio;

public class FarmaciaRepositorioImpl implements IFarmaciaRepositorio {

	private final IFarmaciaJpaRepositorio jpaRepositorio;
	private final IFarmaciaJpaMapper entityMapper;

	// constructor
	public FarmaciaRepositorioImpl(IFarmaciaJpaRepositorio jpaRepositorio, IFarmaciaJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------
	@Override
	public Farmacia guardar(Farmacia nuevaFarmacia) {
		FarmaciaEntity entity = entityMapper.toEntity(nuevaFarmacia);
		FarmaciaEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Farmacia> buscarPorId(int idFarmacia) {
		return jpaRepositorio.findById(idFarmacia).map(entityMapper::toDomain);
	}

	@Override
	public List<Farmacia> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idFarmacia) {
		jpaRepositorio.deleteById(idFarmacia);

	}

}
