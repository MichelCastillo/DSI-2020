package com.dsi.builder.back.business;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario {
    private String nombre;
    private String contraseņa;
    private LocalDate fechaBaja;
    private LocalDate fechaCreacion;

    public void esCliente(){}

    public void obtenerUsuario(){}

    public void conocerPerfil(){}

    public void validarContraseņa(){}

    public String getNombre()
    {
        return this.nombre;
    }

    public Usuario(String nombre, String contraseņa) {
        this.nombre = nombre;
        this.contraseņa = contraseņa;
        this.fechaCreacion = LocalDate.now();
    }
}
