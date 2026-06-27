package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.uisrael.FarmaciaSaludVida.dominio.entidades.Categoria;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.CategoriaEntity;

@Mapper(componentModel = "spring")
public interface ICategoriaJpaMapper {

	// transforma la clase entity, a una calse pojo
	Categoria toDomain(CategoriaEntity entity);

	// transforma - mapea la clase pojo a una entidad
	CategoriaEntity toEntity(Categoria categoriaPojo);

}
