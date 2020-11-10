package com.dsi.builder.back.business;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pedido {

	private int cantComensales;
	private Date fechaHoraPed;
	private int nroPedido;
	
	public Pedido(int comensales, Date fechaHora, int numero) throws ParseException {
		this.cantComensales = comensales;
		this.fechaHoraPed = fechaHora;
		this.nroPedido = numero;		
	}
	
	/**
	 * @return the nroPedido
	 */
	public int getNroPedido() {
		return nroPedido;
	}
	
	/**
	 * @param nroPedido the nroPedido to set
	 */
	public void setNroPedido(int nroPedido) {
		this.nroPedido = nroPedido;
	}
	
	/**
	 * @return the fechaHoraPed
	 */
	public Date getFechaHoraPed() {
		return fechaHoraPed;
	}
	
	/**
	 * @param fechaHoraPed the fechaHoraPed to set
	 */
	public void setFechaHoraPed(Date fechaHoraPed) {
		this.fechaHoraPed = fechaHoraPed;
	}
	/**
	 * @return the cantComensales
	 */
	public int getCantComensales() {
		return cantComensales;
	}
	
	/**
	 * @param cantComensales the cantComensales to set
	 */
	public void setCantComensales(int cantComensales) {
		this.cantComensales = cantComensales;
	}
	
	
	
}
