package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Lote;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ILoteRepositorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.LoteEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores.ILoteJpaMapper;
import com.uisrael.FarmaciaSaludVida.infraestructura.repositorio.ILoteJpaRepositorio;

public class LoteRepositorioImpl implements ILoteRepositorio {

	private final ILoteJpaRepositorio jpaRepositorio;
	private final ILoteJpaMapper entityMapper;

	// constructor
	public LoteRepositorioImpl(ILoteJpaRepositorio jpaRepositorio, ILoteJpaMapper entityMapper) {

		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	// ------------------metodos---------------------------

	@Override
	public Lote guardar(Lote nuevoLote) {
		LoteEntity entity = entityMapper.toEntity(nuevoLote);
		LoteEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Lote> buscarPorId(int idLote) {
		return jpaRepositorio.findById(idLote).map(entityMapper::toDomain);
	}

	@Override
	public List<Lote> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(int idLote) {
		jpaRepositorio.deleteById(idLote);

	}

}
