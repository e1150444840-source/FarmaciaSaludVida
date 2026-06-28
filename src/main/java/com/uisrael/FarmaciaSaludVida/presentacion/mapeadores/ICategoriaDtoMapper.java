package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Categoria;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.CategoriaRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.CategoriaResponseDto;

@Mapper(componentModel = "spring")
public interface ICategoriaDtoMapper {

	Categoria toDomain(CategoriaRequestDto dto); // de DTO a entidad de dominio

	CategoriaResponseDto toResponseDto(Categoria categoria); // de entidad a DTO
}
