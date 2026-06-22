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
@Table(name = "lote")
public class LoteEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_lote")
	private int id_lote;
	
	@Column(name = "numero_lote", length = 50)
	private String numero_lote; 

	@Column(name = "fecha_caducidad")
	private LocalDate fecha_caducidad; 

	@Column(name = "fecha_ingreso")
	private LocalDate fecha_ingreso;
	
	@ManyToOne
	@JoinColumn(name = "fkProducto")
	private ProductoEntity fkProducto;
	
}
