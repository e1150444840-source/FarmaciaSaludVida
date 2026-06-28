package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Lote;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.LoteRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.LoteResponseDto;

@Mapper(componentModel = "spring")
public interface ILoteDtoMapper {

	Lote toDomain(LoteRequestDto dto); // de DTO a entidad de dominio

	LoteResponseDto toResponseDto(Lote lote); // de entidad a DTO
}
