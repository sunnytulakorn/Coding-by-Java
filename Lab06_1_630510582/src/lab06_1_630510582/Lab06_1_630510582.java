/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_1_630510582;
import java.util.Scanner;
// tulakorn sawangmuang
//630510592
//section-001
/**
 *
 * @author ACER
 */
class Drawing{
    void drawTriangle(int N){
        for(int row=1;row<=N;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void drawTriangle(int N,char X){
        for(int row=N;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print(X);
            }
            System.out.println();
        }
    }
}
public class Lab06_1_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N;
        char X;
        Drawing myDrawing = new Drawing();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        N = sc.nextInt();
        System.out.print("Input X: ");
        sc.nextLine();
        X = sc.nextLine().charAt(0);
        myDrawing.drawTriangle(N);
        myDrawing.drawTriangle(N,X);
    }    
}
