/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_1_630510582;
import java.util.Scanner;
// tulakorn sawangmuang
//630510582
// section-001

class Human{
    private char gender; //attribute for class
    private float weight;
    private float height;
    private String shape;
    
    public void setData(){
        Scanner sc = new Scanner(System.in);
        ///System.out.print("Enter gender: ");
        ///gender = sc.nextLine().charAt(0);
        do{
            System.out.print("Enter sex: ");
            gender = Character.toLowerCase(sc.nextLine().charAt(0));
        } while (gender != 'm' && gender != 'f');

        System.out.print("Enter weight: ");
        weight = sc.nextFloat();
        System.out.print("Enter height: ");
        height = sc.nextFloat();       
    }
    public void calShape(){
        if (gender == 'm'){
            if (weight <= height-100){
                shape = "Your shape is OK.";
            }
            else{
                shape = "Your shape is not OK.";
            }
        }
        if (gender == 'f'){
            if (weight <= height-110){
                shape = "Your shape is OK.";
                }
            else{
                shape = "Your shape is not OK.";
            }
        }
    }
    public void printResult(){  
        System.out.print(shape);
    }
}

public class Lab03_1_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Human h = new Human();
        h.setData();
        h.calShape();
        h.printResult();
    }   
}
