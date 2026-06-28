package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Laboratorio;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.LaboratorioRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.LaboratorioResponseDto;

@Mapper(componentModel = "spring")
public interface ILaboratorioDtoMapper {

	Laboratorio toDomain(LaboratorioRequestDto dto); // de DTO a entidad de dominio

	LaboratorioResponseDto toResponseDto(Laboratorio laboratorio); // de entidad a DTO
}
