package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.InventarioEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VentaEntity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class DetalleVentaRequestDto {

	private final int idDetalleVenta;
	@NotBlank
	private final int cantidad;
	@NotBlank
	private final double precioUnitario;
	@NotBlank
	private VentaEntity fkVenta;
	@NotBlank
	private InventarioEntity fkInventario;
}
