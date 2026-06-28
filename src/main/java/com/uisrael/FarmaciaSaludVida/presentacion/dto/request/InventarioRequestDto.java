package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.LoteEntity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class InventarioRequestDto {

	private final int idInventario;
	@NotBlank
	private final int stockActual;
	@NotBlank
	private LoteEntity fkLote;
}
