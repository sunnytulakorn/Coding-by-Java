/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_3_630510582;
import java.util.Scanner;

// tulakorn sawangmuang
// 630510582
// section-001
/**
 *
 * @author ACER
 */
public class Lab01_3_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int kom, sum, n, newbottle, NEXT, count = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        kom = sc.nextInt();
        sum = kom;
        newbottle = kom/5;
        n = kom%5;
        NEXT = ((kom/5)*2)+(kom%5);
        while (NEXT >= 5){
            sum += newbottle*2;
            newbottle = (NEXT/5);
            n = NEXT%5;
            NEXT = (newbottle*2)+n;
        }
        sum += newbottle*2;
        System.out.print("Total number of drinking bottle = "+ sum);
        System.out.println(" The remaining empty bottle = "+ NEXT);
    }
    
}
