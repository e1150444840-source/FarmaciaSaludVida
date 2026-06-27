package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Laboratorio;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.LaboratorioEntity;

@Mapper(componentModel = "spring")
public interface ILaboratorioJpaMapper {

	Laboratorio toDomain(LaboratorioEntity entity);

	LaboratorioEntity toEntity(Laboratorio laboratorioPojo);
}
