/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crossing;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author 628953
 */
public class Car2 extends Character {
    
private ImageIcon ii;
private Image img;
 


public Car2(int size) {


}

 Car2(int x, int y) {
     super(1450, 225,"/images/van.png");
     this.size = 80;
     this.ii = new ImageIcon(getClass().getResource("/images/van.png"));
     this.img = ii.getImage();
     this.x = 1450;
     this.y = 225;
    
     
     vx = (int) (Math.random()* -2 -vx);
     vy = 0;
   
    }

    Car2() {
        this(80); //To change body of generated methods, choose Tools | Templates.
    }


  
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

}
}
