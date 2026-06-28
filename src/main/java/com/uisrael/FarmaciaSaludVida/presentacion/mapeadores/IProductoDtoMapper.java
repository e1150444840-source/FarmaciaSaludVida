package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Producto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.ProductoRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.ProductoResponseDto;

@Mapper(componentModel = "spring")
public interface IProductoDtoMapper {

	Producto toDomain(ProductoRequestDto dto); // de DTO a entidad de dominio

	ProductoResponseDto toResponseDto(Producto producto); // de entidad a DTO
}
