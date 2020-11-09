package com.dsi.builder.back.pattern;

public interface IConstructorReporte {
	
	public int calcularNroPagina();
	
	public void construirPie(String nomUsuario, String fechaHoraGeneración);
	
	public void construirProducto();
	
	public void construirCuerpo(String estados[], String vectores[], Double tiempoPermProm[][], Double tiempoPermMax[][], Double tiempoPermMin[][]);
	
	public void construirEncabezado(String titulo, String fechaInicio, String fechaFin);
	
	public IPresentacionReporte obtenerProducto();
}
