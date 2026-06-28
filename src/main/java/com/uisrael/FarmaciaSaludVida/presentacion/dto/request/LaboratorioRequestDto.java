package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LaboratorioRequestDto {

	private final int idLaboratorio;
	@NotBlank
	private final String nombreLaboratorio; 
	@NotBlank
	private final String telefonoLaboratorio;
}
