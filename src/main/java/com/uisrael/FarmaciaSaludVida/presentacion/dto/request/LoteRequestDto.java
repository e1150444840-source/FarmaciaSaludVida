package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import java.time.LocalDate;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.ProductoEntity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoteRequestDto {

	private final int idLote;
	@NotBlank
	private final String numeroLote;
	@NotBlank
	private final LocalDate fechaCaducidad;
	@NotBlank
	private final LocalDate fechaIngreso;
	@NotBlank
	private ProductoEntity fkProducto;
}
