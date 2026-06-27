package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Lote;

public interface ILoteRepositorio {

	Lote guardar(Lote nuevoLote);
	Optional<Lote> buscarPorId(int idLote);
	List<Lote> listarTodos();
	
	void eliminar(int idLote);
}
