package com.dsi.builder.back.business;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario {
    private String nombre;
    private String contraseña;
    private LocalDate fechaBaja;
    private LocalDate fechaCreacion;

    public void esCliente(){}

    public void obtenerUsuario(){}

    public void conocerPerfil(){}

    public void validarContraseña(){}

    public String getNombre()
    {
        return this.nombre;
    }

    public Usuario(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.fechaCreacion = LocalDate.now();
    }
}
