package com.dsi.builder.back.pattern;

import java.util.ArrayList;

public class DirectorConstruccionReporte {
	
	private IConstructorReporte constructor;
	
	public DirectorConstruccionReporte(IConstructorReporte constructor) {
		this.constructor = constructor;
	}
	
	public void construir(String titulo, 
						  String fechaInicio,
						  String fechaFin,
						  String estados,
						  String sectores,
						  ArrayList<ArrayList<String>> resultados,
						  String nomUsuario,
						  String fechaHoraGeneracion
			             ) 
	{
		constructor.construirProducto();
		constructor.construirEncabezado(titulo, fechaInicio, fechaFin);
		constructor.construirCuerpo(estados, sectores, resultados);
		constructor.construirPie(nomUsuario, fechaHoraGeneracion);
	}

}
