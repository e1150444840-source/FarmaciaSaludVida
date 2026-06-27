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
	private int idVenta;
	
	@Column(name = "fecha_emision")
	private LocalDate fechaEmision; 
	
	@Column(name = "canal_venta")
	private String canalVenta;
	
	@Column(name = "subtotal")
	private double subtotal;
	
	@Column(name = "iva")
	private double iva;
	
	@Column(name = "total")
	private double total;
	
	@ManyToOne
	@JoinColumn(name = "fk_cliente")
	private ClienteEntity fkCliente;
	
	@ManyToOne
	@JoinColumn(name = "fk_usuario")
	private UsuarioEntity fkUsuario;
	
	@OneToMany(mappedBy = "fkVenta")
	private List<DetalleVentaEntity> detalleVenta;
	
}
