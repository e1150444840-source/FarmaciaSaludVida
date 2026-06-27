package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Vehiculo;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VehiculoEntity;

@Mapper(componentModel = "spring")
public interface IVehiculoJpaMapper {

	Vehiculo toDomain(VehiculoEntity entity);

	VehiculoEntity toEntity(Vehiculo vehiculoPojo);
}
