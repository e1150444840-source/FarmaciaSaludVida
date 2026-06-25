package com.uisrael.FarmaciaSaludVida.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.TipoClienteEntity;

public interface ITipoClienteJpaRepositorio extends JpaRepository<TipoClienteEntity, Integer> {

}
