package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa;

import java.io.Serializable;
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
@Table(name = "cliente")
public class ClienteEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")
	private int id;
	
	@Column(name = "ci", length = 10)
	private String ci; 

	@Column(name = "nombre", length = 80)
	private String nombre; 

	@Column(name = "apellido", length = 80)
	private String apellido;
	
	@Column(name = "telefono", length = 80)
	private String telefono;
	
	@Column(name = "direccion", length = 80)
	private String direccion;
	
	@Column(name = "correo", length = 80)
	private String correo;
	
	@ManyToOne
	@JoinColumn(name = "fkTipoCliente")
	private TipoClienteEntity fkTipoCliente;
	
	@OneToMany(mappedBy = "fkCliente")
	private List<VentaEntity> venta;
}
