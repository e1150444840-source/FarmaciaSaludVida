package com.uisrael.FarmaciaSaludVida.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Pedido;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.request.PedidoRequestDto;
import com.uisrael.FarmaciaSaludVida.presentacion.dto.response.PedidoResponseDto;

@Mapper(componentModel = "spring")
public interface IPedidoDtoMapper {

	Pedido toDomain(PedidoRequestDto dto); // de DTO a entidad de dominio

	PedidoResponseDto toResponseDto(Pedido pedido); // de entidad a DTO
}
