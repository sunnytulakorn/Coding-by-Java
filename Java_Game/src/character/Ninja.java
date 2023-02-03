/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author ACER
 */
public class Ninja {
    public int x,y,ninjaSize;
    private int jumpHigh = 50;
    
    public Ninja(int x, int y, int ninjaSize){
        this.x = x;
        this.y = y;
        this.ninjaSize = ninjaSize;
    }
    
    public void jump(JPanel game){
        this.y -= jumpHigh;
        game.repaint();
        Timer timer = new Timer(450, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                y += jumpHigh;
                game.repaint();
            }
        });
        timer.setRepeats(false);
        timer.start();
    } 
}
