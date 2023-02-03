/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_game;

import character.Ninja;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
/**
 *
 * @author ACER
 */
public class Game extends JPanel implements KeyListener{
    Ninja ninja = new Ninja(50, 300, 50); // position of character
    public Game(){
        this.setBounds(0,0,1000,600); // set window size
        this.addKeyListener(this);
        this.setFocusable(true);
        this.setLayout(null);
    }
    
    @Override
    public void paint(Graphics g){ //override from JPanel
        super.paint(g); // new draw
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.RED);
        g2.drawRect(ninja.x, ninja.y, ninja.ninjaSize, ninja.ninjaSize);//character
    }
    
    @Override
    public void keyTyped(KeyEvent e){
        
    }
    
    @Override
    public void keyPressed(KeyEvent e){ // press button (38, 32, 87)
        System.out.println(e.getKeyCode());
        if(e.getKeyCode()==38||e.getKeyCode()==32||e.getKeyCode()==87){
            ninja.jump(this);
            this.repaint(); // new position of character when press button
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e){
        
    }
}
