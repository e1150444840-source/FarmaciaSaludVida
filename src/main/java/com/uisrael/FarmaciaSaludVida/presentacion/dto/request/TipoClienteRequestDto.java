package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TipoClienteRequestDto {

	private final int idTipoCliente;
	@NotBlank
	private final String nombreTipoCliente; // VIP, Mayorista, persona natural
	@NotBlank
	private final String descripcion;
	@NotBlank
	private final boolean estado; // activo - eliminado
}
