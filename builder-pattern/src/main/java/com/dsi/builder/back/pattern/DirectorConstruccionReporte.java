package com.dsi.builder.back.pattern;

public class DirectorConstruccionReporte {
	
	private IConstructorReporte constructor;
	
	public DirectorConstruccionReporte() {}
	
	public void construir(String titulo, 
						  String fechaInicio,
						  String fechaFin,
						  String estados[],
						  String sectores[],
						  double tiempoPermProm[][],
						  double tiempoPermMax[][],
						  double tiempoPermMin[][],
						  String nomUsuario,
						  String fechaHoraGeneracion
			             ) 
	{
		constructor.construirProducto();
		constructor.construirEncabezado(titulo, fechaInicio, fechaFin);
		constructor.construirCuerpo(estados, sectores, tiempoPermProm, tiempoPermMax, tiempoPermMin);
		constructor.construirPie(nomUsuario, fechaHoraGeneracion);
	}

}
