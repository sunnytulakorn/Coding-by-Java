/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10_1_630510582;
import java.util.Scanner;
//tulakorn sawangmuang
//630510582
//section-001
/**
 *
 * @author ACER
 */
abstract class Student{
    protected String name;
    protected int midScore;
    protected int finalScore;
    
    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter midterm Score: ");
        midScore = sc.nextInt();
        System.out.print("Enter final score: ");
        finalScore = sc.nextInt();               
    }
    public String getName(){
        return name;
    }
    public int getmidScore(){
        return midScore;
    }
    public int getfinlScore(){
        return finalScore;
    }
    public abstract char calGrade(int totalScore);           
}
class Undergraduate extends Student{
    private int projectScore;
    
    public void setProject(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter project score: ");
        projectScore = sc.nextInt();
    }
    public int getprojectScore(){
        return projectScore;
    }
    public char calGrade(int totalScore){ //override medthod
        return(totalScore >= 50 && projectScore >= 50)?'S':'U';
    }
}
class Graduate extends Student{
    private int publicationNo;
    
    public void setPublicationNo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of publication: ");
        publicationNo = sc.nextInt();
    }
    public int getpublicationNo(){
        return publicationNo;
    }
    public char calGrade(int totalScore){ //override medthod
        return(totalScore >= 60 && publicationNo >= 2)?'S':'U';
    }
}
public class Lab10_1_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student[]std = new Student[100];
        int id  = 0;
        char choice;
        
        do{
            System.out.print("Enter undergraduate student or graduate student(u/g): ");
            choice = sc.nextLine().charAt(0);
            if(choice == 'u'){
                std[id] = new Undergraduate();
                std[id].setData();
                ((Undergraduate)std[id]).setProject();
                id++;
            }
            else if(choice == 'g'){
                std[id] = new Graduate();
                std[id].setData();
                ((Graduate)std[id]).setPublicationNo();
                id++;
            }
            else{
                System.out.println("Invalid Type of student");
            }
            System.out.print("Enter another(y/n)?");
            choice = sc.nextLine().charAt(0);
        }
        while(choice == 'y');       
        
        reportGrade(std, id);
    }
    public static void reportGrade(Student[] std, int n){
        System.out.print("\nGrade Reprot\n");
        System.out.print("=====================\n");
        
        int num_S = 0 ;
        for(int i = 0;i<n;i++){
            System.out.printf("%s ", std[i].getName());
            int mid = std[i].getmidScore();
            int fn = std[i].getfinlScore();
            int totalScore = mid+fn;
            System.out.print("gets grade");
            
            char grade;
            if(std[i]instanceof Undergraduate){
                grade = std[i].calGrade(totalScore);
            }
            else{
                grade = std[i].calGrade(totalScore);
            }
            System.out.printf("%c.\n", grade);
            
            if(grade  == 'S'){
                num_S++;
            }           
        }
        System.out.printf("Total : Grade U = %d\tGrade S = %d\n",n-num_S,num_S);
    }
}
