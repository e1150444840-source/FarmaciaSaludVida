package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.DetalleVenta;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IDetalleVentaRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.DetalleVentaEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IDetalleVentaJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IDetalleVentaJpaRepositorio;

public class DetalleVentaRepositorioImpl implements IDetalleVentaRepositorio {

	private final IDetalleVentaJpaRepositorio jpaRepositorio;
	private final IDetalleVentaJpaMapper entityMapper;

	// constructor
	public DetalleVentaRepositorioImpl(IDetalleVentaJpaRepositorio jpaRepositorio,
			IDetalleVentaJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------
	@Override
	public DetalleVenta guardar(DetalleVenta nuevoDetalleVenta) {
		DetalleVentaEntity entity = entityMapper.toEntity(nuevoDetalleVenta);
		DetalleVentaEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<DetalleVenta> buscarPorId(int idDetalleVenta) {
		return jpaRepositorio.findById(idDetalleVenta).map(entityMapper::toDomain);
	}

	@Override
	public List<DetalleVenta> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idDetalleVenta) {
		jpaRepositorio.deleteById(idDetalleVenta);

	}

}
