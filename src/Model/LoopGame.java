/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.sun.prism.paint.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javafx.animation.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

/**
 *
 * @author Usuario
 */
public class LoopGame extends AnimationTimer{
    private Scene escena;
    private GraphicsContext pen;
    
    private Player p1;
    private Enemigo e1;
    private Bullet bul;
    private Image fondo;
    private Image Enemy;
    private Image bullet1;
    private Image jugador1;
    private Image jugador2;
    private Image jugador3;
    private Image jugador4;
    private int secuencia = 0;
    private int numero;
    private int puntaje = 0;
    private int mov = 0;
    private Pared wall;
    private boolean disparo = false;
    private boolean life = true;
    private Shape colip;
    private Shape colie;
    private Shape colib;
    
    private ArrayList<String> teclado;

    public LoopGame(Scene escena, GraphicsContext pen) {
        this.escena = escena;
        this.pen = pen;
        this.e1 = new Enemigo(900, 400, 80, 100,Enemy, this.colie = new Rectangle(900, 400, 80, 100));
        this.p1 = new Player(0, 400, 80, 130, jugador1, this.colip = new Rectangle(0, 400, 80, 130));
        this.Enemy = new Image ("Images/Enemy.gif");
        this.fondo = new Image("Images/Fondo.png");
        this.jugador1 = new Image ("Images/Right1.png");
        this.jugador2 = new Image ("Images/Right2.png");
        this.jugador3 = new Image ("Images/Left1.png");
        this.jugador4 = new Image ("Images/Left2.png");
        this.bullet1 = new Image("Images/Bullet1.png");
        this.wall = new Pared(900, 900, 200, 200, new Image("Images/Muro.png"));
        teclado = new ArrayList<>();
        
        escena.setOnKeyPressed(
            new EventHandler<KeyEvent>()
            {
                public void handle (KeyEvent e){
                    String tecla = e.getCode().toString();
                    if(!teclado.contains(tecla))
                        teclado.add(tecla);
                }
            });
        
        escena.setOnKeyReleased(
            new EventHandler<KeyEvent>()
            {
                public void handle (KeyEvent e){
                    if(teclado.contains("LEFT") || teclado.contains("A")){
                        String tecla = e.getCode().toString();
                        teclado.remove(tecla);
                        mov = 1;
                    }
                else{
                        if(teclado.contains("RIGHT") || teclado.contains("D")){
                            String tecla = e.getCode().toString();
                            teclado.remove(tecla);
                            mov = 0;
                        }
                else{
                            if(teclado.contains("J")){
                            String tecla = e.getCode().toString();
                            disparo = true;
                            teclado.remove(tecla);
                        }
                            else{
                                String tecla = e.getCode().toString();
                                teclado.remove(tecla);
                        }
                    }
                }
              }
            });
        this.bul = new Bullet(p1.xref + 60, p1.yref + 60, 25, 25, bullet1, this.colib = new Rectangle(p1.xref + 60, p1.yref + 60, 25, 25));
    }

    @Override
    
    public void handle (long now){
        
        pen.clearRect(0, 0, 1200, 700);
     
        if(this.numero % 5 == 0){
            if(this.secuencia == 2){
                this.secuencia = 0;
            }else{
                this.secuencia++;
            }
        }
        pen.drawImage(this.fondo, 0 , 0, 1200, 700);
        
        if(life){
            pen.drawImage(e1.skin, 247*secuencia, 0, 247, 300, e1.getXref(), e1.getYref(), e1.getAncho(), e1.getAlto());
        }
        
        
        
        if(mov == 0){
            pen.drawImage(this.jugador1, p1.getXref(), p1.getYref(), p1.ancho, p1.getAlto());
        }
        else{
            if(mov == 1){
                pen.drawImage(this.jugador3, p1.getXref(), p1.getYref(), p1.getAncho(), p1.getAlto());
            }
            else{
                if(mov == 2){
                    pen.drawImage(this.jugador2, p1.getXref(), p1.getYref(), p1.ancho, p1.getAlto());
                }
                else{
                    if(mov == 3){
                        pen.drawImage(this.jugador4, p1.getXref(), p1.getYref(), p1.ancho, p1.getAlto());
                    }
                }
            }
        }
        
        if(teclado.contains("LEFT") || teclado.contains("A")){
            if(p1.getXref()!= 0){
                mov = 3;
                p1.setXv(-5);
                p1.xref += p1.xv; 
                
            }
            else{
                p1.xref = 0;
            }
        }
        if(teclado.contains("RIGHT") || teclado.contains("D")){
            if(p1.getXref()!= 1200){
                mov = 2;
                p1.setXv(5);
                p1.xref += p1.xv;
            }
            else{
                p1.xref = 1200;
            }
        }
        if(teclado.contains("UP") || teclado.contains("W")){
            if(!p1.saltar){
                p1.saltar = true;
                p1.gravedad = 10.0;
                mov = 0;
                p1.setYv(-5);
                p1.yref += p1.yv;
            }
            else{
                p1.yref = 0;
            }
        }

        if(teclado.contains("DOWN") || teclado.contains("S")){
            if(p1.getYref()!= 700){
                p1.setYv(5);
                p1.yref += p1.yv;
            }
            else{
                p1.yref = 700;
            }
        }
        
        if(disparo){
            pen.drawImage(bul.skin, bul.getXref(), bul.getYref(), bul.getAncho(), bul.getAlto());
            bul.setVbx(5);
            bul.xref += bul.vbx; 
        }
        
        
        
        Shape Interseccion = SVGPath.intersect(colib, colie);
        
        if(Interseccion.getBoundsInLocal().getWidth() != -1){
           life = false;
           disparo = false;
           puntaje += 100;
           bullet1 = null;
        }
 
        pen.fillText("Puntaje: " + puntaje, 1000, 30);
        pen.setFont(new Font(25));
        
        
        
        this.numero++;
    }
}
