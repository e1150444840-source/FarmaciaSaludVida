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
@Table(name = "laboratorio")
public class LaboratorioEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_laboratorio")
	private int id_laboratorio;
	
	@Column(name = "nombre_laboratorio", length = 100)
	private String nombre_laboratorio; 
	
	@Column(name = "telefono", length = 100)
	private String telefono;
	
	@OneToMany(mappedBy = "fkLaboratorio")
	private List<ProductoEntity> producto;
}
