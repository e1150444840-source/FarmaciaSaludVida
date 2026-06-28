package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Venta;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.VentaRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.VentaResponseDto;

@Mapper(componentModel = "spring")
public interface IVentaDtoMapper {

	Venta toDomain(VentaRequestDto dto); // de DTO a entidad de dominio

	VentaResponseDto toResponseDto(Venta venta); // de entidad a DTO
}
