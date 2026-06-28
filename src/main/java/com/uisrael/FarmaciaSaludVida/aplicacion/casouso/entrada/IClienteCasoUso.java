package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Cliente;

public interface IClienteCasoUso {

	Cliente crear(Cliente nuevoCliente);

	Cliente obtenerPorId(int idCliente);

	List<Cliente> listar();

	void eliminar(int idCliente);
}
