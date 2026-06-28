package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Vehiculo;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.VehiculoRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.VehiculoResponseDto;

@Mapper(componentModel = "spring")
public interface IVehiculoDtoMapper {

	Vehiculo toDomain(VehiculoRequestDto dto); // de DTO a entidad de dominio

	VehiculoResponseDto toResponseDto(Vehiculo vehiculo); // de entidad a DTO
}
