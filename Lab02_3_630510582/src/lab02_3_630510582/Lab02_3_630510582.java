/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_3_630510582;
import java.util.Scanner;
//tulakorn sawangmuang
//630510582
//section-001

/**
 *
 * @author ACER
 */
public class Lab02_3_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.print("Enter number: ");
        n = sc.nextInt();
        if(checkOddEven(n)){    
            System.out.println(n + " is odd number.");
        }
        else{
            System.out.println( n + " is even number.");
        }
        if(checkPrime(n)){
            System.out.println( n + " is prime number.");
        }
        else{
            System.out.println( n + " is not prime number.");
        }
    }
    public static boolean checkPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2;i < n;i++){
            if(n % i == 0){
                return false;
            }    
        }
        return true;
    }      
    public static boolean checkOddEven(int n){
        if( n%2 == 0){
            return false;
        }
        else{
            return true;
        }
    }
}
