package com.dsi.builder.back.business;

import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int numero;
    private ArrayList<Sector> sectores = new ArrayList<Sector>();


    public Piso(int numero, ArrayList<Sector> sectores) {
        this.numero = numero;
        sectores.forEach(pSectores -> this.sectores.add(pSectores));
    }
    
    @Override
    public String toString() {
    	return "Piso N°: " + this.numero
    		+ "\n\tREF: \n\t\t" + sectores.toString();
    }
    
    public String visualizarPiso() {
    	return "Piso: ---------------------------------------------------------------------------------------------------------"
    			+ "\n\tNúmero: " + this.numero + ","
    			+ "\n\tCantidad de Sectores: " + this.sectores.size()
    			+ "\n\tSectores: " + this.sectores.toString();
    }
    
    public void addSectores(ArrayList<Sector> sectores) {
    	sectores.forEach(pSectores -> this.sectores.add(pSectores));
    }
    
    public void addSector(Sector sector) {
    	this.sectores.add(sector);
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
    
    public ArrayList<Sector> getSectores() {
    	return this.sectores;
    }
}
