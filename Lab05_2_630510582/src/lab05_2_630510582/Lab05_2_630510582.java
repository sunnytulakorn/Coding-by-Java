/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05_2_630510582;
import java.util.Scanner;
//tulakorn sawangmuang
//630510582
//section001
/**
 *
 * @author ACER
 */
class Box{
    private String name;
    private double width;
    private double lenght;
    private double height;
    private double volume;
    public Box(){ //constuctor

    }
    public Box(String n,int w,int l,int h){ //constructor
        name = n;
        width = w;
        lenght = l;
        height = h;
    }
    
    public void setData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Name of Box: ");
        name = input.nextLine();
        System.out.print("Input Width: ");
        width = input.nextDouble();
        System.out.print("Input Length: ");
        lenght = input.nextDouble();
        System.out.print("Input Height: ");
        height = input.nextDouble();
    }
    public void calVolume(){
        volume = width * lenght * height; //find volume of box
    }
    public void showResult(){
        System.out.printf("The Volume of Box: %s = %.1f"+'\n',name,volume);
    }    
}

public class Lab05_2_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello from 1st constructor");
        Box box1 = new Box("SizeA",14,20,6); 
        box1.setData();
        box1.calVolume();
        box1.showResult();
        System.out.println("Hello from 2nd constructor");
        Box box2 = new Box(); 
        box2.setData();
        box2.calVolume();
        box2.showResult();
    }
    
}
