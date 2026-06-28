package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Cliente;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.ClienteRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.ClienteResponseDto;

@Mapper(componentModel = "spring")
public interface IClienteDtoMapper {

	Cliente toDomain(ClienteRequestDto dto); // de DTO a entidad de dominio

	ClienteResponseDto toResponseDto(Cliente cliente); // de entidad a DTO
}
