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

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane layout = new Pane();
        Canvas canvas = new Canvas(1200, 700);
        layout.getChildren().add(canvas);
        Scene escena = new Scene(layout, 1200, 700, Color.WHITESMOKE);
        
        GraphicsContext pen = canvas.getGraphicsContext2D();
        LoopGame game = new LoopGame(escena, pen);
        game.start();
        
        primaryStage.setScene(escena);
        primaryStage.setTitle("Sancocho's Revolution");
        primaryStage.setMaxWidth(1200);
        primaryStage.setMaxHeight(700);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    }
}
