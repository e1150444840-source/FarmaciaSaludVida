package com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "vehiculo")
public class VehiculoEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_vehiculo")
	private int idVehiculo;
	
	@Column(name = "placa", length = 10)
	private String placa; 
	
	@Column(name = "capacidad", length = 50)
	private String capacidad;
	
	@Column(name = "estado_disponibilidad", length = 20)
	private String estadoDisponibilidad;
	
	@OneToMany(mappedBy = "fkVehiculo")
	private List<PedidoEntity> pedido;
	
	
	

}
