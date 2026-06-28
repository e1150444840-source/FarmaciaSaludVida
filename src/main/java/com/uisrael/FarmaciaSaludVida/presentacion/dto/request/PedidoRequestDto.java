package com.uisrael.FarmaciaSaludVida.presentacion.dto.request;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VehiculoEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.VentaEntity;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PedidoRequestDto {

	private final int idPedido;
	@NotBlank
	private final String fechaPedido;
	@NotBlank
	private final String estadoPedido;
	@NotBlank
	private final String direccionPedido;
	@NotBlank
	private VentaEntity fkVenta;
	@NotBlank
	private VehiculoEntity fkVehiculo;

}
