package com.dsi.builder.back.business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
	
	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy'T'HH:mm:ssZ");
	private Date result;
	private Date fecha;
	private Date hora;
	private int numero;
	private double total;
	
	public Factura(String fecha, int numeroFactura) throws ParseException {
		
		this.result = df.parse(fecha); // "10/10/2020T20:00:00+0000"

		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
		this.setFecha(sdf.parse(fecha));
		
		sdf =  new SimpleDateFormat("HH:mm");
		this.setHora(sdf.parse(fecha));
		
		this.numero = numeroFactura;
		this.total = Math.random()*100 + 1;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the hora
	 */
	public Date getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(Date hora) {
		this.hora = hora;
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

	
	
	
	

}
