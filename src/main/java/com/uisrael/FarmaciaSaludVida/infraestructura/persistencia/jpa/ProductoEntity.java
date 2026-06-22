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
@Table(name = "producto")
public class ProductoEntity implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private int id_producto;
	
	@Column(name = "nombre_producto", length = 80)
	private String nombre_producto; 
	
	@Column(name = "descricion", length = 100)
	private String descricion; 
	
	@ManyToOne
	@JoinColumn(name = "fkCategoria")
	private CategoriaEntity fkCategoria;
	
	@ManyToOne
	@JoinColumn(name = "fkLaboratorio")
	private LaboratorioEntity fkLaboratorio;
	
}
