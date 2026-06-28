package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FarmaciaRequestDto {

	private final int idFarmacia;
	@NotBlank
	private final String nombreFarmacia; 
	@NotBlank
	private final String direccion;
	@NotBlank
	private final String ciudad;
}
