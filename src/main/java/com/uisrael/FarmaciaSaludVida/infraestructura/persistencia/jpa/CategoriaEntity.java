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
@Table(name = "categoria")
public class CategoriaEntity implements Serializable  {

	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_categoria")	
	private int id_categoria;
	
	@Column(name = "nombre_categoria", length = 100)
	private String nombre_categoria;
	
	@OneToMany(mappedBy = "fkCategoria")
	private List<ProductoEntity> producto;
	
}
