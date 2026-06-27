package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Inventario;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.InventarioEntity;

@Mapper(componentModel = "spring")
public interface IInventarioJpaMapper {

	Inventario toDomain(InventarioEntity entity);

	InventarioEntity toEntity(Inventario inventarioPojo);
}
