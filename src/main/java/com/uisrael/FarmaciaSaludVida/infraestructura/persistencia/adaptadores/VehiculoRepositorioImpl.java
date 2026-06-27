package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Vehiculo;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IVehiculoRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VehiculoEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IVehiculoJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IVehiculoJpaRepositorio;

public class VehiculoRepositorioImpl implements IVehiculoRepositorio {

	private final IVehiculoJpaRepositorio jpaRepositorio;
	private final IVehiculoJpaMapper entityMapper;

	// constructor
	public VehiculoRepositorioImpl(IVehiculoJpaRepositorio jpaRepositorio, IVehiculoJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------

	@Override
	public Vehiculo guardar(Vehiculo nuevoVehiculo) {
		VehiculoEntity entity = entityMapper.toEntity(nuevoVehiculo);
		VehiculoEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Vehiculo> buscarPorId(int idVehiculo) {
		return jpaRepositorio.findById(idVehiculo).map(entityMapper::toDomain);
	}

	@Override
	public List<Vehiculo> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idVehiculo) {
		jpaRepositorio.deleteById(idVehiculo);

	}

}
