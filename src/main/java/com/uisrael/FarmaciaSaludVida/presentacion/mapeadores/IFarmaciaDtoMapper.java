package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Farmacia;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.FarmaciaRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.FarmaciaResponseDto;

@Mapper(componentModel = "spring")
public interface IFarmaciaDtoMapper {

	Farmacia toDomain(FarmaciaRequestDto dto); // de DTO a entidad de dominio

	FarmaciaResponseDto toResponseDto(Farmacia farmacia); // de entidad a DTO
}
