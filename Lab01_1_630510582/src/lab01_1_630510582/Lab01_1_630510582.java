// 630510582
// tulakorn sawangmuang
//section 001
package lab01_1_630510582;
import java.util.Scanner;
public class Lab01_1_630510582 {
    public static void main(String[] arge){
        int A, B, C, ans = 0; 
        Scanner sn = new Scanner(System.in); 
        System.out.print("Enter A: ");
        A = sn.nextInt();
        System.out.print("Enter B: ");
        B = sn.nextInt();
        System.out.print("Enter C: ");
        C = sn.nextInt();

        System.out.printf("%d ", A); //display A value
        System.out.printf("%d ", B);//display B value

        ans = (A*A)+(B*B); // calculate condition to whlie loop
        while (ans <= C){
            System.out.printf("%d ",ans); 
            A = B; // next 1st num
            B = ans; // next 2nd num
            ans = (A*A)+(B*B);
        }
}}
