package com.dsi.builder.back.business;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
	
	private int capacidadComensales;
	private double espacioQueOcupa;
	private int filaEnPlano;
	private int numero;
	private int ordenEnPlano;
	private Estado estado;
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	public Mesa(int capacidadComensales, double espacioQueOcupa, int filaEnPlano, int numero, int ordenEnPlano, Estado estado, Pedido pedido) {
		
		this.capacidadComensales = capacidadComensales;
		this.espacioQueOcupa = espacioQueOcupa;
		this.filaEnPlano = filaEnPlano;
		this.numero = numero;
		this.ordenEnPlano = ordenEnPlano;
		this.estado = estado;
		this.pedidos.add(pedido);		
	}
	
	public Mesa(int capacidadComensales, double espacioQueOcupa, int filaEnPlano, int numero, int ordenEnPlano, Estado estado) {
		
		this.capacidadComensales = capacidadComensales;
		this.espacioQueOcupa = espacioQueOcupa;
		this.filaEnPlano = filaEnPlano;
		this.numero = numero;
		this.ordenEnPlano = ordenEnPlano;
		this.estado = estado;
	}
	
	@Override
	public String toString() {
    	return "\n\t\t\t\t\t\tMesa N°: " + this.numero + "-----------------------------------------------------"
    			+ "\n\t\t\t\t\t\t\tCapacidad: " + this.capacidadComensales
    			+ "\n\t\t\t\t\t\t\tFila: " + this.filaEnPlano
    			+ "\n\t\t\t\t\t\t\tOrden: " + this.ordenEnPlano
    			+ "\n\t\t\t\t\t\t\tEstado: " + this.estado
    			+ "\n\t\t\t\t\t\t\tPedido " + this.pedidos.toString()
    			;
    }
	
	public void addPedido(Pedido pedido) {
		this.pedidos.add(pedido);
	}
	
	public void buscarPedCumpFiltros() {}
	
	public Estado conocerEstado() {
		return this.estado;
	}
	
	public List<Pedido> conocerPedido() {
		return this.pedidos;
	}
	
	public void contarPedidosPorEstado() {}
	
	public void crearPedido() {}
	
	public void esMesaSeleccionada() {}
	
	public void estaAbierta() {}
	
	public void estaActiva() {}
	
	public void estaDispParaRes() {}
	
	public void estaEnUnionVigente() {}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void mostrarNumero() {}
	
	public void setEstado (Estado estado) {
		this.estado = estado;
	}
	
	public void tieneCapacidad() {}
	
	public void tienePedidoAbierto() {}

}
