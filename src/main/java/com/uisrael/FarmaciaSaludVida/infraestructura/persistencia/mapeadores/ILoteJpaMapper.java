package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Lote;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.LoteEntity;

@Mapper(componentModel = "spring")
public interface ILoteJpaMapper {

	Lote toDomain(LoteEntity entity);

	LoteEntity toEntity(Lote lotePojo);
}
