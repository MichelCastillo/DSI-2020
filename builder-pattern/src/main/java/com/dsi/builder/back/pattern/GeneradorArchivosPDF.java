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
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Header;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPage;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

import com.dsi.builder.back.business.EstadosPedido;

/**
 * GeneradorArchivosPDF is a product class
 * 
 *
 */
public class GeneradorArchivosPDF implements IPresentacionReporte{
	
	//Document
	Document document = new Document();
	
	private String target = "src/main/resources/ReporteDeTiemposDePedido.pdf";
	
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
	
	public void createPDF() throws FileNotFoundException, DocumentException {
    	
    	// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
    	FileOutputStream file = new FileOutputStream(target);
    	
    	// Se asocia el documento al OutputStream y se indica que el espaciado entre
    	// lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
    	PdfWriter writer = PdfWriter.getInstance(this.document, file);
    	
    	//PdfWriter.getInstance(this.document, file).setInitialLeading(20);
    	
    	MyFooter event = new MyFooter();
    	
    	// Se abre el documento.
    	document.open();
    	
    	writer.setPageEvent(event);
    	
    	try
    	{
    		Image foto = Image.getInstance("src/main/resources/UTN_Logo.jpg");
    		foto.scaleToFit(100, 100);
    		//foto.setAlignment(Chunk.ALIGN_TOP);
    		foto.setAbsolutePosition((PageSize.A4.getWidth() - foto.getScaledWidth())-10, (PageSize.A4.getHeight() - foto.getScaledHeight()) -10);

    		
    		document.add(foto);
    	}
    	catch ( Exception e )
    	{
    		e.printStackTrace();
    	}
    	
    }
	
	public void addEncabezadoToPDF(String titulo, String fechaInicio, String fechaFin) throws DocumentException {
    	
    	this.document.add(new Paragraph(titulo + " - UTN FRC - DSI 2020",
				FontFactory.getFont("arial",   // fuente
				15,                            // tamaño
				Font.BOLD,                   // estilo
				BaseColor.BLACK)));
    	
    	this.document.add(new Paragraph("Período " + fechaInicio + " - " + fechaFin,
				FontFactory.getFont("arial",   // fuente
				12,                            // tamaño
				Font.BOLD,                   // estilo
				BaseColor.BLACK)));
    	
    	//this.document.close();
    }
    
    public void addCuerpoToPDF(String sector, ArrayList<ArrayList<String>> resultados) throws DocumentException {
    
    	this.document.add( Chunk.NEWLINE );
    	
    	this.document.add(new Paragraph("- " + sector,
			FontFactory.getFont("arial",   // fuente
			12,                            // tamaño
			Font.BOLD,                   // estilo
			BaseColor.BLACK)));
	
		this.document.add( Chunk.NEWLINE );
		
		PdfPTable tabla = new PdfPTable(4);
		
		tabla.addCell("Estado");
		tabla.addCell("MAX");
		tabla.addCell("MIN");
		tabla.addCell("AVG");
	
    	resultados.forEach(eResultado -> {
				tabla.addCell(eResultado.get(0));
				tabla.addCell(eResultado.get(1));
				tabla.addCell(eResultado.get(2));
				tabla.addCell(eResultado.get(3));
    	});
    	
    	this.document.add(tabla);
    }
    
    private void addPieDePagina(String user, String fechaHoraGeneracion) {
    }
    
    public void closeDocument() {
    	this.document.close();
    }
    
	public void visualizarReporteGenerado() {}

	@Override
	public void visualizarReporte() throws Exception {
		// TODO Auto-generated method stub
		
	};
	
						   
}

class MyFooter extends PdfPageEventHelper {
    Font ffont = new Font(Font.FontFamily.UNDEFINED, 5, Font.ITALIC);
        
    public void onEndPage(PdfWriter writer, Document document) {
        PdfContentByte cb = writer.getDirectContent();
        Phrase header = new Phrase("this is a header", ffont);
        Phrase footer = new Phrase("this is a footer", ffont);
        ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                header,
                (document.right() - document.left()) / 2 + document.leftMargin(),
                document.top() + 10, 0);
        ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                footer,
                (document.right() - document.left()) / 2 + document.leftMargin(),
                document.bottom() - 10, 0);
    }
}
