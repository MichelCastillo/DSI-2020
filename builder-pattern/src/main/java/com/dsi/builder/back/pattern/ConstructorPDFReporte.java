package com.dsi.builder.back.pattern;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import com.dsi.builder.back.pattern.GeneradorArchivosPDF;
import com.itextpdf.text.DocumentException;

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
	
	public void construirProducto(String usuario, String fechaHoraGeneracion) {
		try {
			reporte = new GeneradorArchivosPDF(usuario, fechaHoraGeneracion);
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void construirPie(String nomUsuario, String fechaHoraGeneracion) {
		reporte.setPiePagina(nomUsuario, fechaHoraGeneracion);
		
	}

	public void construirCuerpo(String estados, ArrayList<String> vectores, List<ArrayList<ArrayList<String>>> resultados) {
		reporte.setCuerpo(estados, vectores, resultados);		
	}

	public void construirEncabezado(String titulo, String fechaInicio, String fechaFin) {
		reporte.setEncabezado(titulo, fechaInicio, fechaFin);		
	}

	public IPresentacionReporte obtenerProducto() {
		return reporte;
		
	}

}
