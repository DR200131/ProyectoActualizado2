/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Usuario
 */
public class ControladorLoopInicio {
    private LoopInicio ini;

    public ControladorLoopInicio() {
        this.ini = new LoopInicio();
        this.ini.getBiniciar().setOnMousePressed(new EventoMouse1());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.ini.mostrar(singleton.getStage());
    }
    
    class EventoMouse1 implements EventHandler<MouseEvent>{
        @Override
        public void handle(MouseEvent t) {
            Escenario c = new Escenario();
            c.mostrarVista();
        }
        
    }
}
