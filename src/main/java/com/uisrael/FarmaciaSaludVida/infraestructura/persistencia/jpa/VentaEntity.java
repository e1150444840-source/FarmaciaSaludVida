package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "venta")
public class VentaEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_venta")
	private int id_venta;
	
	@Column(name = "fecha_emision")
	private LocalDate fecha_emision; 
	
	@Column(name = "canal_venta")
	private String canal_venta;
	
	@Column(name = "subtotal")
	private double subtotal;
	
	@Column(name = "iva")
	private double iva;
	
	@Column(name = "total")
	private double total;
	
	@ManyToOne
	@JoinColumn(name = "fkCliente")
	private ClienteEntity fkCliente;
	
	@ManyToOne
	@JoinColumn(name = "fkFarmacia")
	private FarmaciaEntity fkFarmacia;
	
	@ManyToOne
	@JoinColumn(name = "fkUsuario")
	private UsuarioEntity fkUsuario;
	
	@OneToMany(mappedBy = "fkVenta")
	private List<DetalleVentaEntity> DetalleVenta;
	
}
