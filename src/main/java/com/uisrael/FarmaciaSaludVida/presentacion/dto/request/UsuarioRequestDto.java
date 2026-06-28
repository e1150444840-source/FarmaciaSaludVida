package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuarioRequestDto {

	private final int idUsuario;
	@NotBlank
	private final String username;
	@NotBlank
	private final String password;
	@NotBlank
	private final String nombreUsuario;
	@NotBlank
	private final String apellidoUsuario;
	@NotBlank
	private final String rol;
	@NotBlank
	private final boolean estado; // activo - eliminado
}
