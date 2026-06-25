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
	@Column(name = "id_cliente")
	private int idCliente;
	
	@Column(name = "ci", length = 10)
	private String ciCliente; 

	@Column(name = "nombre", length = 80)
	private String nombreCliente; 

	@Column(name = "apellido", length = 80)
	private String apellidoCliente;
	
	@Column(name = "telefono", length = 80)
	private String telefonoCliente;
	
	@Column(name = "direccion", length = 80)
	private String direccionCliente;
	
	@Column(name = "correo", length = 80)
	private String correoCliente;
	
	@ManyToOne
	@JoinColumn(name = "fkTipoCliente")
	private TipoClienteEntity fkTipoCliente;
	
	@OneToMany(mappedBy = "fkCliente")
	private List<VentaEntity> venta;
}
