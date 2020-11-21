package com.dsi.builder.back;

import java.util.Date;
import java.util.Scanner;

import com.dsi.builder.back.business.GestorReportesDeTiemposEnPedido;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub - Hello
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Validación de período -------");
		
		//Initializing GestorReportesDeTiemposEnPedido - 
		GestorReportesDeTiemposEnPedido gestor = new GestorReportesDeTiemposEnPedido();
		
		System.out.print("Ingrese una fecha de inicio (dd/MM/yyyy): ");
		String stringInitialDate = sc.next();
		
		Date initialDate = Utils.parseDate(stringInitialDate);	
		
		System.out.print("Ingrese una fecha de fin (dd/MM/yyyy): ");
		String stringFinalDate = sc.next();
		
		Date finalDate = Utils.parseDate(stringFinalDate);
		
		boolean resultado = gestor.validatePeriod(initialDate, finalDate);
		
		System.out.print("Resultado -------> " + resultado);
		
		

	}

}
