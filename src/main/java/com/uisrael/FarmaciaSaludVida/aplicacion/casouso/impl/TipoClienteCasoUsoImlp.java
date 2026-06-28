package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.ITipoClienteCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.TipoCliente;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.ITipoClienteRepositorio;

@Service
public class TipoClienteCasoUsoImlp implements ITipoClienteCasoUso {
	
	private final ITipoClienteRepositorio repositorio;

	public TipoClienteCasoUsoImlp(ITipoClienteRepositorio repositorio) {
		
		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public TipoCliente crear(TipoCliente nuevoTipoCliente) {
		return repositorio.guardar(nuevoTipoCliente);
	}

	@Override
	public TipoCliente obtenerPorId(int idTipoCliente) {
		return repositorio.buscarPorId(idTipoCliente)
				.orElseThrow(() -> 
				new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<TipoCliente> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idTipoCliente) {
		repositorio.eliminar(idTipoCliente);
	}
	

}
