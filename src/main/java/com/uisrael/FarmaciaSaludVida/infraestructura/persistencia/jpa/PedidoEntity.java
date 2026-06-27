package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pedido")
public class PedidoEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private int idPedido;
	
	@Column(name = "fecha_pedido")
	private LocalDate fechaPedido;
	
	@Column(name = "estado_pedido", length = 50)
	private String estadoPedido; 
	
	@Column(name = "direccion_pedido", length = 50)
	private String direccionPedido;
	
	@ManyToOne
	@JoinColumn(name = "fk_venta")
	private VentaEntity fkVenta;
		
	@ManyToOne
	@JoinColumn(name = "fk_vehiculo")
	private VehiculoEntity fkVehiculo;
}
