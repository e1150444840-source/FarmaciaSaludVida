package com.uisrael.FarmaciaSaludVida.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VehiculoEntity;

public interface IVehiculoJpaRepositorio extends JpaRepository<VehiculoEntity, Integer> {

	//CRUD insertar, eliminiar, actualizar. en la Base de Datos
}