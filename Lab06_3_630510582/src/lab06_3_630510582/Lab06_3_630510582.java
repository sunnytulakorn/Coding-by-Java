/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab06_3_630510582;
import java.util.Scanner;
import java.util.ArrayList;
// tulakorn sawangmuang
// 630510582
//section-001

/**
 *
 * @author ACER
 */
class Star{
    private int no;
    private String name;
    private int score;
    
    public Star(int n, String na,int s){ //keep value star
        no = n;
        name = na;
        score = s;       
    }
    public int mNum(){ //return number star
        return(no);
    }
    public void addScore(){ // count score vote
        score += 1;
    }
    public int realsco(){ // return final score value
        return(score);
    }
}
class Voter{
    private String name;
    private int mstar;
    private int fstar;
    
    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name : ");
        name = sc.nextLine();
        System.out.print("Input number of actor and number of actress :");
        mstar = sc.nextInt();
        fstar = sc.nextInt();       
    }
    public int mResult(){ //return number men star for vote
        return(mstar);
    }
    public int fResult(){ //return number female star for vote
        return(fstar);
    }
    public String displayN(){ //return name who vote star
        return(name);
    }
    
}
public class Lab06_3_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input N : ");
        n = sc.nextInt();
        Voter[] v = new Voter[n];
        for(i=0;i<n;i++){
            v[i] = new Voter();
            System.out.println("Input vote #"+(i+1));
            v[i].setData();
        }
        Star[] myStar = {new Star(1,"Nadech",0),new Star(2,"Wier",0),new Star(3,"Mario",0)}; // Men star array list 
        Star[] myfStar = {new Star(1,"Aum",0),new Star(2,"Yaya",0),new Star(3,"Bella",0)}; // Female star array list
        int [] winner =checkAndPrintVote(myStar,myfStar,v); // winner men and female 
        printGoodLuckPeople(winner,v); // call methods
    }
    public static int[] checkAndPrintVote(Star[] myStar, Star[] myfStar, Voter[] v){
        int i,n;
        int [] winner = new int[2];
        for(i=0;i<v.length;i++){ // loop for count score
            if(v[i].mResult()== myStar[0].mNum()){
                myStar[0].addScore();
            }
            else if(v[i].mResult()== myStar[1].mNum()){
                myStar[1].addScore();
            }
            else if(v[i].mResult()== myStar[2].mNum()){
                myStar[2].addScore();
            }
            if(v[i].fResult()== myfStar[0].mNum()){
                myfStar[0].addScore();
            }
            else if(v[i].fResult()== myfStar[1].mNum()){
                myfStar[1].addScore();
            }
            else if(v[i].fResult()== myfStar[2].mNum()){
                myfStar[2].addScore();
            }           
        }// print and check who is winner for men
            if(myStar[0].realsco()>=myStar[1].realsco() && myStar[0].realsco()>=myStar[2].realsco()){
                System.out.println("Top star award (Actor) goes to Nadech");
                winner[0] = 1;
            }
            else if(myStar[1].realsco()> myStar[0].realsco() && myStar[1].realsco()>= myStar[2].realsco()){
                System.out.println("Top star award (Actor) goes to Wier");
                winner[0] = 2;
            }
            else if(myStar[2].realsco()> myStar[0].realsco() && myStar[2].realsco()> myStar[1].realsco()){
                System.out.println("Top star award (Actor) goes to Mario");
                winner[0] = 3;
            }// print and check who is winner for female
            if(myfStar[0].realsco()>=myfStar[1].realsco() && myfStar[0].realsco()>=myfStar[2].realsco()){
                System.out.println("Top star award (Actress) goes to Aum");
                winner[1] = 1;
            }
            else if(myfStar[1].realsco()>myfStar[0].realsco() && myfStar[1].realsco()>=myfStar[2].realsco()){
                System.out.println("Top star award (Actress) goes to Yaya");
                winner[1] = 2;
            }
            else if(myfStar[2].realsco()>myfStar[0].realsco() && myfStar[2].realsco()>myfStar[1].realsco()){
                System.out.println("Top star award (Actress) goes to Bella");
                winner[1] = 3;
            }  
        return(winner); //return winner men and female
    }
    public static void printGoodLuckPeople(int[] winner,Voter[] v){
        int i,n;
        n = v.length;
        ArrayList<String> people = new ArrayList<String>();
        for(i=0;i<n;i++){
            if(v[i].mResult() == winner[0] && v[i].fResult() == winner[1]){ //check if vote both winner
                people.add(v[i].displayN()); // add name who vote
            }
        }
        System.out.print("Good luck voter -> ");
        for(String result:people){ //loop if lucky voter more than 1
            System.out.print(result+" ");
        }
        System.out.println();
    }
}
