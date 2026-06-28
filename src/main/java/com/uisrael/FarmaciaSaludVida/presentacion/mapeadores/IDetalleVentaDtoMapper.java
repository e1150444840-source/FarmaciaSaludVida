package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.DetalleVenta;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.DetalleVentaRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.DetalleVentaResponseDto;

@Mapper(componentModel = "spring")
public interface IDetalleVentaDtoMapper {

	DetalleVenta toDomain(DetalleVentaRequestDto dto); // de DTO a entidad de dominio

	DetalleVentaResponseDto toResponseDto(DetalleVenta detalleVenta); // de entidad a DTO
}
