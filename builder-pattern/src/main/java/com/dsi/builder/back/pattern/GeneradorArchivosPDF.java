package com.dsi.builder.back.pattern;

import java.util.Date;
import java.util.List;

import com.dsi.builder.back.business.EstadosPedido;

/**
 * GeneradorArchivosPDF is a product class
 * 
 * @author lcastillo7
 *
 */
public class GeneradorArchivosPDF implements IPresentacionReporte{
	
	//Attributes
	private List<String> reporteCuerpo;
	private List<String> reporteEncabezado;
	private List<String> reportePie;
	
	//Encabezado
	private String fechaFin;
	private String fechaInicio;
	private String titulo;
	
	//Cuerpo
	private String[] estados;
	private String[] vectores;
	private double[][] tiempoPermProm;
	private double[][] tiempoPermMax;
	private double[][] tiempoPermMin;	
	
	//Pie
	private String fechaHoraGeneracion;
	private String usuario;
	private int nroPagina;
	
	public GeneradorArchivosPDF() {
	}
	
	public GeneradorArchivosPDF(String titulo, Date fechaInicio, Date fechaFin) {
	}
	
	public void agregarFila(String nombreEstado, double tiempoPermProm, double tiempoPermMax, double tiempoPermMin) {};
	
	public void iniciarFila() {};
	
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
	
	public void setCuerpo(String[] estados, String[] vectores, double[][] tiempoPermProm,
			double[][] tiempoPermMax, double[][] tiempoPermMin) {
		
		//Setting Cuerpo attributes
		this.estados = estados;
		this.vectores = vectores;
		this.tiempoPermProm = tiempoPermProm;
		this.tiempoPermMax = tiempoPermMax;
		this.tiempoPermMin = tiempoPermMin;
		
		//Making Cuerpo
		reporteCuerpo.add(this.estados.toString());
		reporteCuerpo.add(this.vectores.toString());
		reporteCuerpo.add(toString(this.tiempoPermProm));
		reporteCuerpo.add(toString(this.tiempoPermMax));
		reporteCuerpo.add(toString(this.tiempoPermMin));
		
	};
			
	public void setPiePagina(String nombreUsuario, String fechaHoraGeneracion, int nroPagina) {
			this.usuario = nombreUsuario;
			this.fechaHoraGeneracion = fechaHoraGeneracion;
			this.nroPagina = nroPagina;
			
			reportePie.add(this.usuario);
			reportePie.add(this.fechaHoraGeneracion);
			reportePie.add(String.valueOf(this.nroPagina));
	};
	
	public static String toString(double[][] M) {
	    String separator = ", ";
	    StringBuffer result = new StringBuffer();

	    // iterate over the first dimension
	    for (int i = 0; i < M.length; i++) {
	    	
	        // iterate over the second dimension
	        for(int j = 0; j < M[i].length; j++){
	            result.append(M[i][j]);
	            result.append(separator);
	        }
	        
	        // remove the last separator
	        result.setLength(result.length() - separator.length());
	        
	        // add a line break.
	        result.append("\n");
	    }
	    return result.toString();
	}
	
	public void setFechaFin(String fechaFin) {};
	
	public void setFechaHoraGeneración(String fechaHoraGeneración) {};
	
	public void setFechaInicio(String fechaInicio) {};
	
	public void setFila() {};
	
	public int setNroPagina(int numeroPagina) {return 0;};
	
	public void setSectorTabla(String nombreSector) {};
	
	public void setTitulo(String titulo) {};
	
	public void setUsuario(String nombreUsuario) {};
	
	public void visualizarReporte() {};
	
	public void visualizarReporteGenerado() {};
	
						   
}
