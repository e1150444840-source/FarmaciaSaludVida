package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Venta;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VentaEntity;

@Mapper(componentModel = "spring")
public interface IVentaJpaMapper {

	Venta toDomain(VentaEntity entity);

	VentaEntity toEntity(Venta ventaPojo);
}
