/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03_3_630510582;
import java.util.Scanner;
// tulakorn sawangmuang
//630510582
//section-001
/**
 *
 * @author ACER
 */
class Student{
    private String grade;
    private int midtermScore;
    private int finalScore;
    private int sumScore;
    private int stuId; //student id

    public void getData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        stuId = input.nextInt();
        System.out.print("Enter midterm and final scores: ");
        midtermScore = input.nextInt();
        finalScore = input.nextInt();
    }

    public void calGrade(){ //calculate grade
        sumScore = midtermScore + finalScore;
        if (sumScore >= 85){
            grade = "A";
        }else if (sumScore >= 80 && sumScore <= 84){
            grade = "B+";
        }else if (sumScore >= 75 && sumScore <= 79){
            grade = "B";
        }else if (sumScore >= 60 && sumScore <= 74){
            grade = "C+";
        }else if (sumScore >= 55 && sumScore <= 59){
            grade = "C";
        }else if (sumScore >= 50 && sumScore <= 54){
            grade = "D+";
        }else if (sumScore >= 45 && sumScore <= 49){
            grade = "D";
        }else{
            grade = "F";
        }
    }

    public void printResult(){
        System.out.printf("%d    %d       %s" + '\n',stuId,sumScore,grade);
    }

}

public class Lab03_3_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        num = input.nextInt();
        Student[] stu = new Student[num];
        for (i=0;i<num;i++){ //get data and calculate grade of student
            System.out.printf("Enter data for student #%d"+'\n',i+1);
            Student backup = new Student();
            backup.getData();
            backup.calGrade();
            stu[i] = backup; 
        }
        j = 0;
        System.out.println(); 
        System.out.println("No.  StudentID   Score    Grade");
        while (j != num){ //show result
            System.out.printf("%d    ",j+1);
            stu[j].printResult();
            j += 1;
        }                  
    }
    
}
