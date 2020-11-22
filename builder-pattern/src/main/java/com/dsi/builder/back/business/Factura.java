package com.dsi.builder.back.business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
	
	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy'T'HH:mm:ssZ");
	private Date result;
	private Date fechaYHora;
	private int numero;
	private double total;
	
	public Factura(Date fechaYHora, int numeroFactura) throws ParseException {	
		this.fechaYHora = fechaYHora;
		this.numero = numeroFactura;
		this.total = Math.random()*100 + 1;
	}

	/**
	 * @return the fecha
	 */
	public Date getFechaYHora() {
		return fechaYHora;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fechaYHora = fecha;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the total
	 */
	public double getTotal() {
		return total;
	}

	@Override
	public String toString() {
		return "Factura: " + this.numero + "--------------"
				+ "\n\tFecha: " + this.fechaYHora
				+ "\n\tTotal: " + this.total + "\n";
	};
	
	
	
	

}
