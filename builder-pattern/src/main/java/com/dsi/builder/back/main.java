package com.dsi.builder.back;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.dsi.builder.back.business.Estado;
import com.dsi.builder.back.business.GestorReportesDeTiemposEnPedido;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Validación de período -------");
		
		//Initializing GestorReportesDeTiemposEnPedido - 
		GestorReportesDeTiemposEnPedido gestor = new GestorReportesDeTiemposEnPedido();
		
		ArrayList<Estado> states = new ArrayList();
		
		//Creating Pedido's states		
		Estado estadoCreado = new Estado();
		estadoCreado.setAmbito("PEDIDO");
		estadoCreado.setNombre("CREADO");
		
		states.add(estadoCreado);
		
		Estado estadoCancelado = new Estado();
		estadoCancelado.setAmbito("PEDIDO");
		estadoCancelado.setNombre("CANCELADO");
		
		states.add(estadoCancelado);
		
		Estado estadoNotificado = new Estado();
		estadoNotificado.setAmbito("PEDIDO");
		estadoNotificado.setNombre("NOTIFICADO");
		
		states.add(estadoNotificado);
		
		Estado estadoEntregado = new Estado();
		estadoEntregado.setAmbito("PEDIDO");
		estadoEntregado.setNombre("ENTREGADO");
		
		states.add(estadoEntregado);
		
		Estado estadoPendiente = new Estado();
		estadoPendiente.setAmbito("PEDIDO");
		estadoPendiente.setNombre("PENDIENTE_PREPARACION");
		
		states.add(estadoPendiente);
		
		Estado estadoEnPreparacion = new Estado();
		estadoEnPreparacion.setAmbito("PEDIDO");
		estadoEnPreparacion.setNombre("EN_PREPARACION");
		
		states.add(estadoEnPreparacion);
		
		Estado estadoListoParaServir = new Estado();
		estadoListoParaServir.setAmbito("PEDIDO");
		estadoListoParaServir.setNombre("LISTO_PARA_SERVIR");
		
		states.add(estadoListoParaServir);
		
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
				
				//Displaying all available states
				states.forEach(stateElement -> System.out.print(stateElement.toString()));
				
			} else {
				
				System.out.print("An error ocurred during period validation -----");	
				
			}
		
		} catch (Exception ex){
			System.out.println("Unexpected error during the process - " + ex);
		}

	}

}
