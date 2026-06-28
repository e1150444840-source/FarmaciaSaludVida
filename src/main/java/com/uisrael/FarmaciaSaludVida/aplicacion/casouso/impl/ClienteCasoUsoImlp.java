package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada.IClienteCasoUso;
import com.uisrael.FarmaciaSaludVida.dominio.entidades.Cliente;
import com.uisrael.FarmaciaSaludVida.dominio.repositorio.IClienteRepositorio;

@Service
public class ClienteCasoUsoImlp implements IClienteCasoUso {

	private final IClienteRepositorio repositorio;

	public ClienteCasoUsoImlp(IClienteRepositorio repositorio) {

		this.repositorio = repositorio;
	}

	// --------------METODOS-----------------------
	@Override
	public Cliente crear(Cliente nuevoCliente) {
		return repositorio.guardar(nuevoCliente);
	}

	@Override
	public Cliente obtenerPorId(int idCliente) {
		return repositorio.buscarPorId(idCliente)
				.orElseThrow(() -> 
				new RuntimeException("Cliente no encontrado"));
	}

	@Override
	public List<Cliente> listar() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(int idCliente) {
		repositorio.eliminar(idCliente);

	}
}
