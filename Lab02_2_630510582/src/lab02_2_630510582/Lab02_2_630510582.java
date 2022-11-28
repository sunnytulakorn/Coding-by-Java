/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_2_630510582;
import java.util.Scanner;
//tulakorn sawangmuang
//630510582
//section-001

public class Lab02_2_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPoint, x, y, i, qua1, qua2, qua3, qua4, numX, numY, origin;
        System.out.print("Enter N: ");
        numPoint = sc.nextInt(); //number of input value
        qua1 = 0;
        qua2 = 0;
        qua3 = 0;
        qua4 = 0;
        numX = 0;
        numY = 0;
        origin = 0;
        for (i=1;i<=numPoint;i++) { //loop get x y and show number of point in quadrant 1 2 3 4 , x axis, y axis, origin
            System.out.printf("Enter point #%d: ",i);
            x =  sc.nextInt();
            y = sc.nextInt();
            int ans = checkQuadrant(x,y);//check quadrant
            if(ans != 0){ // value to display
                if (ans == 1){
                    qua1 += 1;
                }else if (ans == 2){
                    qua2 += 1;
                }else if (ans == 3){
                    qua3 += 1;
                }else if (ans == 4){
                    qua4 += 1;
                }else if (ans == 5){
                    numX += 1;
                }else if (ans == 6){
                    numY += 1;
                }else if (ans == 7){
                    origin += 1;
                }
            }
        }
        System.out.printf("Number of points in Qaudrant 1 = %d" + '\n',qua1);
        System.out.printf("Number of points in Qaudrant 2 = %d" + '\n',qua2);
        System.out.printf("Number of points in Qaudrant 3 = %d" + '\n',qua3);
        System.out.printf("Number of points in Qaudrant 4 = %d" + '\n',qua4);
        System.out.printf("Number of points on X axis = %d" + '\n',numX);
        System.out.printf("Number of points on Y axis = %d" + '\n',numY);
        System.out.printf("Number of points on origin point = %d" + '\n',origin);
        
    }
    
    public static int checkQuadrant(int a,int b) {
        if (a > 0 && b > 0){ //quadrant 1
            return(1);
        }else if (a < 0 && b > 0){ // quadrant 2
            return(2);
        }else if (a < 0 && b < 0){ // quadrant 3 
            return(3);
        }else if (a > 0 && b < 0){ // quadrant 4
            return(4);
        }else if (b == 0 && a > 0 || b == 0 && a < 0 ){ // x axis
            return(5);
        }else if (a == 0 && b > 0 || a == 0 && b < 0 ){ // y axis
            return(6);
        }else if (a == 0 && b == 0 ){ // origin
            return(7);
        }else{ 
            return(0);
        }
                
    }
    
}
