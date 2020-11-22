package com.dsi.builder.back.business;

import java.util.ArrayList;

public class Sector {
	
	private double ancho;
	private double largo;
	private String nombre;
	private String ubicacionPuerta;
	private String ubicacionVentana;
	private ArrayList<Seccion> secciones = new ArrayList<Seccion>();
	
	public Sector(String nombre, double ancho, double largo, String ubicacionPuerta, String ubicacionVentana, ArrayList<Seccion> secciones) {
		this.nombre = nombre;
		this.ancho = ancho;
		this.largo = largo;
		this.ubicacionPuerta = ubicacionPuerta;
		this.ubicacionVentana = ubicacionVentana;
		secciones.forEach(pSecciones -> this.secciones.add(pSecciones));
		
	}
	
	public void armarPlano() {};
	
	public ArrayList<Seccion> ConocerSeccion() {
		return secciones;
	};
	
	public void addSeccion(Seccion seccion) {
		this.secciones.add(seccion);
	}
	
	public void addSecciones(ArrayList<Seccion> secciones) {
		secciones.forEach(pSecciones -> this.secciones.add(pSecciones));
	}
	
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
	
	public String visualizarSector() {
		return "\n\t\tSector-----------"
				+ "\n\t\t\tAncho: " + this.ancho
				+ "\n\t\t\tLargo: " + this.largo
				+ "\n\t\t\tUbicación Puerta: " + this.ubicacionPuerta
				+ "\n\t\t\tUbicacion Ventana: " + this.ubicacionVentana;
	}
	
	@Override
	public String toString() {
		return "\n\t\tSector-----------------------------------------------------------------------------------------"
				+ "\n\t\t\tAncho: " + this.ancho
				+ "\n\t\t\tLargo: " + this.largo
				+ "\n\t\t\tUbicación Puerta: " + this.ubicacionPuerta
				+ "\n\t\t\tUbicacion Ventana: " + this.ubicacionVentana
				+ "\n\t\t\tSecciones: " + this.secciones.toString()
				;
	};
	
}
