package com.dsi.builder.back.pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Builder interface defines all possible ways to configure a product
 *
 */
public interface IConstructorReporte {
	
	public int calcularNroPagina();
	
	public void construirPie(String nomUsuario, String fechaHoraGeneracion);
	
	public void construirProducto(String nomUsuario, String fechaHoraGeneracion);
	
	public void construirCuerpo(String estados, ArrayList<String> sectores, List<ArrayList<ArrayList<String>>> resultados);
	
	public void construirEncabezado(String titulo, String fechaInicio, String fechaFin);
	
	public IPresentacionReporte obtenerProducto();
}
