package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Venta;

public interface IVentaCasoUso {

	Venta crear(Venta nuevaVenta);

	Venta obtenerPorId(int idVenta);

	List<Venta> listar();

	void eliminar(int idVenta);
}
