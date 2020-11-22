package com.dsi.builder.back.business;

import java.util.List;

public class Sector {
	
	private double ancho;
	private double largo;
	private String nombre;
	private String ubicacionPuerta;
	private String ubicacionVentana;
	private List<Seccion> secciones;
	
	public void armarPlano() {};
	
	public void ConocerSeccion() {};
	
	public void buscarMesasDisp() {};
	
	public void buscarPedCumplenFiltros() {};
	
	public void calcTiempoPermMax() {};
	
	public void calcTiempoPermMin() {};
	
	public void calcTiempoPermPromedio() {};
	
	public void calcularTiempos() {};
	
	public void conocerSeccion() {};
	
	public void contarPedidosSectorPorEstado() {};
	
	public void esDePerfilSelecc() {};
	
	public String getNombre() {
		return this.nombre;
	};
	
	public void mostrarDatos() {};
	
	@Override
	public String toString() {
		return "Sector: " + this.nombre + "------"
				+ "\n\tAncho: " + this.ancho
				+ "\n\tLargo: " + this.largo
				+ "\n\tUbicación Puerta: " + this.ubicacionPuerta
				+ "\n\tUbicacion Ventana: " + this.ubicacionVentana
				+ "\n\tSecciones: " + this.secciones.toString();
	};
	
}
