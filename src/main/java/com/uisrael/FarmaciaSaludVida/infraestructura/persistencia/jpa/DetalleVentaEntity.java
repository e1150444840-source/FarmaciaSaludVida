package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa;

import java.io.Serializable;

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
@Table(name = "detalle_venta")
public class DetalleVentaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_venta")
	private int idDetalleVenta;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "precio_unitario")
	private double precioUnitario;
	
	@ManyToOne
	@JoinColumn(name = "fk_venta")
	private VentaEntity fkVenta;
	
	@ManyToOne
	@JoinColumn(name = "fk_inventario")
	private InventarioEntity fkInventario;
	
}
