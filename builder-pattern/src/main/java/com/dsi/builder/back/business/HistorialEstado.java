package com.dsi.builder.back.business;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class HistorialEstado {
	
    // Atributos
    private LocalDateTime fechaHoraFin;
    private LocalDateTime fechaHoraInicio;
    private Estado estado;

    // Metodos
    public Long calcularDuracionEnEstado() {
        ZoneOffset zona = ZoneOffset.of("Z");
        return fechaHoraFin.toEpochSecond(zona) - fechaHoraFin.toEpochSecond(zona);
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

    public LocalDateTime getFechaHoraFin() {
        return fechaHoraFin;
    }

    public LocalDateTime getFechaHoraInicio() {
        return fechaHoraInicio;
    }

    public HistorialEstado(LocalDateTime fechaHoraFin, Estado estado) {
        this.fechaHoraFin = fechaHoraFin;
        this.estado = estado;
    }

    public HistorialEstado(LocalDateTime fechaHoraFin, LocalDateTime fechaHoraInicio, Estado estado) {
        this.fechaHoraFin = fechaHoraFin;
        this.fechaHoraInicio = fechaHoraInicio;
        this.estado = estado;
    }

    public HistorialEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
        this.fechaHoraFin = fechaHoraFin;
    }

    public void setListoParaServir() {
    }
}
