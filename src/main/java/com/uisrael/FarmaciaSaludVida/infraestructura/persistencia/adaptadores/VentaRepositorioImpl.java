package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Venta;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IVentaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VentaEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IVentaJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IVentaJpaRepositorio;

public class VentaRepositorioImpl implements IVentaRepositorio {

	private final IVentaJpaRepositorio jpaRepositorio;
	private final IVentaJpaMapper entityMapper;

	// constructor
	public VentaRepositorioImpl(IVentaJpaRepositorio jpaRepositorio, IVentaJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}
	// ------------------metodos---------------------------

	@Override
	public Venta guardar(Venta nuevaVenta) {
		VentaEntity entity = entityMapper.toEntity(nuevaVenta);
		VentaEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Venta> buscarPorId(int idVenta) {
		return jpaRepositorio.findById(idVenta).map(entityMapper::toDomain);
	}

	@Override
	public List<Venta> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idVenta) {
		jpaRepositorio.deleteById(idVenta);

	}

}
