/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_2_630510582;
import java.util.Scanner;
// tulakorn sawangmuang
//630510582
//section-001
/**
 *
 * @author ACER
 */
class People{
    private int height;
    private int weight;
    private char sex;
    private String name;
    private int setwei;
    private int cal;
    
    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input height: ");
        height = sc.nextInt();
        System.out.print("Input weight: ");
        weight = sc.nextInt();
        System.out.print("Input sex: ");
        sc.nextLine();
        sex = sc.nextLine().charAt(0);       
    }
    public void calData(){ //caldata if men or female
        if(sex == 'm' || sex == 'M'){   
            setwei = height - 100;
        }
        else if(sex == 'f' || sex == 'F'){
            setwei = height - 110;
        }
    }
    public void calSW(){ //cal for compare
        cal = Math.abs(weight - setwei);
    }
    public int recalW(){ //return value for compare with 2 people
        return(cal);
    }
    public String reName(){ // return name
        return(name);
    }
}
public class Lab06_2_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        People p = new People();
        System.out.println("Input data for person #1");    
        p.setData();
        p.calData();
        p.calSW(); 
        System.out.println();
        System.out.println("Input data for person #2");
        People p1 = new People();
        p1.setData();
        p1.calData();
        p1.calSW();
        
        if(p.recalW() == p1.recalW()){ //close to the standard weight equally
            System.out.println("The weight of both of them are close to the standard weight equally.");
        }
        else if(p.recalW() > p1.recalW()){ 
            System.out.println("Weight of " +p1.reName()+" is closer to standard weight than " +p.reName());
        }
        else if(p.recalW() < p1.recalW()){
            System.out.println("Weight of " +p.reName()+" is closer to standard weight than " +p1.reName());
        }
    }
    
}
