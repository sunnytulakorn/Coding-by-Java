/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_game;

import javax.swing.JFrame;
/**
 *
 * @author ACER
 */
public class Display extends JFrame {
    public Display(){
        super("Ninja Jump");
        this.setSize(1000,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 200);
        this.setVisible(true);
        this.getContentPane().setLayout(null); //import class game to class display
        this.getContentPane().add(new Game()); 
        
    }
    
    public static void main(String [] arg){
        Display display = new Display();
    }
}
