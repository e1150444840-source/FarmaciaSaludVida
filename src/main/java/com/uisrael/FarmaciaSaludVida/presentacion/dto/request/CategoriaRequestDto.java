package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoriaRequestDto {

	private final int idCategoria;
	@NotBlank
	private final String nombreCategoria;
}
