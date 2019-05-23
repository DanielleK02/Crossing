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
public class Player extends Character {

private int size;
private ImageIcon ii;
private Image img;
  

public Player(int size) {
super();
this.size = size;
this.ii = new ImageIcon(getClass().getResource("/images/player.png"));
this.img = ii.getImage();
}

Player(int x, int y) {
     this(40); 
     this.x = 500;
     this.y = 700;
     vx = 0;
     vy = 0;
    }

    Player() {
        this(100, 100); //To change body of generated methods, choose Tools | Templates.
    }


  
public void draw(Graphics g) {
//g.setColor(color);
//g.fillOval(x, y, size, size);
g.drawImage(img, x, y, size, size, null);

    
    }
           
    
}
