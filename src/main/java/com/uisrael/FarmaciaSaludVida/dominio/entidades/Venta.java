package com.uisrael.FarmaciaSaludVida.dominio.entidades;

import java.time.LocalDate;

import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.ClienteEntity;
import com.uisrael.FarmaciaSaludVida.infraestructura.persistencia.jpa.UsuarioEntity;

public class Venta {

	private final int idVenta;
	private final LocalDate fechaEmison;
	private final String canalVenta; // Física', 'En Línea
	private final double subtotal;
	private final double iva;
	private final double total;
	private ClienteEntity fkCliente;
	private UsuarioEntity fkUsuario;

	// constructor
	public Venta(int idVenta, LocalDate fechaEmison, String canalVenta, double subtotal, double iva, double total,
			ClienteEntity fkCliente, UsuarioEntity fkUsuario) {

		this.idVenta = idVenta;
		this.fechaEmison = fechaEmison;
		this.canalVenta = canalVenta;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.fkCliente = fkCliente;
		this.fkUsuario = fkUsuario;
	}

	// getter y setter
	public ClienteEntity getFkCliente() {
		return fkCliente;
	}

	public void setFkCliente(ClienteEntity fkCliente) {
		this.fkCliente = fkCliente;
	}

	public UsuarioEntity getFkUsuario() {
		return fkUsuario;
	}

	public void setFkUsuario(UsuarioEntity fkUsuario) {
		this.fkUsuario = fkUsuario;
	}

	public int getIdVenta() {
		return idVenta;
	}

	public LocalDate getFechaEmison() {
		return fechaEmison;
	}

	public String getCanalVenta() {
		return canalVenta;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public double getIva() {
		return iva;
	}

	public double getTotal() {
		return total;
	}

	// to String
	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", fechaEmison=" + fechaEmison + ", canalVenta=" + canalVenta
				+ ", subtotal=" + subtotal + ", iva=" + iva + ", total=" + total + ", fkCliente=" + fkCliente
				+ ", fkUsuario=" + fkUsuario + "]";
	}

}
