package com.dsi.builder.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.dsi.builder.back.business.EstadosPedido;
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
		
		//Creating Pedidos
		Pedido pedido1;
		Pedido pedido2;
		Pedido pedido3;
		Pedido pedido4;
		Pedido pedido5;
		Pedido pedido6;
		Pedido pedido7;
		
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
    	
    	
    	
    	
    	if (!fechaFin.before(fechaInicio)) {
    		
    		
    		
    		
    		
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
