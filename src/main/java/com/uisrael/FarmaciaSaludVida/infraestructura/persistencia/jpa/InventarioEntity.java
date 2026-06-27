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
@Table(name = "inventario")
public class InventarioEntity implements Serializable {
	

private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_inventario")
	private int idInventario;
	
	@Column(name = "stock_actual")
	private int stockActual;
	    
    @ManyToOne
	@JoinColumn(name = "fk_farmacia")
	private FarmaciaEntity fkFarmacia;
	
	@ManyToOne
	@JoinColumn(name = "fk_lote")
	private LoteEntity fkLote;
	
	@OneToMany(mappedBy = "fkInventario")
	private List<DetalleVentaEntity> detalleVenta;
	
}
