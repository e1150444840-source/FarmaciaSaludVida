package com.uisrael.FarmaciaSaludVida.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.ClienteEntity;

public interface ICienteRepositorio extends JpaRepository<ClienteEntity, Integer> {

	//CRUD insertar, eliminiar, actualizar. en la Base de Datos
}
