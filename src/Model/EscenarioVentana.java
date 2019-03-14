/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class EscenarioVentana {
    private Scene escena;
    private LoopGame game;

    public EscenarioVentana() {
        StackPane stack = new StackPane();
        Pane layout  = new Pane();  
        Canvas canvas = new Canvas(1200, 700);
        layout.getChildren().add(canvas);
        this.escena = new Scene(layout ,1200,700, Color.BLACK);
        
        GraphicsContext pen = canvas.getGraphicsContext2D();
        this.game = new LoopGame(escena, pen);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Sancocho's Revolution");
        stage.setScene(escena);
        stage.setMaxHeight(700);
        stage.setMaxWidth(1200);
        stage.show();        
        game.start();
    }
      
}
