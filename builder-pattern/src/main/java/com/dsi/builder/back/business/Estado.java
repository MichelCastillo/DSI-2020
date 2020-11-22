package com.dsi.builder.back.business;

import java.util.ArrayList;
import java.util.Arrays;

public class Estado {

    // Atributos
	
	private ArrayList<String> listOfAmbitos = new ArrayList<String>(Arrays.asList("PEDIDO", "RESERVA", "MESA"));
    private String ambito = "Unknown";
    
    private ArrayList<String> listOfStates = new ArrayList<String>(Arrays.asList("CREADO", "CANCELADO", "NOTIFICADO", 
    																			 "ENTREGADO", "PENDIENTE_PREPARACION", 
    																			 "EN_PREPARACION", "LISTO_PARA_SERVIR"));
    
    private ArrayList<String> listOfMesaStates = new ArrayList<String>(Arrays.asList("ABIERTA", "ACTIVA", "OCUPADA", "RESERVADA"));

    private String nombre = "Unknown";

    // Metodos
    public String getNombre() {
        return this.nombre;
    }
    
    public Estado() {}
    
    public void setAmbito(String ambito) {
    	if (listOfAmbitos.stream()
    			.anyMatch(ambitoElement -> ambito.equalsIgnoreCase(ambitoElement))) {
    		this.ambito = ambito;
    	} 	
    }
    
    public void setNombreEstadoPedido(String nombreEstado) {
    	if (listOfStates.stream()
    			.anyMatch(stateElement -> stateElement.equalsIgnoreCase(nombreEstado))) {
    		this.nombre = nombreEstado;
    	} 	
    }
    
    public void setNombreEstadoMesa(String nombreEstado) {
    	if (listOfMesaStates.stream()
    			.anyMatch(stateElement -> stateElement.equalsIgnoreCase(nombreEstado))) {
    		this.nombre = nombreEstado;
    	} 	
    }
    
    public String getAmbito() {
    	return this.ambito;
    }

    public boolean esAmbitoPedido() {
        return ambito.equals("Pedido");
    }

    public boolean esAmbitoReserva() {
        return ambito.equals("Reserva");
    }

    public boolean esConfirmada() {
        return nombre.equals("Confirmada");
    }

    public boolean esAbierta() {
        return nombre.equals("Abierta");
    }

    public boolean esAmbitoDetallePedido() {
        return ambito.equals("Abierta");
    }

    public boolean esAmbitoMesa() {
        return ambito.equals("Mesa");
    }

    public boolean esPendienteCumplimentar() {
        return nombre.equals("PendienteCumplimentar");
    }

    public boolean esPendientePrep() {
        return nombre.equals("PendientePrep");
    }

    public boolean esConPedGenerado() {
        return nombre.equals("ConPedGenerado");
    }

    public boolean esCreada() {
        return nombre.equals("Creada");
    }

    public boolean esEnPreparacion() {
        return nombre.equals("EnPreparacion");
    }

    public boolean esListoParaServir() {
        return nombre.equals("ListoParaServir");
    }

    public boolean esNotificada() {
        return nombre.equals("Notificada");
    }

    public boolean esAbierto() {
        return nombre.equals("Abierto");
    }

    public boolean esActiva() {
        return nombre.equals("Activa");
    }

    public boolean esNotificado() {
        return nombre.equals("Notificado");
    }
    
    public String toString() {
    	return "-----------------------------------------------"
    			+ "\n\t\t\t\t\t\t\t\tAmbito: " + this.ambito
    			+ "\n\t\t\t\t\t\t\t\tNombre: " + this.nombre;
    }
    
}
