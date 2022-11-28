/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_2_630510582;

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class Lab01_2_630510582 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] all_score = new int[99]; 
        int max_,min_,num,count = 0;
        int i,less_avg = 0,sum = 0,avg = 0;
        System.out.println("Enter score between 1-100 or press for stop");
        num = sc.nextInt();
        max_ = num;
        min_ = max_;
        while(num != 0){
            all_score[count] = num;
            if(num > 100){
                System.out.println("Enter score again (between 1-100 or press 0 for stop)");
            }
            else{
                if(num > max_){
                    max_ = num;
                }
                else if(num < min_ && num != 0){
                    min_ = num;
                }
                sum += all_score[count];
                count += 1;
            }
            num = sc.nextInt();
        }
        avg = sum/count;
        for(i = 0; i< count ; i++){
            if(all_score[i] < avg){
                less_avg += 1;
            }
        }
        System.out.printf("Maximum Score = %d \n", max_);
        System.out.printf("Minimum Score = %d \n", min_);
        System.out.printf("Average Score = %d \n", avg);
        System.out.printf("The number of students who scored below average score = %d \n", less_avg);
    
    }
}