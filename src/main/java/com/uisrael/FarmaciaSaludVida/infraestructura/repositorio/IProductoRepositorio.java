package com.uisrael.FarmaciaSaludVida.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.ProductoEntity;

public interface IProductoRepositorio extends JpaRepository<ProductoEntity, Integer> {

}
