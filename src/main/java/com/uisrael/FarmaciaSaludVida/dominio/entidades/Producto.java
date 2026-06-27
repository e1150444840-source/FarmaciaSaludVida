package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.CategoriaEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.LaboratorioEntity;

public class Producto {

	private final int idProducto;
	private final String nombreProducto;
	private final String descripcion;
	private CategoriaEntity fkCategoria;
	private LaboratorioEntity fkLaboratorio;

	// constructor
	public Producto(int idProducto, String nombreProducto, String descripcion, CategoriaEntity fkCategoria,
			LaboratorioEntity fkLaboratorio) {
		
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.descripcion = descripcion;
		this.fkCategoria = fkCategoria;
		this.fkLaboratorio = fkLaboratorio;
	}

	// getter y setter
	public CategoriaEntity getFkCategoria() {
		return fkCategoria;
	}

	public void setFkCategoria(CategoriaEntity fkCategoria) {
		this.fkCategoria = fkCategoria;
	}

	public LaboratorioEntity getFkLaboratorio() {
		return fkLaboratorio;
	}

	public void setFkLaboratorio(LaboratorioEntity fkLaboratorio) {
		this.fkLaboratorio = fkLaboratorio;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	// to String
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", descripcion="
				+ descripcion + ", fkCategoria=" + fkCategoria + ", fkLaboratorio=" + fkLaboratorio + "]";
	}

}
