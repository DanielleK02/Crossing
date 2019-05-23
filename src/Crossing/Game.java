/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Crossing;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;


/**
 *
 * @author 628953
 */
public class Game extends JPanel {
    
    private Player jeff;
    private Road[] roads;
    private ArrayList<Car1> cars;
    private ArrayList<Car2> bob;
    private ArrayList<Car3> jim;
    private ArrayList<Car4> billy;
    private ArrayList<Car5> joe;
    private ArrayList<Car6> frank;
    private boolean youwin;
    private boolean youlose;
    private Timer timer;
    private long lastTime;
    private int tic = 0;

    
        
    public Game() {
        super();
        jeff = new Player(1000 / 2, 960 - 100);
        roads = new Road[4];
        cars = new ArrayList<>();
        bob = new ArrayList<>();
        jim = new ArrayList<>();
        billy = new ArrayList<>();
        joe = new ArrayList<>();
        frank = new ArrayList<>();
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 1000, 1000/60);
        lastTime = System.currentTimeMillis();
        spawnRoads();
     
      
    }
    
   
  
     private void spawnRoads() {
        for(int i = 0; i <4; i++){
        roads[i] = new Road(0 + i * 411, 175);
        }
    }
   
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        long dT = System.currentTimeMillis() - lastTime;
        lastTime = System.currentTimeMillis();
        g.setFont(new Font("TimesRoman", Font.PLAIN, 24));
        g.setColor(Color.red);
        //g.drawString(String.format("dT: %s   FPS: %d", dT, 1000 / dT), 50, 50);
        this.setBackground(Color.GREEN);           
       
         for (Road road : roads) {
           road.draw(g);
       }
        for (Car1 car : cars) {
            if (car != null) {
                car.draw(g);
            }
        }
        for (Car2 car : bob) {
            if (car != null) {
                car.draw(g);
            }
        }
          for (Car3 car : jim) {
            if (car != null) {
                car.draw(g);
            }
        }
           for (Car4 car : billy) {
            if (car != null) {
                car.draw(g);
            }
        }
            for (Car5 car : joe) {
            if (car != null) {
                car.draw(g);
            }
        }
             for (Car6 car : frank) {
            if (car != null) {
                car.draw(g);
            }
        }
        
          jeff.draw(g);
       
     
        if(youwin == true) {
            g.setFont(new Font("TimesRoman", Font.PLAIN, 200));
            g.setColor(Color.blue);
            g.drawString("You Win!", 200, 450);
}
    
      if(youlose == true) {
            g.setFont(new Font("TimesRoman", Font.PLAIN, 200));
            g.setColor(Color.red);
            g.drawString("You Lose", 200, 450);
}
    
    }
    private class ScheduleTask extends TimerTask {
    
        @Override
        public void run() {
            tic++;
         jeff.update();
         if (jeff.getY() <= 10)
             youwin = true;
           
         wallCollisions(jeff);
         
         for (Car1 car : cars) {
             if (cars == null)
                 continue;
             collisionDetection(jeff, car);
             car.update();
         }
         for (Car2 car : bob) {
             collisionDetection(jeff, car);
             car.update();
         }
          for (Car3 car : jim) {
             collisionDetection(jeff, car);
             car.update();
         }
           for (Car4 car : billy) {
             collisionDetection(jeff, car);
             car.update();
         }
            for (Car5 car : joe) {
             collisionDetection(jeff, car);
             car.update();
         } 
            for (Car6 car : frank) {
            collisionDetection(jeff, car);
             car.update();
         }
           if (tic == 150){
               tic = 0;
         cars.add( new Car1(jeff.getX(), jeff.getY()) );
         bob.add( new Car2(jeff.getX(), jeff.getY()) );
         jim.add( new Car3(jeff.getX(), jeff.getY()) );
         billy.add( new Car4(jeff.getX(), jeff.getY()) );
         joe.add( new Car5(jeff.getX(), jeff.getY()) );
         frank.add( new Car6(jeff.getX(), jeff.getY()) );
           }
            repaint();
        }
    }


            
    private void collisionDetection(Player obj1, Character obj2) {
        if (obj1.getBound().intersects(obj2.getBound())) {
            obj1.die();
            obj2.die();
                youlose = true;
                youwin = false;
        }
    }
    private void wallCollisions(Character c) {
       
        if (c.getX() <= 0 || c.getX() + 30 >= this.getWidth()){
            c.setVx(-c.getVx());
        }
    }

    
    public void keyPressed(KeyEvent e) {
        final int SPEED = 4;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            jeff.setVx(SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            jeff.setVx(-SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            jeff.setVy(-SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            jeff.setVy(SPEED);
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            jeff.setVx(0);
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            jeff.setVx(0);
            
        if (e.getKeyCode() == KeyEvent.VK_UP)
            jeff.setVy(0);
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            jeff.setVy(0);
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
         cars.add( new Car1(jeff.getX(), jeff.getY()) );
         bob.add( new Car2(jeff.getX(), jeff.getY()) );
         jim.add( new Car3(jeff.getX(), jeff.getY()) );
         billy.add( new Car4(jeff.getX(), jeff.getY()) );
         joe.add( new Car5(jeff.getX(), jeff.getY()) );
         frank.add( new Car6(jeff.getX(), jeff.getY()) );
        }
        
    }   

    
    
    
    
}