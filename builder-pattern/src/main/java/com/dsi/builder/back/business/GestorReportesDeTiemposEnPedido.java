package com.dsi.builder.back.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.dsi.builder.back.Utils;

import javafx.util.Pair;

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
	
	public ArrayList<Pair<String, Long>> getTiemposPorSector() {
		ArrayList<Seccion> seccionesInvolucradas = new ArrayList<Seccion>();
		
		sectoresSelecc.forEach(eSector -> seccionesInvolucradas.addAll(eSector.conocerSeccion()));
		
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		
		seccionesInvolucradas.forEach(eSeccion -> mesas.add(eSeccion.conocerMesa()));
		
		ArrayList<Pedido> pedidosInvolucrados = new ArrayList<Pedido>();
		
		mesas.forEach(eMesa -> pedidosInvolucrados.addAll(eMesa.conocerPedido()));
		
		ArrayList<HistorialEstado> historialesInvolucrados = new ArrayList<HistorialEstado>();
		
		pedidosInvolucrados.forEach(ePedido -> historialesInvolucrados.addAll(ePedido.getHistorial()));
		
		ArrayList<Pair<String, Long>> tuplas = new ArrayList<Pair<String, Long>>();
		
		historialesInvolucrados.forEach(eHistorial -> {
			Pair<String, Long> tupla = new Pair<String, Long>(eHistorial.conocerEstado().getNombre(), eHistorial.calcularDuracionEnEstado());
			
			tuplas.add(tupla);
		});
		
		return tuplas;
		
	}
	
	public ArrayList<ArrayList<String>> calcularTiemposPorSector(ArrayList<Pair<String, Long>> listOfTuplas) {
		
		ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
		
		this.estadosSeleccionados
						.forEach(eEstado -> {
			
			ArrayList<Long> values = new ArrayList<Long>();
			ArrayList<String> wildcardResults = new ArrayList<String>();
			
			Long maxValue = 0l;
			Long minValue = 0l;
			Double avg = 0.0;
			
			if (listOfTuplas.stream()
						.anyMatch(tupla -> tupla.getKey().equals(eEstado.getNombre()))) {
			
			listOfTuplas.stream()
						.filter(tupla -> tupla.getKey().equals(eEstado.getNombre()))
						.forEach(tupla -> {
							values.add(tupla.getValue());
						});;
			
			maxValue = Collections.max(values);
			minValue = Collections.min(values);
			avg = Utils.calculateAverage(values);
			
			wildcardResults.add(eEstado.getNombre());
			wildcardResults.add(String.valueOf(maxValue));
			wildcardResults.add(String.valueOf(minValue));
			wildcardResults.add(String.valueOf(avg));
			
			results.add(wildcardResults);
			
			} else {
				
				wildcardResults.add(eEstado.getNombre());
				wildcardResults.add(String.valueOf(0));
				wildcardResults.add(String.valueOf(0));
				wildcardResults.add(String.valueOf(0));
				
				results.add(wildcardResults);
			}
				
		});
		
		return results;		
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
	public void addEstadosSeleccionados(ArrayList<Estado> estadosSeleccionados) {
		estadosSeleccionados.forEach(pEstado -> this.estadosSeleccionados.add(pEstado));
	};

}
