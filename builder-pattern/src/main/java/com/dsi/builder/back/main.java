package com.dsi.builder.back;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

import com.dsi.builder.back.business.Estado;
import com.dsi.builder.back.business.Factura;
import com.dsi.builder.back.business.GestorReportesDeTiemposEnPedido;
import com.dsi.builder.back.business.HistorialEstado;
import com.dsi.builder.back.business.Mesa;
import com.dsi.builder.back.business.Pedido;

public class main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Validación de período -------");
		
		//Initializing GestorReportesDeTiemposEnPedido - 
		GestorReportesDeTiemposEnPedido gestor = new GestorReportesDeTiemposEnPedido();
		
		ArrayList<Estado> states = new ArrayList<Estado>();
		
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
		ArrayList<Estado> mesaStates = new ArrayList<Estado>();
				
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
		ArrayList<Factura> facturas = new ArrayList<Factura>();
		
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
			System.out.println("An error ocurred when Facturas were been created - " + e);
		}
		
		//Creating Historial Estados
		
		Calendar myDate = new GregorianCalendar();
		
		
		
		String fechaInicio = "19/11/2020 20:00:00";
		Date fechaDateInicio;
		
		Pedido pedido1 = null;
		Pedido pedido2 = null;;
		Pedido pedido3 = null;;
		Pedido pedido4 = null;;
		Pedido pedido5 = null;;
		
		try {
			
			//Pedido 1 - CREADO - PENDIENTE_PREPARACION - EN_PREPARACION - LISTO_PARA_SERVIR
			
			fechaDateInicio = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH).parse(fechaInicio);
			myDate.setTime(fechaDateInicio);
			
			pedido1 = new Pedido(5, myDate.getTime(), 1, facturas.get(0));			
			
			myDate.add(Calendar.MINUTE, 40);
			HistorialEstado historial1Pedido1 = new HistorialEstado(fechaDateInicio, myDate.getTime(), estadoCreado);
			
			pedido1.addHistorial(historial1Pedido1);
			
			fechaDateInicio = myDate.getTime();
			myDate.setTime(fechaDateInicio);
			myDate.add(Calendar.MINUTE, 25);
			HistorialEstado historial2Pedido1 = new HistorialEstado(fechaDateInicio, myDate.getTime(), estadoPendiente);
			
			pedido1.addHistorial(historial2Pedido1);
			
			fechaDateInicio = myDate.getTime();
			myDate.setTime(fechaDateInicio);
			myDate.add(Calendar.MINUTE, 31);
			HistorialEstado historial3Pedido1 = new HistorialEstado(fechaDateInicio, myDate.getTime(), estadoEnPreparacion);
			
			pedido1.addHistorial(historial3Pedido1);
			
			fechaDateInicio = myDate.getTime();
			myDate.setTime(fechaDateInicio);
			HistorialEstado historial4Pedido1 = new HistorialEstado(fechaDateInicio, estadoListoParaServir);
			
			pedido1.addHistorial(historial4Pedido1);
			
			//Pedido 2 - CREADO - PENDIENTE_PREPARACION
			fechaInicio = "20/11/2020 21:00:00";
			fechaDateInicio = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH).parse(fechaInicio);
			myDate.setTime(fechaDateInicio);
			
			pedido2 = new Pedido(3, myDate.getTime(), 2, facturas.get(1));
			
			myDate.add(Calendar.MINUTE, 40);
			HistorialEstado historial1Pedido2 = new HistorialEstado(fechaDateInicio, myDate.getTime(), estadoCreado);
			
			pedido2.addHistorial(historial1Pedido2);
			
			fechaDateInicio = myDate.getTime();
			myDate.setTime(fechaDateInicio);
			HistorialEstado historial2Pedido2 = new HistorialEstado(fechaDateInicio, estadoPendiente);
			
			pedido2.addHistorial(historial2Pedido2);
			
			//Pedido 3 - CREADO - PENDIENTE_PREPARACION - EN_PREPARACION
			fechaInicio = "19/11/2020 21:00:00";
			fechaDateInicio = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH).parse(fechaInicio);
			myDate.setTime(fechaDateInicio);

			pedido3 = new Pedido(2, myDate.getTime(), 3, facturas.get(2));
			
			myDate.add(Calendar.MINUTE, 27);
			HistorialEstado historial1Pedido3 = new HistorialEstado(fechaDateInicio, myDate.getTime(), estadoCreado);
			
			pedido3.addHistorial(historial1Pedido3);
			
			fechaDateInicio = myDate.getTime();
			myDate.setTime(fechaDateInicio);
			myDate.add(Calendar.MINUTE, 13);
			HistorialEstado historial2Pedido3 = new HistorialEstado(fechaDateInicio, myDate.getTime(), estadoPendiente);
			
			pedido3.addHistorial(historial2Pedido3);
			
			fechaDateInicio = myDate.getTime();
			myDate.setTime(fechaDateInicio);
			HistorialEstado historial3Pedido3 = new HistorialEstado(fechaDateInicio, estadoEnPreparacion);
			
			pedido3.addHistorial(historial3Pedido3);
			
			//Pedido 4 - CREADO
			fechaInicio = "23/11/2020 21:30:00";
			fechaDateInicio = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH).parse(fechaInicio);
			myDate.setTime(fechaDateInicio);

			pedido4 = new Pedido(5, myDate.getTime(), 4, facturas.get(3));
			
			HistorialEstado historial1Pedido4 = new HistorialEstado(fechaDateInicio, estadoCreado);
			
			pedido4.addHistorial(historial1Pedido4);
			
			//Pedido 5 - CREADO - CANCELADO
			fechaInicio = "24/11/2020 21:00:00";
			fechaDateInicio = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH).parse(fechaInicio);
			myDate.setTime(fechaDateInicio);			
			
			pedido5 = new Pedido(3, myDate.getTime(), 5, facturas.get(4));
			
			myDate.add(Calendar.MINUTE, 27);
			HistorialEstado historial1Pedido5 = new HistorialEstado(fechaDateInicio, myDate.getTime(), estadoCreado);
			
			pedido5.addHistorial(historial1Pedido5);
			
			fechaDateInicio = myDate.getTime();
			myDate.setTime(fechaDateInicio);
			myDate.add(Calendar.MINUTE, 10);
			HistorialEstado historial2Pedido5 = new HistorialEstado(fechaDateInicio, myDate.getTime(), estadoCancelado);
			
			pedido5.addHistorial(historial2Pedido5);		
			
		} catch (ParseException e) {
			System.out.println("An error ocurred creating Pedidos - Error: " + e);
		}
		
		//Creating Mesas
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
				
		Mesa mesa1 = new Mesa(10, 30.0, 1, 1, 1, estadoOcupada, pedido1);
		mesas.add(mesa1);
		Mesa mesa2 = new Mesa(7, 22.0, 1, 2, 1, estadoOcupada, pedido2);
		mesas.add(mesa2);
		Mesa mesa3 = new Mesa(8, 24.0, 1, 3, 1, estadoActiva);
		mesas.add(mesa3);
		Mesa mesa4 = new Mesa(8, 24.0, 2, 4, 1, estadoOcupada, pedido3);
		mesas.add(mesa4);
		Mesa mesa5 = new Mesa(5, 15.0, 2, 5, 1, estadoActiva);
		mesas.add(mesa5);
		Mesa mesa6 = new Mesa(6, 18.0, 2, 6, 1, estadoReservada);
		mesas.add(mesa6);
		Mesa mesa7 = new Mesa(9, 27.0, 3, 7, 1, estadoOcupada, pedido4);
		mesas.add(mesa7);
		Mesa mesa8 = new Mesa(6, 18.0, 3, 8, 1, estadoActiva);
		mesas.add(mesa8);
		Mesa mesa9 = new Mesa(7, 21.0, 3, 9, 1, estadoOcupada, pedido5);
		mesas.add(mesa9);
		Mesa mesa10 = new Mesa(8, 24.0, 3, 10, 1, estadoReservada);
		mesas.add(mesa10);
		
		mesas.forEach(mesa -> System.out.println(mesa.toString()));
		
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
