package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.TipoClienteEntity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteRequestDto {

	private final int idCliente;// porque trabaja el FJPA
	@NotBlank
	private final String ciCliente;
	@NotBlank
	private final String nombreCliente;
	@NotBlank
	private final String apellidoCliente;
	@NotBlank
	private final String telefonoCliente;
	@NotBlank
	private final String direccionCliente;
	@NotBlank
	private final String correoCliente;
	@NotBlank
	private TipoClienteEntity fkTipoCliente;
}
