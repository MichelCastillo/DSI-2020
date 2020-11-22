package com.dsi.builder.back.business;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.util.Date;

public class HistorialEstado {
	
    // Atributos
    private Date fechaHoraFin;
    private Date fechaHoraInicio;
    private Estado estado;

    // Metodos
    public int calcularDuracionEnEstado() {
    	
    	Date fechaActual = new Date();
    	
    	if(!(fechaHoraFin != null)) {
    		return (int) (fechaHoraFin.getMinutes() - fechaHoraInicio.getMinutes());
    	}
    	
    	return (int) (fechaActual.getMinutes() - fechaHoraInicio.getMinutes());
    	
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

    public HistorialEstado(Date fechaHoraFin, Estado estado) {
        this.fechaHoraFin = fechaHoraFin;
        this.estado = estado;
    }

    public HistorialEstado(Date fechaHoraFin, Date fechaHoraInicio, Estado estado) {
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
}
