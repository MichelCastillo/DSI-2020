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
	
	private String target = "src/main/resources/output/ReporteDeTiemposDePedido.pdf";
	
	//Attributes
	private List<String> reporteEncabezado;
	private List<String> reporteCuerpo;
	private List<String> reportePie;
	
	//Encabezado
	private String fechaFin;
	private String fechaInicio;
	private String titulo;
	private String usuario;
	
	//Cuerpo
	private String estados;
	private ArrayList<String> sectores;
	private List<ArrayList<ArrayList<String>>> resultados;	
	
	//Pie
	private String fechaHoraGeneracion;
	private int nroPagina;
	
	public GeneradorArchivosPDF() {
		
	}
	
	public GeneradorArchivosPDF(String usuario, String fechaHoraInicio) throws FileNotFoundException, DocumentException {
		
		this.usuario = usuario;
		this.fechaHoraGeneracion = fechaHoraInicio;
		
		createPDF(this.usuario, this.fechaHoraGeneracion);
	}
	
	public void agregarFila(String nombreEstado, double tiempoPermProm, double tiempoPermMax, double tiempoPermMin) {};
	
	public void iniciarFila() {};
	
	public void setEncabezado(String titulo, String fechaInicio, String fechaFin) {
		
		//Setting attributes
		this.titulo = titulo;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		
		try {
			addEncabezadoToPDF(this.titulo, this.fechaInicio, this.fechaFin);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};
	
	public void setCuerpo(String estados, ArrayList<String> sectores, List<ArrayList<ArrayList<String>>> resultados)  {
		
		//Setting Cuerpo attributes
		this.estados = estados;
		this.sectores = sectores;
		this.resultados = resultados;
		
		for (int i= 0; i<this.sectores.size(); i++) {
			try {
				addCuerpoToPDF(sectores.get(i), this.resultados.get(i));
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		closeDocument();
		
		System.out.println("File created !!!!!!");
	};
			
	public void setPiePagina(String nombreUsuario, String fechaHoraGeneracion) {
			//TODO: This implementation was not necessary
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
	
	public void setFechaHoraGeneracion(String fechaHoraGeneracion) {};
	
	public void setFechaInicio(String fechaInicio) {};
	
	public void setFila() {};
	
	public int setNroPagina(int numeroPagina) {return 0;};
	
	public void setSectorTabla(String nombreSector) {};
	
	public void setTitulo(String titulo) {};
	
	public void setUsuario(String nombreUsuario) {};
	
	public void createPDF(String user, String fechaHoraGeneracion) throws FileNotFoundException, DocumentException {
    	
    	// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
    	FileOutputStream file = new FileOutputStream(target);
    	
    	// Se asocia el documento al OutputStream y se indica que el espaciado entre
    	// lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
    	PdfWriter writer = PdfWriter.getInstance(this.document, file);
    	
    	//PdfWriter.getInstance(this.document, file).setInitialLeading(20);
    	
    	MyFooter event = new MyFooter(user, fechaHoraGeneracion);
    	
    	// Se abre el documento.
    	document.open();
    	
    	writer.setPageEvent(event);
    	
    	try
    	{
    		Image foto = Image.getInstance("src/main/resources/UTN_Logo.jpg");
    		foto.scaleToFit(100, 100);
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
				15,                            // tama�o
				Font.BOLD,                   // estilo
				BaseColor.BLACK)));
    	
    	this.document.add(new Paragraph("Per�odo " + fechaInicio + " - " + fechaFin,
				FontFactory.getFont("arial",   // fuente
				12,                            // tama�o
				Font.BOLD,                   // estilo
				BaseColor.BLACK)));
    	
    	//this.document.close();
    }
    
    public void addCuerpoToPDF(String sector, ArrayList<ArrayList<String>> resultados) throws DocumentException {
    
    	this.document.add( Chunk.NEWLINE );
    	
    	this.document.add(new Paragraph("- " + sector,
			FontFactory.getFont("arial",   // fuente
			12,                            // tama�o
			Font.BOLD,                   // estilo
			BaseColor.BLACK)));
	
		this.document.add( Chunk.NEWLINE );
		
		PdfPTable tabla = new PdfPTable(4);
		
		tabla.addCell("Estado");
		tabla.addCell("M�XIMO");
		tabla.addCell("M�NIMO");
		tabla.addCell("PROMEDIO");
	
    	resultados.forEach(eResultado -> {
				tabla.addCell(eResultado.get(0));
				tabla.addCell(eResultado.get(1));
				tabla.addCell(eResultado.get(2));
				tabla.addCell(eResultado.get(3));
    	});
    	
    	this.document.add(tabla);
    }
    
    private void addPieDePagina(String user, String fechaHoraGeneracion) {
    	//TODO: implementation was not necessary
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
    Font ffontHeader = new Font(Font.FontFamily.COURIER, 10, Font.ITALIC);
    Font ffontFooter = new Font(Font.FontFamily.COURIER, 10, Font.BOLD);
    
    private String user = "";
    private String fechaHoraGeneracion = "";
    
    public MyFooter(String user, String fechaHoraGeneracion) {
    	this.user = user;
    	this.fechaHoraGeneracion = fechaHoraGeneracion;
    }
        
    public void onEndPage(PdfWriter writer, Document document) {
        PdfContentByte cb = writer.getDirectContent();
        Phrase header = new Phrase("Author " + this.user, ffontHeader);
        Phrase footer = new Phrase("Fecha: " + this.fechaHoraGeneracion + " - Page number: " + document.getPageNumber(), ffontFooter);
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
