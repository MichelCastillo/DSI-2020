/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsi.builder.main;

import com.dsi.builder.front.reportesEnTiempoDePedido;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.stage.Stage;

/**
 *
 * @author lcastillo7
 */
public class ProjectMain extends Application {
        
    @Override
    public void start(Stage primaryStage) {
        
        reportesEnTiempoDePedido R = new reportesEnTiempoDePedido();
        R.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
