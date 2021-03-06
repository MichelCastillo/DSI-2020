package com.dsi.builder.back.business;


import java.util.Date;

import com.dsi.builder.back.Utils;

public class HistorialEstado {
	
    // Atributos
	private Date fechaActual;
    private Date fechaHoraFin;
    private Date fechaHoraInicio;
    private Estado estado;

    // Metodos
    public long calcularDuracionEnEstado() {
    	this.fechaActual = new Date();
    	
    	if(!(fechaHoraFin == null)) {
    		return Utils.calculateMinDiference(this.fechaHoraInicio, this.fechaHoraFin);
    	}
    	
    	return Utils.calculateMinDiference(this.fechaHoraInicio, fechaActual);
    	
    }

    public Estado conocerEstado() {
        return estado;
    }

    public boolean esEnPreparacion() {
        return estado.esEnPreparacion();
    }

    public boolean esEstadoSelecc() {
        // revisar
        return false;
    }

    public boolean esUltimoHistorial() {
        return fechaHoraFin == null;
    }

    public Date getFechaHoraFin() {
        return fechaHoraFin;
    }

    public Date getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public HistorialEstado(Date fechaHoraInicio, Estado estado) {
        this.fechaHoraInicio = fechaHoraInicio;
        this.estado = estado;
    }

    public HistorialEstado(Date fechaHoraInicio, Date fechaHoraFin, Estado estado) {
        this.fechaHoraFin = fechaHoraFin;
        this.fechaHoraInicio = fechaHoraInicio;
        this.estado = estado;
    }

    public HistorialEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFechaHoraFin(Date fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public void setListoParaServir() {
    }
    
    @Override
    public String toString() {
    	this.fechaActual = new Date();
    	
    	return "\n\t\t\t\t\t\t\t\tHistorial de Estado: --------------------------------------------------"
    			+ "\n\t\t\t\t\t\t\t\t\tFecha y Hora de Inicio: " + this.fechaHoraInicio
    			+ "\n\t\t\t\t\t\t\t\t\tFecha y Hora de Fin: " + ((this.fechaHoraFin != null) ? fechaHoraFin : fechaActual + " - Still here")
    			+ "\n\t\t\t\t\t\t\t\t\tEstado Actual: " + estado.toString(); 
    }
}
