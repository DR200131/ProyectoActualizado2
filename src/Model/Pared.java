/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.scene.image.Image;

public class Pared {
    public int x;
    public int y;
    public int ancho;
    public int alto;
    public Image skin;

    public Pared(int x, int y, int ancho, int alto, Image skin) {
        this.x = x;
        this.y = y;
        this.ancho = ancho;
        this.alto = alto;
        this.skin = skin;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }
}
