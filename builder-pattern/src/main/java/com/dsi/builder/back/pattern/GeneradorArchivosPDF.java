package com.dsi.builder.back.pattern;

import java.util.Date;
import java.util.List;

/**
 * GeneradorArchivosPDF is a product class
 * 
 * @author lcastillo7
 *
 */
public class GeneradorArchivosPDF implements IPresentacionReporte{
	
	private String[] reporteCuerpo;
	private List<String> reporteEncabezado;
	private List<String> reportePie;
	
	private String fechaFin;
	private String fechaHoraGeneracion;
	private String fechaInicio;
	private String titulo;
	private String usuario;
	private int nroPagina;
	
	public GeneradorArchivosPDF() {
	}
	
	public GeneradorArchivosPDF(String titulo, Date fechaInicio, Date fechaFin) {
	}
	
	public void agregarFila(String nombreEstado, double tiempoPermProm, double tiempoPermMax, double tiempoPermMin) {};
	
	public void iniciarFila() {};
	
	/**
	 * Making Encabezado
	 * 
	 * <titulo, fechaInicio, fechaFin>
	 */
	public void setEncabezado(String titulo, String fechaInicio, String fechaFin) {
		
		//Setting attributes
		this.titulo = titulo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		
		//Adding Strings values to Encabezado
		reporteEncabezado.add(titulo);
		reporteEncabezado.add(fechaInicio);
		reporteEncabezado.add(fechaFin);
	};
	
	public void setFechaFin(String fechaFin) {};
	
	public void setFechaHoraGeneración(String fechaHoraGeneración) {};
	
	public void setFechaInicio(String fechaInicio) {};
	
	public void setFila() {};
	
	public int setNroPagina(int numeroPagina) {return 0;};
	
	public void setPiePagina(String nombreUsuario, String fechaHoraGeneracion, int nroPagina) {
		this.usuario = nombreUsuario;
		this.fechaHoraGeneracion = fechaHoraGeneracion;
		this.nroPagina = nroPagina;
		
		reportePie.add(this.usuario);
		reportePie.add(this.fechaHoraGeneracion);
		reportePie.add(String.valueOf(this.nroPagina));
	};
	
	public void setSectorTabla(String nombreSector) {};
	
	public void setTitulo(String titulo) {};
	
	public void setUsuario(String nombreUsuario) {};
	
	public void visualizarReporte() {};
	
	public void visualizarReporteGenerado() {};
	
						   
}
