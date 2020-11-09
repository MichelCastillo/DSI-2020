package com.dsi.builder.back.business;

public class Piso {
    private int numero;
    private Sector sector[];


    public Piso(int numero, Sector[] sector) {
        this.numero = numero;
        this.sector = sector;
    }

    public int getNumero() {
        return numero;
    }

    public void conocerSector(){};


    //Metodo le da la responsabilidad de calcular tiemps al sector
    public Double[][][] calcularTiempos()
    {
        Double matrizTiempo[][][] =new Double[sector.length][3][5];
        for(int i = 0; i < sector.length ; i++)
        {
            //matrizTiempo[i] = sector[i].calcularTiempos();
        }
        return matrizTiempo;
    }

    public String[] mostrarSectores()
    {
        String nombresSectores[]= new String[sector.length];
        for(int i = 0; i < sector.length ; i++)
        {
            //nombresSectores[i]= sector[i].getNombre();
        }
        return nombresSectores;
    }

    //Metodo le pasa la responsabilidad de buscar los pedidos que cumplen los filtros del sector
    public void buscarPedidosCumplenFiltros()
    {
        for(int i = 0; i < sector.length ; i++)
        {
            //sector[i].cumplenFiltros();
        }

    }
}
