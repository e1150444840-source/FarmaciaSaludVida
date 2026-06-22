package com.uisrael.FarmaciaSaludVida.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.FarmaciaEntity;

public interface IFarmaciaRepositorio extends JpaRepository<FarmaciaEntity, Integer>{

}
