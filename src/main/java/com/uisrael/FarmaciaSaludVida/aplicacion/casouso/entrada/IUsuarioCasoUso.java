package com.uisrael.FarmaciaSaludVida.aplicacion.casouso.entrada;

import java.util.List;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Usuario;

public interface IUsuarioCasoUso {

	Usuario crear(Usuario nuevoUsuario);

	Usuario obtenerPorId(int idUsuario);

	List<Usuario> listar();

	void eliminar(int idUsuario);
}
