package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Venta;

public interface IVentaRepositorio {
	Venta guardar(Venta nuevaVenta);
	Optional<Venta> buscarPorId(int idVenta);
	List<Venta> listarTodos();
	
	void eliminar(int idVenta); 
}
