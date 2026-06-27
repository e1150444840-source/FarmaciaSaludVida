package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Producto;


public interface IProductoRepositorio {
	Producto guardar(Producto nuevoProducto);
	Optional<Producto> buscarPorId(int idProducto);
	List<Producto> listarTodos();
	
	void eliminar(int idProducto);
}
