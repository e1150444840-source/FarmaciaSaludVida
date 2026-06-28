package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Farmacia;

public interface IFarmaciaCasoUso {

	Farmacia crear(Farmacia nuevaFarmacia);

	Farmacia obtenerPorId(int idFarmacia);

	List<Farmacia> listar();

	void eliminar(int idFarmacia);
}
