package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Categoria;

public interface ICategoriaCasoUso {

	Categoria crear(Categoria nuevaCategoria);

	Categoria obtenerPorId(int idCategoria);

	List<Categoria> listar();

	void eliminar(int idCategoria);

}
