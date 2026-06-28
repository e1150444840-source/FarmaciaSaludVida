package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.CategoriaEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.LaboratorioEntity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductoRequestDto {

	private final int idProducto;
	@NotBlank
	private final String nombreProducto;
	@NotBlank
	private final String descripcion;
	@NotBlank
	private CategoriaEntity fkCategoria;
	@NotBlank
	private LaboratorioEntity fkLaboratorio;
}
