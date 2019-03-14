/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Usuario
 */
public class Escenario {
    private EscenarioVentana ventana;

    public Escenario() {
        this.ventana = new EscenarioVentana();
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.ventana.mostrar(singleton.getStage());
    }
}
