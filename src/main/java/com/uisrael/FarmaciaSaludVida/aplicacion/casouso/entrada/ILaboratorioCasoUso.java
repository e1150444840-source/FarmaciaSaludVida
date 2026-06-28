package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Laboratorio;


public interface ILaboratorioCasoUso {

	Laboratorio crear(Laboratorio nuevoLaboratorio);

	Laboratorio obtenerPorId(int idLaboratorio);

	List<Laboratorio> listar();

	void eliminar(int idLaboratorio);
}
