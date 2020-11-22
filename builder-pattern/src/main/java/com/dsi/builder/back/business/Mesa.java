package com.dsi.builder.back.business;

import java.util.List;

public class Mesa {
	
	private int capacidadComensales;
	private double espacioQueOcupa;
	private int filaEnPlano;
	private int numero;
	private int ordenEnPlano;
	private Estado estado;
	private List<Pedido> pedidos;
	
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
	
	public String toString() {
		return "";
	}
	
	public void mostrarNumero() {}
	
	public void setEstado (Estado estado) {
		this.estado = estado;
	}
	
	public void tieneCapacidad() {}
	
	public void tienePedidoAbierto() {}

}
