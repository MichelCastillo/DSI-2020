package com.dsi.builder.back.pattern;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import com.dsi.builder.back.business.EstadosPedido;

/**
 * GeneradorArchivosPDF is a product class
 * 
 *
 */
public class GeneradorArchivosPDF implements IPresentacionReporte{
	
	//Attributes
	private List<String> reporteEncabezado;
	private List<String> reporteCuerpo;
	private List<String> reportePie;
	
	//Encabezado
	private String fechaFin;
	private String fechaInicio;
	private String titulo;
	
	//Cuerpo
	private String estados;
	private String vectores;
	private ArrayList<ArrayList<String>> resultados;	
	
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
	
	public void setCuerpo(String estados, String vectores, ArrayList<ArrayList<String>> resultados) {
		
		//Setting Cuerpo attributes
		this.estados = estados;
		this.vectores = vectores;
		this.resultados = resultados;
		
		//Making Cuerpo
		reporteCuerpo.add(this.estados.toString());
		reporteCuerpo.add(this.vectores.toString());
		reporteCuerpo.add(this.resultados.toString());
		
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
	
	public void visualizarReporte() throws Exception {
		
		// Se crea el documento
		Document documento = new Document();
		
		// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
		FileOutputStream ficheroPdf;
		try {
			ficheroPdf = new FileOutputStream("src/main/resources/fichero.pdf");
			
			// Se asocia el documento al OutputStream y se indica que el espaciado entre
			// lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
			PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);

			// Se abre el documento.
			documento.open();
			
			documento.add(new Paragraph("Esto es el primer párrafo, normalito"));

			documento.add(new Paragraph("Este es el segundo y tiene una fuente rara",
							FontFactory.getFont("arial",   // fuente
							22,                            // tamaño
							Font.ITALIC,                   // estilo
							BaseColor.CYAN)));             // color
			
			try
			{
				Image foto = Image.getInstance("src/main/resources/Kratos.png");
				foto.scaleToFit(100, 100);
				foto.setAlignment(Chunk.ALIGN_MIDDLE);
				documento.add(foto);
			}
			catch ( Exception e )
			{
				e.printStackTrace();
			}
			
			documento.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	};
	
	public void visualizarReporteGenerado() {};
	
						   
}
