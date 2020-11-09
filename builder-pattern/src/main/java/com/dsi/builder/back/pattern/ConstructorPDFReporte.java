package com.dsi.builder.back.pattern;

import com.dsi.builder.back.pattern.GeneradorArchivosPDF;

public class ConstructorPDFReporte implements IConstructorReporte {

	private GeneradorArchivosPDF reporte = new GeneradorArchivosPDF();
	
	public int calcularNroPagina() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void construirPie(String nomUsuario, String fechaHoraGeneración) {
		// TODO Auto-generated method stub
		
	}

	public void construirProducto() {
		// TODO Auto-generated method stub
		
	}

	public void construirCuerpo(String[] estados, String[] vectores, Double[][] tiempoPermProm,
			Double[][] tiempoPermMax, Double[][] tiempoPermMin) {
		// TODO Auto-generated method stub
		
	}

	public void construirEncabezado(String titulo, String fechaInicio, String fechaFin) {
		// TODO Auto-generated method stub
		
	}

	public void obtenerProducto() {
		// TODO Auto-generated method stub
		
	}

}
