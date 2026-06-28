package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Inventario;

public interface IInventarioCasoUso {
	
	Inventario crear(Inventario nuevoInventario);

	Inventario obtenerPorId(int idInventario);

	List<Inventario> listar();

	void eliminar(int idInventario);
}
