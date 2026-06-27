package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Producto;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.ProductoEntity;

@Mapper(componentModel = "spring")
public interface IProductoJpaMapper {
	
	Producto toDomain(ProductoEntity entity);

	ProductoEntity toEntity(Producto productoPojo);
}
