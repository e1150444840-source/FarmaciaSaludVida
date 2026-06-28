package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.TipoCliente;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.TipoClienteRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.TipoClienteResponseDto;

@Mapper(componentModel = "spring")
public interface ITipoClienteDtoMapper {

	TipoCliente toDomain(TipoClienteRequestDto dto); // de DTO a entidad de dominio

	TipoClienteResponseDto toResponseDto(TipoCliente tipoCliente); // de entidad a DTO
}
