package com.dsi.builder.back;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.ParseException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;

public class Utils {
	
	/**
     * Convierte una cadena de caracteres a una fecha (Date)
     * @param date - fecha en formato -> dd/MM/yyyy
     * @return Objet Date
     */
    public static Date parseDate(String date)
    {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = null;
        try {
            dt = format.parse(date);
        } 
        catch (ParseException ex) 
        {
            System.out.println("Unexpected error during the conversion - " + ex);
        }
        return dt;
    }
    
    public static Date parseTime(String time) throws ParseException {
    	DateFormat formatter = new SimpleDateFormat("HH:mm");
    	Date result;
    	try {
			result = formatter.parse(time);			
		} catch (ParseException e) {
			result = formatter.parse("00:00");
		}
    	
    	return result;
    }
    
    public static long calculateMinDiference(Date initialDate, Date finalDate) {
    	return Math.abs(finalDate.getTime() - initialDate.getTime()) / (1000 * 60);
    }
    
    public static double calculateAverage(ArrayList<Long> marks) {
    	  Long sum = (long) 0;
    	  if(!marks.isEmpty()) {
    	    for (Long mark : marks) {
    	        sum += mark;
    	    }
    	    return sum.doubleValue() / marks.size();
    	  }
    	  return sum;
    	}
    
    public static Document createPDF() throws FileNotFoundException, DocumentException {
    	
    	// Se crea el documento
    	Document document = new Document();
    	
    	// Se crea el OutputStream para el fichero donde queremos dejar el pdf.
    	FileOutputStream file = new FileOutputStream("src/main/resources/ReporteDeTiemposDePedido.pdf");
    	
    	// Se asocia el documento al OutputStream y se indica que el espaciado entre
    	// lineas sera de 20. Esta llamada debe hacerse antes de abrir el documento
    	PdfWriter.getInstance(document, file).setInitialLeading(20);
    	
    	// Se abre el documento.
    	document.open();
    	
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
    	
    	return document;
    	
    }
    
    public static Document addEncabezadoToPDF(Document document, String titulo, String fechaInicio, String fechaFin) throws DocumentException {
    	
    	document.add(new Paragraph(titulo + " - UTN FRC - DSI 2020",
				FontFactory.getFont("arial",   // fuente
				15,                            // tamaño
				Font.BOLD,                   // estilo
				BaseColor.BLACK)));
    	
    	document.add(new Paragraph("Período " + fechaInicio + " - " + fechaFin,
				FontFactory.getFont("arial",   // fuente
				12,                            // tamaño
				Font.BOLD,                   // estilo
				BaseColor.BLACK)));
    	
    	return document;
    	
    }
    
    public static Document addCuerpoToPDF(Document document, ArrayList<String> sectores, ArrayList<ArrayList<String>> resultados) throws DocumentException {
    	
    	sectores.forEach(eSector -> {
    		try {
    			document.add( Chunk.NEWLINE );

				document.add(new Paragraph("- " + eSector,
						FontFactory.getFont("arial",   // fuente
						12,                            // tamaño
						Font.BOLD,                   // estilo
						BaseColor.BLACK)));
				
				document.add( Chunk.NEWLINE.setHorizontalScaling(5));
				
				PdfPTable tabla = new PdfPTable(4);
				for (int i = 0; i < 15; i++)
				{
					tabla.addCell("celda " + i);
				}
				document.add(tabla);
				
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	});
    	
    	document.close();
    	
    	return document;
    }
    
    public static Document addCuerpoToPDF2(Document document, String sector, ArrayList<ArrayList<String>> resultados) throws DocumentException {
    
    	document.add( Chunk.NEWLINE );
    	
    	document.add(new Paragraph("- " + sector,
			FontFactory.getFont("arial",   // fuente
			12,                            // tamaño
			Font.BOLD,                   // estilo
			BaseColor.BLACK)));
	
		document.add( Chunk.NEWLINE );
		
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
    	
    	document.add(tabla);
    	
    	document.close();
    	
    	return document;
    }

}
