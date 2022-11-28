/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05_3_630510582;
import java.util.Scanner;
import java.util.ArrayList;
//tulakorn sawangmuang
//630510582
//section001
/**
 *
 * @author ACER
 */
class Menu{
    private int choice;
    public void setChoice(){
        Scanner input = new Scanner(System.in);
        System.out.println("**********");
        System.out.println("1.push");
        System.out.println("2.pop");
        System.out.println("3.show");
        System.out.println("4.exit");
        System.out.println("**********");
        System.out.print("Please select choice: ");
        choice = input.nextInt();
    }
    
    public int getChoice(){ //return choise value
        return(choice);
    }
}

class Stack{
    private  ArrayList<Integer> item = new ArrayList<Integer>();
    private int top;
    public Stack(){ //constructor
        top = -1; //index
    }
    
    public void push(){
        int data;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Data: ");
        data = input.nextInt();
        top += 1; //add index
        item.add(top, data); //add data to list
    }

    public void pop(){
        System.out.printf("pop %d"+'\n',item.get(top)); //show last data in list 
        item.remove(top);
        top -= 1; 
    }

    public void show(){
        for (int i : item){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
    
    public boolean isEmpty(){ //check list have data or not
        if(top == -1){
            return(true);
        }else{
            return(false);
        }
    }

    public boolean isFull(){ //check list have full data or not
        if(top == 4){
            return(true);
        }else{
            return(false);
        }
    }

}
public class Lab05_3_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        Stack s = new Stack(); //stack object
        while(true){
            Menu m = new Menu(); //menu object
            m.setChoice();
            choice = m.getChoice(); //get choice from class menu
            if(choice == 1){ //push
                if(s.isFull() == false){
                    s.push();
                }else{
                    System.out.print("Stack is full"+'\n');
                }
            }else if(choice == 2){ //pop
                if(s.isEmpty()){
                    System.out.print("Stack is empty"+'\n');
                }else{
                    s.pop();
                }
            }else if(choice == 3){ //show
                if(s.isEmpty()){
                    System.out.print("Stack is empty"+'\n');
                }else{
                    s.show();
                }
            }else if(choice == 4){ //exit
                System.out.print("Bye Bye");
                break;
            }
        }
    }
    
}
