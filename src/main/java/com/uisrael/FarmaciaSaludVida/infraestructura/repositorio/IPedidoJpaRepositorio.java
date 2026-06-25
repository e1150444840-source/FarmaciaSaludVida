package com.uisrael.FarmaciaSaludVida.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.PedidoEntity;

public interface IPedidoJpaRepositorio extends JpaRepository<PedidoEntity, Integer> {

	//CRUD insertar, eliminiar, actualizar. en la Base de Datos
}
