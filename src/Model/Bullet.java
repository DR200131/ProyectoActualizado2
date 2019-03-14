/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.image.*;

/**
 *
 * @author Usuario
 */
public class Bullet extends Entidad{
    
    public int vbx;
    
    public Bullet(int xref, int yref, int ancho, int alto) {
        super(xref, yref, ancho, alto);
    }
    
    public void dispararDerecha(){
        this.xref++;
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

    public void setVbx(int vbx) {
        this.vbx = vbx;
    } 
}