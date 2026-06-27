package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.DetalleVenta;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.DetalleVentaEntity;

@Mapper(componentModel = "spring")
public interface IDetalleVentaJpaMapper {

	DetalleVenta toDomain(DetalleVentaEntity entity);

	DetalleVentaEntity toEntity(DetalleVenta detalleVentaPojo);
}
