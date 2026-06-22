package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Venta;

public interface IVentaRepositorio {
	Venta guardar(Venta venta);
	Optional<Venta> buscarPorId(int id);
	List<Venta> listarTodos();
	
	void eliminar(int id); 
}
