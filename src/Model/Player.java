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
public class Player extends Entidad{
    
    public Player(int xref, int yref, int ancho, int alto) {
        super(xref, yref, ancho, alto);
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
}
