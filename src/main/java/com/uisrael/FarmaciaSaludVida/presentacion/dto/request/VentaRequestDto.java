package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import java.time.LocalDate;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.ClienteEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.UsuarioEntity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class VentaRequestDto {

	private final int idVenta;
	@NotBlank
	private final LocalDate fechaEmison;
	@NotBlank
	private final String canalVenta; // Física', 'En Línea
	@NotBlank
	private final double subtotal;
	@NotBlank
	private final double iva;
	@NotBlank
	private final double total;
	@NotBlank
	private ClienteEntity fkCliente;
	@NotBlank
	private UsuarioEntity fkUsuario;
}
