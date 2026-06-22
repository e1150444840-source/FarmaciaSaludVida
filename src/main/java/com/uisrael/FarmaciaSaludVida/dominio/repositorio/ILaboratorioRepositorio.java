package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Laboratorio;


public interface ILaboratorioRepositorio {

	Laboratorio guardar(Laboratorio laboratorio);
	Optional<Laboratorio> buscarPorId(int id);
	List<Laboratorio> listarTodos();
	
	void eliminar(int id);
}
