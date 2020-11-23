package com.dsi.builder.back.business;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario {
    private String nombre;
    private String contrasena;
    private LocalDate fechaBaja;
    private LocalDate fechaCreacion;

    public void esCliente(){}

    public void obtenerUsuario(){}

    public void conocerPerfil(){}

    public void validarContrasena(){}

    public String getNombre()
    {
        return this.nombre;
    }

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.fechaCreacion = LocalDate.now();
    }
}
