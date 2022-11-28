/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_1_630510582;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Lab11_1_630510582 {

    /**
     * @param args the command line arguments
     */
    public static final int N = 3;
    
    public static <TYPE extends Comparable> TYPE getCenter(TYPE data[]){
        TYPE temp;
        int i,j;
        
        for(i=0;i<N;i++){
            for(j=0;j<N;j++){
                if(data[i].compareTo(data[j])>0){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return data[1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 3;
        Character[] cData = new Character[N];
        Integer[]iData = new Integer[N];
        Float[] fData = new Float[N];
        
        System.out.print("Enter 3 integer numbers\n");
        for(int i = 0;i<N;i++){
            iData[i] = sc.nextInt();           
        }
        System.out.print("Enter 3 Character\n");
        for(int i = 0;i<N;i++){
            cData[i] = sc.next().charAt(0); 
        }
        System.out.print("Enter 3 float numbers\n");
        for(int i = 0;i<N;i++){
            fData[i] = sc.nextFloat(); 
        }
        
        System.out.println();
        System.out.println(getCenter(iData));
        System.out.println(getCenter(cData));
        System.out.println(getCenter(fData));
    }
}
