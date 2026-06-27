package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Cliente;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.ClienteEntity;

@Mapper(componentModel = "spring")
public interface IClienteJpaMapper {

	Cliente toDomain(ClienteEntity entity);

	ClienteEntity toEntity(Cliente clientePojo);
}
