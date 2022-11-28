/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07_1_630510582;
import java.util.Scanner;
import java.util.ArrayList;
//tulakorn sawangmuang
//630510582
//sec001
/**
 *
 * @author ACER
 */
class Personnel{
    protected String Firstname;
    protected String lname;
    protected int Age;
    
    public void setInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first name: ");
        Firstname = sc.nextLine();
        System.out.print("Input last name: ");
        lname = sc.nextLine();
        System.out.print("Input age: ");
        Age = sc.nextInt();
    }
    public String getFname(){
        return Firstname;
    }
    public String getLname(){
        return lname;
    }
    public int getAge(){
        return Age;
    }
}
class Teacher extends Personnel{
    private int salary;
    
    public void setSalary(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Input salary: ");
       salary = sc.nextInt();
     }
    public int getSalary(){
        return salary;
    }
}
class Student extends Personnel{
    private int stuY;
    
    public void setStuY(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Input study year: ");
       stuY = sc.nextInt();
    }
    public int getStuY(){
        return stuY;
    }
}

public class Lab07_1_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N: ");
        int N = sc.nextInt();
        
        Student[]s = new Student[N];
        int si = 0;
        Teacher[]t = new Teacher[N];
        int ti = 0;
        float avg;
        
        for(int i = 0;i<N;i++){
            System.out.printf("\nInput person #%d(Teacher or Student):",i+1);
            char choice = sc.next().charAt(0);
            
            if (choice == 's' || choice == 'S'){
                s[si] = new Student();
                s[si].setInfo();
                s[si].setStuY();
                si++;
            }
            else{
                t[ti] = new Teacher();
                t[ti].setInfo();
                t[ti].setSalary();
                ti++;
            }
        }//output
        if(si != 0){
            printAllStudents(s,si);
        }
        if(ti != 0){
            printAllTeachers(t,ti);
        }
        avg = calAndPrintAvgAge(s,si,t,ti);
        
        if(ti != 0){
            countTeacher(t,ti,avg);
        }
    }
    public static void printAllStudents(Student[]s,int n){
        System.out.print("Student");
        System.out.println("\tFirstname\tLastname\tAge\tStudy year");
        String Finame,laname;
        int age,year,i;
        for(i=0;i<n;i++){
            Finame = s[i].getFname();
            laname = s[i].getLname();
            age = s[i].getAge();
            year = s[i].getStuY();
            System.out.printf("%d\t%s\t\t%s\t%d\t%d\n",i+1,Finame,laname,age,year);
        }
        System.out.println();
    }
    public static void printAllTeachers(Teacher[]t,int n){
        System.out.print("Teacher");
        System.out.println("\tFirstname\tLastname\tAge\tSalary");
        String Finame,laname;
        int age,Salary,i;
        for(i=0;i<n;i++){
            Finame = t[i].getFname();
            laname = t[i].getLname();
            age = t[i].getAge();
            Salary = t[i].getSalary();
            System.out.printf("%d\t%s\t\t%s\t%d\t%d\n",i+1,Finame,laname,age,Salary);
        }
        System.out.println();
    }
    public static float calAndPrintAvgAge(Student[]s , int si ,Teacher[]t, int ti){
        float avgStudentAge,avgTeacherAge = 0f;
        int i;
        
        if(si != 0){
            int sumStudentAge = 0;
            for(i = 0;i <si;i++){
                sumStudentAge += s[i].getAge();
            }
            avgStudentAge = (float)sumStudentAge/si;
            System.out.printf("Average of student age = %.2f\n",avgStudentAge);
        }
        if(ti != 0){
            int sumTeacherAge = 0;
            for(i = 0;i <ti;i++){
                sumTeacherAge += t[i].getAge();
            }
            avgTeacherAge = (float)sumTeacherAge/ti;
            System.out.printf("Average of Teacher age = %.2f\n",avgTeacherAge);
        }
        return avgTeacherAge;
    }
    public static void countTeacher(Teacher[]t,int n,float avg){
        int numTBlowAge = 0;
        int i;
        
        for(i=0;i<n;i++){
            if((float)t[i].getAge()<avg){
                numTBlowAge += 1;
            }
        }
        System.out.printf("Number of teacher who have age below average = %d\n",numTBlowAge);
    }
}
