package com.dsi.builder.back.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private int nroPedido;
	private int cantComensales;
	private Date fechaHoraPed;
	private Factura factura;
	private ArrayList<HistorialEstado> historial = new ArrayList<HistorialEstado>();
	
	 @Override
	 public String toString() {	    	
	    return "Pedido N°: " + this.nroPedido + "------------"
	    		+ "\n\tCantidad de Comensales: " + this.cantComensales
	    		+ "\n\tFecha y Hora: " + this.fechaHoraPed
	    		+ "\n\tREF: " + factura.toString()
	    		+ "\n\tREF: " + historial.toString(); 
	 }
	
	public Pedido(int comensales, Date fechaHora, int numero, Factura factura){
		
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
	
	/**
	 * @return the historialEstado
	 */
	public HistorialEstado conocerHistorialEstado() {
		return historial.get(historial.size() -1);
	}
	
	public List<HistorialEstado> getHistorial() {
		return this.historial;
	}

	/**
	 * @param historial the historial to add
	 */
	public void addHistorial(HistorialEstado historial) {
		this.historial.add(historial);
	}
}
