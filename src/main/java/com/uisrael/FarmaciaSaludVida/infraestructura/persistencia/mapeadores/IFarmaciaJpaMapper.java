package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Farmacia;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.FarmaciaEntity;

@Mapper(componentModel = "spring")
public interface IFarmaciaJpaMapper {

	Farmacia toDomain(FarmaciaEntity entity);

	FarmaciaEntity toEntity(Farmacia farmaciaPojo);
}
