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
public class Car3 extends Character {
private int size;
private ImageIcon ii;
private Image img;
 


public Car3(int size) {


}

 Car3(int x, int y) {
    super(1350, 315, "/images.taxi.png");
    this.size = 70;
    this.ii = new ImageIcon(getClass().getResource("/images/taxi.png"));
    this.img = ii.getImage();
    this.x = 1350;
    this.y = 315;
    
     
     vx = (int) (Math.random()* -2 - vx);
     vy = 0;
   
    }

    Car3() {
        this(80); //To change body of generated methods, choose Tools | Templates.
    }


  
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

}
         
}
