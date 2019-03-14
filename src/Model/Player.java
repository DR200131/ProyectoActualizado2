/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.image.Image;
import javafx.scene.shape.Shape;


/**
 *
 * @author Usuario
 */
public class Player extends Entidad{
    
    public Player(int xref, int yref, int ancho, int alto, Image skin, Shape coli) {
        super(xref, yref, ancho, alto, skin, coli);
    }

    public int getXref() {
        return xref;
    }

    public int getYref() {
        return yref;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
    
    public void salto(){
        if(saltar){
            gravedad -= 0.1;
            this.setYv((int)-gravedad);
            if(gravedad <= 0.0){
                saltar = false;
                caer = true;
            }
        }
        if(caer){
            gravedad += 0.1;
            this.setYv((int)-gravedad);
        }
    }
}
