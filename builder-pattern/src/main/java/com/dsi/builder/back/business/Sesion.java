package com.dsi.builder.back.business;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sesion {
    private LocalDate fechaFin;
    private LocalDate fechaInicio;
    private LocalTime horaFin;
    private LocalTime horaInicio;
    private Usuario usuario;

    public Sesion(Usuario usuario) {
        this.usuario = usuario;
        this.fechaInicio = LocalDate.now();
        this.horaInicio = LocalTime.now();
    }

    public Usuario conocerUsuario()
    {
        return usuario;
    }

    public Usuario obtenerUsuarioLog()
    {
        return usuario;
    }

    public String mostrarUsuarioLog()
    {
        return usuario.getNombre();
    }

    public boolean estavigente()
    {
        return fechaFin != null;
    }

    public void verifPedExist(){}
    public void validarUsuarioLog(){}
    public void mostrarMesasAUsLog(){}
}
