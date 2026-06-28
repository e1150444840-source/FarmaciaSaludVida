package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.TipoCliente;

public interface ITipoClienteCasoUso {

	TipoCliente crear(TipoCliente nuevoTipoCliente);

	TipoCliente obtenerPorId(int idTipoCliente);

	List<TipoCliente> listar();

	void eliminar(int idTipoCliente);
}
