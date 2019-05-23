/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crossing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author 628953
 */
public class Car1 extends Character {
private int size;
private ImageIcon ii;
private Image img;
 


public Car1(int size) {


}

 Car1(int x, int y) {
    super(1200,160,"/images/blue.png");
    this.size = 75;
    this.ii = new ImageIcon(getClass().getResource("/images/blue.png"));
    this.img = ii.getImage(); 
     this.x = 1200;
     this.y = 160;
    
     
     vx = (int) (Math.random()* -2 - vx);
     vy = 0;
   
    }

    Car1() {
        this(80); //To change body of generated methods, choose Tools | Templates.
    }


  
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

}
}
