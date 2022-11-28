/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_4_630510582;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class Lab01_4_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] A = new int[5];
        int [] B = new int [5];
        int [] C = new int [10];
        int i,j,number;
        for(i = 0; i <= 9 ; i++){
            if(i < 5){
                if(i == 0){
                    System.out.println("Enter Array A");
                }
                number = sc.nextInt();
                A[i] = number;
            }
            else{
                if(i == 5){              
                    System.out.println("Enter Array B");
                }
                number = sc.nextInt();
                B[i-5] = number;
            }
        }
        for(i = 0;i <= 4; i++){
            C[i] = A[i];
            C[i+5] = B[i];
        }
        Arrays.sort(C);//Sort 
        for(i = 0 ;i<= 9;i++){
            System.out.print(C[i] + " ");
        }
        System.out.print("\n");
    }
    
}
