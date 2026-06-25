package com.uisrael.FarmaciaSaludVida.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.DetalleVentaEntity;

public interface IDetalleVentaJpaRepositorio extends JpaRepository<DetalleVentaEntity, Integer>{

}
