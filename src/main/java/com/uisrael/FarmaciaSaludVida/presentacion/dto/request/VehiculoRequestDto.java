package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class VehiculoRequestDto {

	private final int idVehiculo;
	@NotBlank
	private final String placa;
	@NotBlank
	private final String capacidad;
	@NotBlank
	private final String estadoDisponibilidad;

}
