package com.dsi.builder.back.business;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
	
	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy'T'HH:mm:ssZ");
	private Date result;
	private Date fecha;
	private Date hora;
	private int numero;
	
	public Factura(String fecha, int numeroFactura) throws ParseException {
		
		this.result = df.parse(fecha); // "10/10/2020T20:00:00+0000"

		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
		this.fecha = sdf.parse(fecha);
		
		sdf =  new SimpleDateFormat("HH:mm");
		this.hora = sdf.parse(fecha);
		
	}
	

}
