package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Lote;

public interface ILoteCasoUso {

	Lote crear(Lote nuevoLote);

	Lote obtenerPorId(int idLote);

	List<Lote> listar();

	void eliminar(int idLote);
}
