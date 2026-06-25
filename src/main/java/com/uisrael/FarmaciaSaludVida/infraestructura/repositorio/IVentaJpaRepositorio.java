package com.uisrael.FarmaciaSaludVida.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VentaEntity;

public interface IVentaJpaRepositorio extends JpaRepository<VentaEntity, Integer> {

}
