package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ILaboratorioCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Laboratorio;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ILaboratorioRepositorio;

@Service
public class LaboratorioCasoUsoImlp implements ILaboratorioCasoUso {

	private final ILaboratorioRepositorio repositorio;

	public LaboratorioCasoUsoImlp(ILaboratorioRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Laboratorio crear(Laboratorio nuevoLaboratorio) {
		return repositorio.guardar(nuevoLaboratorio);
	}

	@Override
	public Laboratorio obtenerPorId(int idLaboratorio) {
		return repositorio.buscarPorId(idLaboratorio)
				.orElseThrow(() -> 
				new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Laboratorio> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idLaboratorio) {
		repositorio.eliminar(idLaboratorio);

	}

}
