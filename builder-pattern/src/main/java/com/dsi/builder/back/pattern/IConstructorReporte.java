package com.dsi.builder.back.pattern;


/**
 * Builder interface defines all possible ways to configure a product
 * 
 * @author lcastillo7
 *
 */
public interface IConstructorReporte {
	
	public int calcularNroPagina();
	
	public void construirPie(String nomUsuario, String fechaHoraGeneración);
	
	public void construirProducto();
	
	public void construirCuerpo(String estados[], String vectores[], double tiempoPermProm[][], double tiempoPermMax[][], double tiempoPermMin[][]);
	
	public void construirEncabezado(String titulo, String fechaInicio, String fechaFin);
	
	public IPresentacionReporte obtenerProducto();
}
