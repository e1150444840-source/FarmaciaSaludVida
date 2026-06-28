package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Producto;

public interface IProductoCasoUso {

	Producto crear(Producto nuevoProducto);

	Producto obtenerPorId(int idProducto);

	List<Producto> listar();

	void eliminar(int idProducto);
}
