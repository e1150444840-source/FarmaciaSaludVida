package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Laboratorio;


public interface ILaboratorioRepositorio {

	Laboratorio guardar(Laboratorio nuevoLaboratorio);
	Optional<Laboratorio> buscarPorId(int idLaboratorio);
	List<Laboratorio> listarTodos();
	
	void eliminar(int idLaboratorio);
}
