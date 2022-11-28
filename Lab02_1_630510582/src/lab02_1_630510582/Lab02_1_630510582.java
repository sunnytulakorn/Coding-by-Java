/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_1_630510582;
import java.util.Scanner;
// tulakorn sawangmuang
//630510582
//section-001


/**
 *
 * @author ACER
 */
public class Lab02_1_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char ch;
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input character: ");
        ch = sc.nextLine().charAt(0);
        
        do{
            System.out.print("Input number (between 2 and 10) :");
            number = sc.nextInt();                                
        }while (number < 2 || number > 10);
        if (ch == 'A'||ch == 'a')
            printStarA(number);
        else if(ch == 'b'|| ch == 'B')
            printStarB(number);
        else 
            System.out.print("Goodbye");            
    }
    public static void printStarA(int n){
        int row, col;
        for(row=n; row >= 1;row--){
            for(col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printStarB(int n){
        int row, col;
        for(row=1;row<=n;row++){
            for(col=row;col<n;col++){
                System.out.print(" ");
            }
            for(int k=1;k<=row;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
