/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crossing;

import java.awt.Color;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author 628953
 */
public class Character {
   //Fields
    protected int size;
    protected int x;
    protected int y;
    protected int vx;
    protected int vy;
    private ImageIcon ii;
    private Image img;
    protected Color color;
    protected Rectangle bound;
    
    
    

    //Constructor
    public Character() {
        size = 75;
        color = Color.RED;
        x = 400;
        y = 400;
        vx = 4;
        vy = 4;
    }
    
    
    public Character(int x, int y, String imgSrc) {
        color = Color.RED;
        this.x = x;
        this.y = y;
        vx = 4;
        vy = 4;
        bound = new Rectangle(this.x, this.y, 60, 50);
    }
     public Rectangle getBound() {
        return bound;
    }
     
    public void draw(Graphics g) {
        g.drawImage(img, x, y, size, size, null);
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(bound);
    }
    
    public void update() {
        x += vx;
        y += vy;
        bound = new Rectangle(this.x, this.y, 60, 50);
         
    }
    
    public void moveTo() {
        
    }
    
    public void shoot() {
        
    }
  
    public void die() {
        x = -500;
        y = -500;
    }
   
     public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getVx() {
        return vx;
    }

    public void setVx(int vx) {
        this.vx = vx;
    }

    public int getVy() {
        return vy;
    }

    public void setVy(int vy) {
        this.vy = vy;
    }
    




}