package com.dsi.builder.back.business;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Usuario {
    private String nombre;
    private String contrase�a;
    private LocalDate fechaBaja;
    private LocalDate fechaCreacion;

    public void esCliente(){}

    public void obtenerUsuario(){}

    public void conocerPerfil(){}

    public void validarContrase�a(){}

    public String getNombre()
    {
        return this.nombre;
    }

    public Usuario(String nombre, String contrase�a) {
        this.nombre = nombre;
        this.contrase�a = contrase�a;
        this.fechaCreacion = LocalDate.now();
    }
}
