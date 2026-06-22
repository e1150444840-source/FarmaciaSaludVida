package com.uisrael.FarmaciaSaludVida.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.UsuarioEntity;

public interface IUsuarioRepositorio extends JpaRepository<UsuarioEntity, Integer> {

}
