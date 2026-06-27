package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Pedido;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.PedidoEntity;

@Mapper(componentModel = "spring")
public interface IPedidoJpaMapper {

	Pedido toDomain(PedidoEntity entity);

	PedidoEntity toEntity(Pedido pedidoPojo);
}
