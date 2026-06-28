package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.DetalleVenta;

public interface IDetalleVentaCasoUso {

	DetalleVenta crear(DetalleVenta nuevoDetalleVenta);

	DetalleVenta obtenerPorId(int idDetalleVenta);

	List<DetalleVenta> listar();

	void eliminar(int idDetalleVenta);
}
