package com.dsi.builder.back.pattern;

/**
 * GeneradorArchivosPDF is a product class
 * 
 * @author lcastillo7
 *
 */
public class GeneradorArchivosPDF implements IPresentacionReporte{
	
	private String[] reporteCuerpo;
	private String reporteEncabezado;
	private String reportePie;
	private String fechaFin;
	private String fechaHoraGeneracion;
	private String fechaInicio;
	private String titulo;
	private String usuario;
	
	
	public GeneradorArchivosPDF() {
	}
	
	public void agregarFila(String nombreEstado, double tiempoPermProm, double tiempoPermMax, double tiempoPermMin) {};
	
	public void iniciarFila() {};
	
	public void setEncabezado(String titulo, String fechaInicio, String fechaFin) {};
	
	public void setFechaFin(String fechaFin) {};
	
	public void setFechaHoraGeneración(String fechaHoraGeneración) {};
	
	public void setFechaInicio(String fechaInicio) {};
	
	public void setFila() {};
	
	public int setNroPagina(int numeroPagina) {return 0;};
	
	public void setPiePagina(String nombreUsuario, String fechaHoraGeneracion, int nroPagina) {};
	
	public void setSectorTabla(String nombreSector) {};
	
	public void setTitulo(String titulo) {};
	
	public void setUsuario(String nombreUsuario) {};
	
	public void visualizarReporte() {};
	
	public void visualizarReporteGenerado() {};
	
						   
}
