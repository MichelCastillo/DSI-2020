package com.dsi.builder.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.dsi.builder.back.business.EstadosPedido;
import com.dsi.builder.back.business.Factura;
import com.dsi.builder.back.business.Pedido;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) throws ParseException {
    	
    	//Creating Pedido's states
    	EstadosPedido estado1 = EstadosPedido.CANCELADO;
		EstadosPedido estado2 = EstadosPedido.NOTIFICADO;
		EstadosPedido estado3 = EstadosPedido.ENTREGADO;
		EstadosPedido estado4 = EstadosPedido.PENDIENTE_PREPARACION;
		EstadosPedido estado5 = EstadosPedido.PENDIENTE_PREPARACION;
		EstadosPedido estado6 = EstadosPedido.EN_PREPARACION;
		EstadosPedido estado7 = EstadosPedido.LISTO_PARA_SERVIR;
		
		
		//Setting a calendar
		Calendar calendar = Calendar.getInstance();
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Ingrese fecha de Inicio: ");
    	String fechaInicioStr = sc.nextLine();
    	
    	System.out.print("Ingrese fecha de Fin: ");
    	String fechaFinStr = sc.nextLine();
    	
    	SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    	
    	Date fechaInicio = sdf.parse(fechaInicioStr);
    	Date fechaFin = sdf.parse(fechaFinStr);
    	
    	calendar.setTime(fechaInicio);
    	calendar.add(Calendar.DAY_OF_YEAR, 5);
    	
    	Factura factura1 = new Factura(fechaInicioStr, 1);
    	Factura factura2 = new Factura(fechaInicioStr, 2);
    	Factura factura3 = new Factura(fechaInicioStr, 3);
    	Factura factura4 = new Factura(fechaInicioStr, 4);
    	Factura factura5 = new Factura(fechaInicioStr, 5);
    	Factura factura6 = new Factura(fechaInicioStr, 6);
    	Factura factura7 = new Factura(fechaInicioStr, 7);
    	
    	
    	//Creating Pedidos
    	Pedido pedido1 = new Pedido(5, calendar.getTime(), 1, factura1);
    	Pedido pedido2 = new Pedido(3, calendar.getTime(), 2, factura2);
    	Pedido pedido3 = new Pedido(2, calendar.getTime(), 3, factura3);
    	Pedido pedido4 = new Pedido(6, calendar.getTime(), 4, factura4);
    	Pedido pedido5 = new Pedido(7, calendar.getTime(), 5, factura5);
    	Pedido pedido6 = new Pedido(2, calendar.getTime(), 6, factura6);
    	Pedido pedido7 = new Pedido(3, calendar.getTime(), 7, factura7);
    	
    	if (!fechaFin.before(fechaInicio)) {
    		   		
    		//TODO: Implementation
    		
    		
    	} else {
    		System.out.print("ERROR DE PERIODO");
    	}
    	
    	
    	/*
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        Label l = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        Scene scene = new Scene(new StackPane(l), 640, 480);
        stage.setScene(scene);
        stage.show();
        */
    }

    public static void main(String[] args) {
        launch();
    }

}
