package com.dsi.builder.back.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestorReportesDeTiemposEnPedido {
	
	private ArrayList<Estado> estadosSeleccionados = new ArrayList<Estado>();
	private Date fechaHoraActual = new Date();
	private String nombreUsuarioLog = "Mich";
	private ArrayList<Sector> sectoresSelecc = new ArrayList<Sector>();
	private ArrayList<Piso> pisosSelecc = new ArrayList<Piso>();
	private List<List<Object>> resultados = new ArrayList<List<Object>>();
	private Double[][] tiemposPermMax;
	private Double[][] tiemposPermMin;
	private Double[][] tiemposPermDouble;
	
	//UC Description
	
	//Validate period
	private Date periodInitialDate;
	private Date periodFinalDate;
	
	
	public GestorReportesDeTiemposEnPedido() {};
	
	public void generarReportePDF() {};
	
	public void calcularTotalTiempoPorPiso() {
		
		
		
	}
	
	public void addPisosSeleccionados(ArrayList<Piso> pisos) {
		pisos.forEach(ePiso -> pisosSelecc.add(ePiso));
	}
	
	public void addSectoresSeleccionados(ArrayList<Sector> sectores) {
		sectores.forEach(eSector -> sectoresSelecc.add(eSector));
	}
	
	public ArrayList<Sector> getSectoresSelecc() {
		return this.sectoresSelecc;
	}
	
	public void tomarFormaVis() {};
	
	public boolean validatePeriod(Date initialDate, Date finalDate) {
		return finalDate.after(initialDate);
	}

	/**
	 * @return the periodInitialDate
	 */
	public Date getPeriodInitialDate() {
		return periodInitialDate;
	}

	/**
	 * @param periodInitialDate the periodInitialDate to set
	 */
	public void setPeriodInitialDate(Date periodInitialDate) {
		this.periodInitialDate = periodInitialDate;
	}

	/**
	 * @return the periodFinalDate
	 */
	public Date getPeriodFinalDate() {
		return periodFinalDate;
	}

	/**
	 * @param periodFinalDate the periodFinalDate to set
	 */
	public void setPeriodFinalDate(Date periodFinalDate) {
		this.periodFinalDate = periodFinalDate;
	}

	/**
	 * @return the estadosSeleccionados
	 */
	public ArrayList<Estado> getEstadosSeleccionados() {
		return estadosSeleccionados;
	}

	/**
	 * @param estadosSeleccionados the estadosSeleccionados to set
	 */
	public void setEstadosSeleccionados(ArrayList<Estado> estadosSeleccionados) {
		estadosSeleccionados.forEach(pEstado -> this.estadosSeleccionados.add(pEstado));
	};

}
