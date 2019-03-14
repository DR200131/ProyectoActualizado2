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
    private boolean inicio = true;
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane layout1 = new Pane();
        Canvas canvas1 = new Canvas(1200, 700);
        layout1.getChildren().add(canvas1);
        Scene escena1 = new Scene(layout1, 1200, 700, Color.BLACK); 
        
        if(inicio){
            
        }
        else{
            GraphicsContext pen1 = canvas1.getGraphicsContext2D();
            LoopGame game1 = new LoopGame(escena1, pen1);
            game1.start();
            primaryStage.setTitle("Sancocho's Revolution");
            primaryStage.setMaxWidth(1200);
            primaryStage.setMaxHeight(700);
            primaryStage.show();
        }
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
