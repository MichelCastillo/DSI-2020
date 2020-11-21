package com.dsi.builder.back.business;

import java.util.Date;

public class GestorReportesDeTiemposEnPedido {
	
	private String[] estadosSeleccionados;
	private String fechaHoraActual;
	private String nombreUsuarioLog;
	private String sectoresSelecc;
	private Double[][] tiemposPermMax;
	private Double[][] tiemposPermMin;
	private Double[][] tiemposPermDouble;
	
	//UC Description
	
	//Validate period
	private Date periodInitialDate;
	private Date periodFinalDate;
	
	
	public GestorReportesDeTiemposEnPedido() {};
	
	public void generarReportePDF() {};
	
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
	};

}
