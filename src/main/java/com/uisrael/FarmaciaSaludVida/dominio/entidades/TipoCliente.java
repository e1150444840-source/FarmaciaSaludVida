package com.uisrael.FarmaciaSaludVida.dominio.entidades;

public class TipoCliente {

	private final int id_tipo_cliente;
	private final String nombre; 
	private final String descripcion;
	private final boolean estado; //true:activo - false:eliminado

	// constructor
	public TipoCliente(int id_tipo_cliente, String nombre, String descripcion, boolean estado) {
	
		this.id_tipo_cliente = id_tipo_cliente;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	// getter y setter
	public int getId_tipo_cliente() {
		return id_tipo_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	// to String
	@Override
	public String toString() {
		return "TipoCliente [id_tipo_cliente=" + id_tipo_cliente + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", estado=" + estado + "]";
	}
	
	
}