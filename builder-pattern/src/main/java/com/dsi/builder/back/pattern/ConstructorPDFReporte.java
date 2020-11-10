package com.dsi.builder.back.pattern;

import com.dsi.builder.back.pattern.GeneradorArchivosPDF;

/**
 * Concrete builders implement steps defined in the upper interface
 *
 */
public class ConstructorPDFReporte implements IConstructorReporte {

	private GeneradorArchivosPDF reporte;
	
	/**
	 * @return random int value 
	 * 
	 * TODO: Implement a real method
	 */
	public int calcularNroPagina() {
		return (int) (Math.random() * 10 + 1);
	}
	
	public void construirProducto() {
		reporte = new GeneradorArchivosPDF();
		
	}

	public void construirPie(String nomUsuario, String fechaHoraGeneracion, int numeroPagina) {
		
		int numPagina = calcularNroPagina();
		reporte.setPiePagina(nomUsuario, fechaHoraGeneracion, numPagina);
		
	}

	public void construirCuerpo(String[] estados, String[] vectores, double[][] tiempoPermProm,
			double[][] tiempoPermMax, double[][] tiempoPermMin) {
		reporte.setCuerpo(estados, vectores, tiempoPermProm, tiempoPermMax, tiempoPermMin);		
	}

	public void construirEncabezado(String titulo, String fechaInicio, String fechaFin) {
		reporte.setEncabezado(titulo, fechaInicio, fechaFin);		
	}

	public IPresentacionReporte obtenerProducto() {
		return reporte;
		
	}

}
