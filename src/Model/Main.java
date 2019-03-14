/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author Diego Rubiano, Samuel Salgado, Julian Santos
 */
public class Main extends Application{
    public boolean inicio = true;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Singleton singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        
        ControladorLoopInicio c = new ControladorLoopInicio();
        c.mostrarVista();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
