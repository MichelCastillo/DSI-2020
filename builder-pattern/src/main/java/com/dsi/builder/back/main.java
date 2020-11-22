package com.dsi.builder.back;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.dsi.builder.back.business.Estado;
import com.dsi.builder.back.business.Factura;
import com.dsi.builder.back.business.GestorReportesDeTiemposEnPedido;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Validación de período -------");
		
		//Initializing GestorReportesDeTiemposEnPedido - 
		GestorReportesDeTiemposEnPedido gestor = new GestorReportesDeTiemposEnPedido();
		
		ArrayList<Estado> states = new ArrayList();
		
		//Creating Pedido's states		
		Estado estadoCreado = new Estado();
		estadoCreado.setAmbito("PEDIDO");
		estadoCreado.setNombreEstadoPedido("CREADO");
		
		states.add(estadoCreado);
		
		Estado estadoCancelado = new Estado();
		estadoCancelado.setAmbito("PEDIDO");
		estadoCancelado.setNombreEstadoPedido("CANCELADO");
		
		states.add(estadoCancelado);
		
		Estado estadoNotificado = new Estado();
		estadoNotificado.setAmbito("PEDIDO");
		estadoNotificado.setNombreEstadoPedido("NOTIFICADO");
		
		states.add(estadoNotificado);
		
		Estado estadoEntregado = new Estado();
		estadoEntregado.setAmbito("PEDIDO");
		estadoEntregado.setNombreEstadoPedido("ENTREGADO");
		
		states.add(estadoEntregado);
		
		Estado estadoPendiente = new Estado();
		estadoPendiente.setAmbito("PEDIDO");
		estadoPendiente.setNombreEstadoPedido("PENDIENTE_PREPARACION");
		
		states.add(estadoPendiente);
		
		Estado estadoEnPreparacion = new Estado();
		estadoEnPreparacion.setAmbito("PEDIDO");
		estadoEnPreparacion.setNombreEstadoPedido("EN_PREPARACION");
		
		states.add(estadoEnPreparacion);
		
		Estado estadoListoParaServir = new Estado();
		estadoListoParaServir.setAmbito("PEDIDO");
		estadoListoParaServir.setNombreEstadoPedido("LISTO_PARA_SERVIR");
		
		states.add(estadoListoParaServir);
		
		//"ABIERTA", "ACTIVA", "OCUPADA", "RESERVADA"
		//Adding Mesa's states
		ArrayList<Estado> mesaStates = new ArrayList();
				
		Estado estadoAbierta = new Estado();
		estadoAbierta.setAmbito("MESA");
		estadoAbierta.setNombreEstadoMesa("ABIERTA");
				
		mesaStates.add(estadoAbierta);
				
		Estado estadoActiva = new Estado();
		estadoActiva.setAmbito("MESA");
		estadoActiva.setNombreEstadoMesa("ACTIVA");
				
		mesaStates.add(estadoActiva);
				
		Estado estadoOcupada = new Estado();
		estadoOcupada.setAmbito("MESA");
		estadoOcupada.setNombreEstadoMesa("OCUPADA");
				
		mesaStates.add(estadoOcupada);
				
		Estado estadoReservada = new Estado();
		estadoReservada.setAmbito("MESA");
		estadoReservada.setNombreEstadoMesa("RESERVADA");
				
		mesaStates.add(estadoReservada);
		
		//Creating Facturas
		ArrayList<Factura> facturas = new ArrayList();
		
		try {
			
			Calendar myDate = new GregorianCalendar();
			String fechaString = "10/10/2020 20:00:00";
			Date fechaDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH).parse(fechaString);
			myDate.setTime(fechaDate);
			
			Factura factura1 = new Factura(myDate.getTime(), 1);
			facturas.add(factura1);
			
			myDate.add(Calendar.MINUTE, 5);
			Factura factura2 = new Factura(myDate.getTime(), 2);
			facturas.add(factura2);
			
			myDate.add(Calendar.MINUTE, 5);
			Factura factura3 = new Factura(myDate.getTime(), 3);
			facturas.add(factura3);

			myDate.add(Calendar.MINUTE, 5);
			Factura factura4 = new Factura(myDate.getTime(), 4);
			facturas.add(factura4);
			
			myDate.add(Calendar.MINUTE, 5);
			Factura factura5 = new Factura(myDate.getTime(), 5);
			facturas.add(factura5);
			
			myDate.add(Calendar.MINUTE, 5);
			Factura factura6 = new Factura(myDate.getTime(), 6);
			facturas.add(factura6);
			
			myDate.add(Calendar.MINUTE, 5);
			Factura factura7 = new Factura(myDate.getTime(), 7);
			facturas.add(factura7);
			
			myDate.add(Calendar.MINUTE, 5);
			Factura factura8 = new Factura(myDate.getTime(), 8);
			facturas.add(factura8);
			
			myDate.add(Calendar.MINUTE, 5);
			Factura factura9 = new Factura(myDate.getTime(), 9);
			facturas.add(factura9);
			
			myDate.add(Calendar.MINUTE, 5);
			Factura factura10 = new Factura(myDate.getTime(), 10);
			facturas.add(factura10);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
		try {
		
			System.out.print("Ingrese una fecha de inicio (dd/MM/yyyy): ");
			String stringInitialDate = sc.next();
			
			Date initialDate = Utils.parseDate(stringInitialDate);	
			
			System.out.print("Ingrese una fecha de fin (dd/MM/yyyy): ");
			String stringFinalDate = sc.next();
			
			Date finalDate = Utils.parseDate(stringFinalDate);
			
			if (gestor.validatePeriod(initialDate, finalDate)) {
				
				gestor.setPeriodInitialDate(initialDate);
				gestor.setPeriodInitialDate(finalDate);
				
				//Displaying all available states for Pedidos
				states.forEach(stateElement -> System.out.print(stateElement.toString()));
				
				//Displaying all available states for Mesas
				mesaStates.forEach(stateElement -> System.out.print(stateElement.toString()));
				
				//Displaying all facturas
				facturas.forEach(factura -> System.out.print(factura.toString()));
				
			} else {
				
				System.out.print("An error ocurred during period validation -----");	
				
			}
		
		} catch (Exception ex){
			System.out.println("Unexpected error during the process - " + ex);
		}

	}

}
