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
@Table(name = "usuario")
public class UsuarioEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private int id_usuario;

	@Column(name = "username", length = 50)
	private String username;
	
	@Column(name = "password", length = 50)
	private String password;
	
	@Column(name = "nombre_usuario", length = 50)
	private String nombre_usuario;
	
	@Column(name = "apellido_usuario", length = 50)
	private String apellido_usuario;
	
	@Column(name = "nombre_rol", length = 50)
	private String nombre_rol;
	
	@Column(name = "estado")
	private boolean estado;

	@OneToMany(mappedBy = "fkUsuario")
	private List<VentaEntity> venta;
}
