package com.dsi.builder.back.business;

public class Seccion {
	
	private double coordenadaX = 0.0;
	private double coordenadaY = 0.0;
	private double dimension;
	private String nombre;
	private Mesa mesa;
	
	/*
	 * @return dimension as double (coordenadaX * coordenadaY)
	 * */
	public double calculateDimension() {
		this.dimension = Math.abs(coordenadaX * coordenadaY);
		return this.dimension;
	};
	
	public void setCoordenadaX(double coordenadaX) {
		this.coordenadaX = coordenadaX;
	}
	
	public void setCoordenadaY(double coordenadaY) {
		this.coordenadaY = coordenadaY;
	}
	
	public double getCoordenadaX() {
		return this.coordenadaX;
	}
	
	public double getCoordenadaY() {
		return this.coordenadaY;
	}
	
	public void armarUbicacion() {};
	
	public void buscarMesasDisp() {};
	
	public void buscarPedCumpFiltros() {};
	
	public String getNombre() {
		return this.nombre;
	};
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	};
	
	public Mesa conocerMesa() {
		return this.mesa;
	};
	
	@Override
	public String toString() {
		return "Seccion: " + this.nombre + "------"
				+ "\n\tCoordenada X: " + this.coordenadaX
				+ "\n\tCoordenada Y: " + this.coordenadaY
				+ "\n\tDimensión: " + this.dimension
				+ "\n\tMesa: " + this.mesa.toString();
	};
}
