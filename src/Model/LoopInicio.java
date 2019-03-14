/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class LoopInicio{

    private Scene escena;
    private StackPane layout;
    private VBox vbox;
    private Label title;
    private Button biniciar;
    private Button bsalir;

    public LoopInicio() {
        this.layout = new StackPane();
        this.vbox = new VBox();
        this.title = new Label("", new ImageView("Images/Title.png"));
        this.biniciar = new Button("", new ImageView("Images/Inicio1.png"));
        this.bsalir = new Button("", new ImageView("Images/Salir1.png"));
        this.vbox.getChildren().add(this.title);
        this.vbox.getChildren().add(this.biniciar);
        this.vbox.getChildren().add(this.bsalir);
        this.vbox.setAlignment(Pos.CENTER);
        this.vbox.setSpacing(50);
        this.layout.getChildren().add(this.vbox);
        this.escena = new Scene(layout, 1200, 700);
        this.bsalir.setOnMouseClicked(new EventoMouse2());
    }

    public Button getBiniciar() {
        return biniciar;
    }

    public Button getBsalir() {
        return bsalir;
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Sancocho's Revolution");
        stage.setScene(this.escena);
        stage.setMaxHeight(700);
        stage.setMaxWidth(1200);
        stage.show();
    }
    
    
    
    class EventoMouse2 implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent t) {
            System.exit(0);
        }
        
    }
    
    
}
