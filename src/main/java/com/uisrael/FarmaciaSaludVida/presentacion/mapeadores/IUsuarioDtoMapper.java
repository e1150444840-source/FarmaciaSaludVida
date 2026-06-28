package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Usuario;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.UsuarioRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.UsuarioResponseDto;

@Mapper(componentModel = "spring")
public interface IUsuarioDtoMapper {

	Usuario toDomain(UsuarioRequestDto dto); // de DTO a entidad de dominio

	UsuarioResponseDto toResponseDto(Usuario usuario); // de entidad a DTO
}
