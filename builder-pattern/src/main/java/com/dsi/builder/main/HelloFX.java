package com.dsi.builder.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage stage) throws ParseException {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Ingrese fecha de Inicio: ");
    	String fechaInicioStr = sc.nextLine();
    	
    	System.out.print("Ingrese fecha de Fin: ");
    	String fechaFinStr = sc.nextLine();
    	
    	SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
    	
    	Date fechaInicio = sdf.parse(fechaInicioStr);
    	Date fechaFin = sdf.parse(fechaFinStr);
    	
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
