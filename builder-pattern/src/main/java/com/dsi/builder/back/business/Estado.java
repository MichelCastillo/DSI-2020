package com.dsi.builder.back.business;

public class Estado {

    // Atributos
    private String ambito;
    private String nombre;
    private EstadosPedido estadoPedido;

    // Metodos
    public String getNombre() {
        return this.nombre;
    }
    
    public void setEstadoPedido(EstadosPedido estado) {
    	this.estadoPedido = estado;
    };
    
    public EstadosPedido getEstadoPedido() {
    	return this.estadoPedido;
    }

    public Estado(String ambito, String nombre) {
        this.ambito = ambito;
        this.nombre = nombre;
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
    
    //
}
