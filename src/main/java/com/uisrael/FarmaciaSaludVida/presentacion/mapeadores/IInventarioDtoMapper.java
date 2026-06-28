package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Inventario;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.InventarioRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.InventarioResponseDto;

@Mapper(componentModel = "spring")
public interface IInventarioDtoMapper {

	Inventario toDomain(InventarioRequestDto dto); // de DTO a entidad de dominio

	InventarioResponseDto toResponseDto(Inventario inventario); // de entidad a DTO
}
