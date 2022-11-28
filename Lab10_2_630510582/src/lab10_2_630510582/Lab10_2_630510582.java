/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_2_630510582;
import java.util.Scanner;
//tulakorn sawangmuang
//630510582
//section 001
/**
 *
 * @author ACER
 */
class Shape2Dim{
    protected int N;
    public void setN(int n){
        N = n;
    }
}
class Rhombus extends Shape2Dim{
    Rhombus(){
        N = 0;
    }
    void draw(){
        if(N > 0){
            int i;
            String fsq = "%" + N +"c\n";
            String fsq2;
            System.out.printf(fsq,'*');
            for(i=1;i<N;i++){
                fsq2 = "%" + (N-i) + "c%" + (2*i) + "c\n";
                System.out.printf(fsq2,'*','*');
            }for(i=N-2;i>=1;i--){
                fsq2 = "%" + (N-i) + "c%" + (2*i) + "c\n";
                System.out.printf(fsq2,'*','*');
            }
            System.out.printf(fsq,'*');
        }
    }
}
class Square extends Shape2Dim{
    Square(){
        N = 0;
    }
    void draw(){
        if(N > 0){
            int i,j;
		    for(i = 1; i <= N; i++){
			    if(i == 1 || i == N)
				    for(j = 1; j <= N; j++)
					    System.out.print("*");
			    else
				    for(j = 1; j <= N; j++)
					    if(j == 1 || j == N)
						    System.out.print("*");
					    else
						    System.out.print(" ");
			    System.out.print("\n");
            }
		}
	}
}
class Triangle extends Shape2Dim{
    Triangle(){
        N = 0;
    }
    void draw(){
        if(N > 0){
            int i;
            String fsq = "%" + N + "c\n";
            String fsq2;
            System.out.printf(fsq,'*');
            for(i = 1; i < N-1 ; i++){
                fsq2 = "%" + (N-i)+"c%"+(2*i)+"c\n";
                System.out.printf(fsq2,'*','*');
            }
            for(i = 1; i <= N; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class Lab10_2_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double M,size;
        char shape;       
        Scanner input = new Scanner(System.in);
        System.out.print("Input M: ");
        M = input.nextDouble();
        Shape2Dim[] sh = new Shape2Dim[50];
        for(int i=0;i<M;i++){
            System.out.print("Input Type (R S or T) and Size: ");
            shape = input.next().charAt(0);
            size = input.nextDouble();
            if(shape == 'R'){
                sh[i] = new Rhombus();
                sh[i].setN((int) size);
            }else if(shape == 'S'){
                sh[i] = new Square();
                sh[i].setN((int) size);
            }else{
                sh[i] = new Triangle();
                sh[i].setN((int) size);
            }
        }
        
        System.out.print("Rhombus\n");
        for(int i=0;i<M;i++){
            if(sh[i] instanceof Rhombus){//type casting
                ((Rhombus)sh[i]).draw();
            }
        }
        System.out.println();
        
        System.out.print("Sqaure\n");
        for(int i=0;i<M;i++){
            if(sh[i] instanceof Square){//type casting
                ((Square)sh[i]).draw();
            }
        }
        System.out.println();
        System.out.print("Triangle\n");
        for(int i=0;i<M;i++){
            if(sh[i] instanceof Triangle){//type casting
                ((Triangle)sh[i]).draw();
            }
        }
        System.out.println();
    }
    
}
