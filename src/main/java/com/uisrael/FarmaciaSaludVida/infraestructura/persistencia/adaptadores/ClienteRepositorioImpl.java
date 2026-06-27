package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Cliente;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IClienteRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.ClienteEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.ICienteJpaRepositorio;

public class ClienteRepositorioImpl implements IClienteRepositorio {

	private final ICienteJpaRepositorio jpaRepositorio;
	private final IClienteJpaMapper entityMapper;

	// constructor
	public ClienteRepositorioImpl(ICienteJpaRepositorio jpaRepositorio, IClienteJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------
	@Override
	public Cliente guardar(Cliente nuevoCliente) {
		ClienteEntity entity = entityMapper.toEntity(nuevoCliente);
		ClienteEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Cliente> buscarPorId(int idCliente) {
		return jpaRepositorio.findById(idCliente).map(entityMapper::toDomain);
	}

	@Override
	public List<Cliente> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idCliente) {
		jpaRepositorio.deleteById(idCliente);

	}

}
