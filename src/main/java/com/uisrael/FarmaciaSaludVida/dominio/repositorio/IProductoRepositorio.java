package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Producto;


public interface IProductoRepositorio {
	Producto guardar(Producto producto);
	Optional<Producto> buscarPorId(int id);
	List<Producto> listarTodos();
	
	void eliminar(int id);
}
