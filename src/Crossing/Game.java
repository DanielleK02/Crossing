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

/**
 *
 * @author 628953
 */
public class Game extends JPanel {
    
    private Player bob;
    private Timer timer;
    private Road road;


    public Game() {
    super();
    bob = new Player(1200 / 2, 960 - 100);
    //road = new Road();
    timer = new Timer();
    timer.scheduleAtFixedRate(new ScheduleTask(), 1000, 1000/60);

    }
    
    public void paintComponent (Graphics g) {
        
    }
    
    private class ScheduleTask extends TimerTask {
    public void run() {
        bob.update();
    }

    }

 public void keyPressed(KeyEvent e) {
        final int SPEED = 4;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            bob.setDx(SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            bob.setDx(-SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            bob.setDy(-SPEED);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            bob.setDy(SPEED);
        }
    }
    
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            bob.setDx(0);
            
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            bob.setDx(0);
            
        if (e.getKeyCode() == KeyEvent.VK_UP)
            bob.setDy(0);
            
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            bob.setDy(0);  
            }





}