package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Pedido;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IPedidoRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.PedidoEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IPedidoJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.IPedidoJpaRepositorio;

public class PedidoRepositorioImpl implements IPedidoRepositorio {

	private final IPedidoJpaRepositorio jpaRepositorio;
	private final IPedidoJpaMapper entityMapper;

	// constructor
	public PedidoRepositorioImpl(IPedidoJpaRepositorio jpaRepositorio, IPedidoJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------
	@Override
	public Pedido guardar(Pedido nuevoPedido) {
		PedidoEntity entity = entityMapper.toEntity(nuevoPedido);
		PedidoEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Pedido> buscarPorId(int idPedido) {
		return jpaRepositorio.findById(idPedido).map(entityMapper::toDomain);
	}

	@Override
	public List<Pedido> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idPedido) {
		jpaRepositorio.deleteById(idPedido);

	}

}
