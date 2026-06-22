package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.DetalleVenta;

public interface IDetalleVentaRepositorio {

	DetalleVenta guardar(DetalleVenta detalleVenta);
	Optional<DetalleVenta> buscarPorId(int id);
	List<DetalleVenta> listarTodos();
	
	void eliminar(int id);  
	
}
