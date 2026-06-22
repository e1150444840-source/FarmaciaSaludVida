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
@Table(name = "farmacia")
public class FarmaciaEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_farmacia")
	private int id_farmacia;
	
	@Column(name = "nombre_farmacia", length = 100)
	private String nombre_farmacia; 
	
	@Column(name = "direccion", length = 100)
	private String direccion;
	
	@Column(name = "ciudad", length = 100)
	private String ciudad;
	
	@OneToMany(mappedBy = "fkFarmacia")
	private List<VentaEntity> venta;
	
}
