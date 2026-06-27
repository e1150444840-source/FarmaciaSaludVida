package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.TipoCliente;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.TipoClienteEntity;

@Mapper(componentModel = "spring")
public interface ITipoClienteJpaMapper {

	TipoCliente toDomain(TipoClienteEntity entity);

	TipoClienteEntity toEntity(TipoCliente tipoClientePojo);
}
