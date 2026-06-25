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
@Table(name = "tipo_cliente")
public class TipoClienteEntity implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_cliente")
	private int idTipoCliente;
	
	@Column(name = "nombre_tipo_cliente", length = 80)
	private String nombreTipoCliente; 
	
	@Column(name = "descripcion", length = 100)
	private String descripcion;
	
	@Column(name = "estado")
	private boolean estado;
		
	@OneToMany(mappedBy = "fkTipoCliente")
	private List<ClienteEntity> cliente;
}
