/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_1_630510582;
import java.util.Scanner;
//tulakorn sawangmuang
//630510582
//section-001
/**
 *
 * @author ACER
 */

class Matrix{
    private int size;
    private int [][] data = new int[50][50];
    boolean identityStatus;
    
    public void setSize(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input size: ");
        size = sc.nextInt();
    }
    public void setData(){
        int i,j;
        Scanner sc = new Scanner(System.in);
        for(i=0;i<size;i++){ //row
            for(j=0;j<size;j++){ //col
                System.out.printf("input number [%d][%d] : ",i,j);
                data[i][j] = sc.nextInt();
            } //end for j
            System.out.println();
        }//end for i            
    }
    public void checkIdentity(){
        int i,j;
        identityStatus = true;
        for(i=0;i<size && identityStatus;i++){  
            for(j=0;j<size && identityStatus;j++){
                if((i==j)&&(data[i][j] != 1)){
                    identityStatus = false;
                }
                else if((i != j)&&(data[i][j] != 0)){
                    identityStatus = false;
                }
            }
        }        
    }
    public void showIdentity(){
        if(identityStatus){
            System.out.print("This matrix is identity matrix.");
        }
        else{
            System.out.print("This matrix is not identity matrix.");
        }
    }
}

public class Lab04_1_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.setSize();
        m.setData();
        m.checkIdentity();
        m.showIdentity();
    }
    
}
