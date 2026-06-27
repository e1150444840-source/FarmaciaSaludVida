package com.uisrael.FarmaciaSaludVida.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.DetalleVenta;

public interface IDetalleVentaRepositorio {

	DetalleVenta guardar(DetalleVenta nuevoDetalleVenta);
	Optional<DetalleVenta> buscarPorId(int idDetalleVenta);
	List<DetalleVenta> listarTodos();
	
	void eliminar(int idDetalleVenta);  
	
}
