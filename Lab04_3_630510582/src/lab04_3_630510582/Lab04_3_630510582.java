/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_3_630510582;
import java.util.Scanner;
//tulakorn sawangmuang 
//630510582
//section-001
/**
 *
 * @author ACER
 */
class Course{
    private int n_student;
    private String s_name;
    private int n_sub;
    private String [][] Course = new String [50][50];
    private String sub_for_search;
    private int [] max_sub = new int [50];
    public void setData(){
        Scanner input = new Scanner (System.in);
        String all_course;
        System.out.print("Input number of students: ");
        n_student = input.nextInt();
        for(int i = 0 ; i < n_student ; i++){
            System.out.print("Student name: ");
            s_name = input.next();
            System.out.print("Number of subject: ");
            n_sub = input.nextInt();
            if(max_sub[i] < n_sub){
                max_sub[i] = n_sub;
            }
            System.out.print("Course list: ");
            for(int j = 0; j < n_sub ; j++){
                all_course = input.next();
                Course[i][j+1] = all_course;
            }
            Course[i][0] = s_name;
        }
        System.out.print("Input subject for searching: ");
        sub_for_search = input.next();
    

    }
    public void printResult(){
        int num,num_;
        for(int i = 0 ; i < n_student ; i++){
            for(int j = 0 ; j < max_sub[i] ; j++){
                num = Integer.parseInt(Course[i][j+1]);
                num_ = Integer.parseInt(sub_for_search);
                if(num == num_)
                    System.out.println(Course[i][0]);
                }
            }
        }    
}
public class Lab04_3_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course c = new Course();
        c.setData();
        c.printResult();
    }    
}
