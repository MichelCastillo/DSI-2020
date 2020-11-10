package com.dsi.builder.back.business;

import java.text.ParseException;
import java.util.Date;

public class Pedido {
	
	private int nroPedido;
	private int cantComensales;
	private Date fechaHoraPed;
	private Factura factura;
	
	public Pedido(int comensales, Date fechaHora, int numero, Factura factura) throws ParseException {
		this.cantComensales = comensales;
		this.fechaHoraPed = fechaHora;
		this.nroPedido = numero;
		this.factura = factura;
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
	
	public void conocerDetallePedido() {
		//TODO: Implement this method to retrieve a DetallePedido object
	}
	
	public Factura conocerFactura() {
		return factura;
	}
	
	public void conocerHistorialEstado() {
		//TODO: Implement this method to retrieve a HistorialEstado object
	}
}
