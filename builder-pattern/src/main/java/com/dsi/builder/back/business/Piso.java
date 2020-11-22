package com.dsi.builder.back.business;

import java.util.List;

public class Piso {
    private int numero;
    private List<Sector> sectores;


    public Piso(int numero, List<Sector> sectores) {
        this.numero = numero;
        this.sectores = sectores;
    }

    public int getNumero() {
        return numero;
    }

    public void conocerSector(){};


    //Metodo le da la responsabilidad de calcular tiempos al sector
    public Double[][][] calcularTiempos()
    {
        //Double matrizTiempo[][][] =new Double[sector.length][3][5];
        //for(int i = 0; i < sector.length ; i++)
        //{
        //    //matrizTiempo[i] = sector[i].calcularTiempos();
        //}
        return null;//matrizTiempo;
    }

    public String[] mostrarSectores()
    {
        //String nombresSectores[]= new String[sector.length];
        //for(int i = 0; i < sector.length ; i++)
        ///{
        //    //nombresSectores[i]= sector[i].getNombre();
        //}
        return null;//nombresSectores;
    }

    //Metodo le pasa la responsabilidad de buscar los pedidos que cumplen los filtros del sector
    public void buscarPedidosCumplenFiltros()
    {
        //for(int i = 0; i < sector.length ; i++)
        //{
        //    //sector[i].cumplenFiltros();
        //}

    }
}
