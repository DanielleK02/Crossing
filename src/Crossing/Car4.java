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
public class Car4 extends Character {
      private int size;
private ImageIcon ii;
private Image img;
 


public Car4(int size) {


}

 Car4(int x, int y) {
    super(-100, 394, "/images/cop.png");
    this.size = 90;
    this.ii = new ImageIcon(getClass().getResource("/images/cop.png"));
    this.img = ii.getImage();  
    this.x = -100;
    this.y = 394;
    
     
     vx = (int) (Math.random()* 2 + vx);
     vy = 0;
   
    }

    Car4() {
        this(80); //To change body of generated methods, choose Tools | Templates.
    }


  
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

}
}
