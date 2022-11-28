/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07_2_630510582;
import java.util.Scanner;
//tulakorn sawangmuang
//630510582
//section - 001
/**
 *
 * @author ACER
 */
class Employee{
    protected String id;
    protected String name;
    
    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

class MonthEmp extends Employee{
    private int salary;
    private int overtimePeriod;
    private int overtimeWage;
    private int total;
    
    public void setMonData(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Input salary: ");
        salary = sc.nextInt();
        System.out.print("Input overtime period: ");
        overtimePeriod = sc.nextInt();
    }
    public int getSalary(){
        return salary;
    }
    public void calMonthlyWage(){
        overtimeWage = overtimePeriod*200;
    }
    public int getovertimeWage(){
        return overtimeWage;
    }
    public void setTotalM(){
        total = salary + overtimeWage;
    }
    public int getTotalM(){
        return total;
    }
}
class CommissionEmp extends Employee{
    protected int commission;
    protected int totalsale;
    protected int percentCom;
    
    public void setComData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input total sale: ");
        totalsale = sc.nextInt();
        System.out.print("Input percent of commission rate: ");
        percentCom = sc.nextInt();
    }
    public void calCommission(){
        commission = (totalsale*percentCom)/100;
    }
    public int getComvalue(){
        return commission;
    }
    public int getTotalsale(){
        return totalsale;
    }
    public int getpercentCom(){
        return percentCom;
    }
}
class WeeklyEmp extends CommissionEmp{
    private int weeklyrate;
    private int weeklyweek;
    private int weeklyWage;
    private int total;
    
    public void setWeekData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input weekly rate: ");
        weeklyrate = sc.nextInt();
        System.out.print("Input working week: ");
        weeklyweek = sc.nextInt();
    }
    public void calweeklyWage(){
        weeklyWage = weeklyrate * weeklyweek;
    }
    public int getWeeklyWage(){
        return weeklyWage;
    }
    public void calTotal(){
        total = commission * weeklyWage;
    }
    public int getTotal(){
        return total;
    }
}
class DailyEmp extends CommissionEmp{
    private int dailyrate;
    private int workingDay;
    private int total;
    private int dailyWage;
    
    public void setDailyData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input daily rate: ");
        dailyrate = sc.nextInt();
        System.out.print("Input working day: ");
        workingDay = sc.nextInt();
    }
    public void caldailyWage(){
        dailyWage = dailyrate * workingDay;
    }
    public void calTotalD(){
        total = dailyWage + commission;
    }
    public int getDailyWage(){
        return dailyWage;
    }
    public int getTotalD(){
        return total;
    }
}
public class Lab07_2_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month,i,week,day;
        System.out.print("Input Number of monthly employee: ");
        month = sc.nextInt();
        System.out.println("");
        MonthEmp[] m = new MonthEmp[month];
        for(i=0;i<month;i++){ //call month medthod
            System.out.printf("Input person #%d\n",i+1);
            m[i] = new MonthEmp();
            m[i].setData();
            m[i].setMonData();
            m[i].calMonthlyWage();
            m[i].setTotalM();
            System.out.println("");
        }
        System.out.println(".......................................................");
        System.out.print("Input Number of weekly employees : ");
        week = sc.nextInt();
        System.out.println("");
        WeeklyEmp[] w = new WeeklyEmp[week];
        for(i=0;i<week;i++){ // call week medtod
            System.out.printf("Input person #%d\n",i+1);
            w[i] = new WeeklyEmp();
            w[i].setData();
            w[i].setComData();
            w[i].setWeekData();
            w[i].calCommission();
            w[i].calweeklyWage();
            w[i].calTotal();
            System.out.println("");
        }
        System.out.println(".......................................................");
        System.out.print("Input Number of daily employees : ");
        day = sc.nextInt();
        System.out.println("");
        DailyEmp[] d = new DailyEmp[day];
        for(i =0;i<day;i++){ //call daily medthod
            System.out.printf("Input person #%d\n",i+1);
            d[i] = new DailyEmp();
            d[i].setData();
            d[i].setComData();
            d[i].setDailyData();
            d[i].calCommission();
            d[i].caldailyWage();
            d[i].calTotalD();
            System.out.println("");
        }
        Resultvalue(m, w, d, month, week, day);
    }
    public static void Resultvalue(MonthEmp[] m, WeeklyEmp[] w, DailyEmp[] d, int month, int week, int day){
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\tABC Company");
        System.out.println("Monthly Employees");
        System.out.println("ID\tName\t\t\tSalary\t\tOvertimewage\tTotal");
        int sumSalary = 0;
        int sumOver = 0;
        int sumToMonth = 0;
        for (int i = 0;i<month;i++){
            String id = m[i].getId();
            String name = m[i].getName();
            int s = m[i].getSalary();
            int o = m[i].getovertimeWage();
            int r = m[i].getTotalM();
            sumSalary += s;
            sumOver += o;
            sumToMonth += r;
            System.out.printf("%s\t%s\t\t%d\t\t%d\t\t%d\n",id,name,s,o,r);
        }
        System.out.printf("Total\t\t\t\t%d\t\t%d\t\t%d\n",sumSalary,sumOver, sumToMonth);
        System.out.println("");
        System.out.println("Weekly Employees");
        System.out.println("ID\tName\t\t\tCommission\tMonthly wage\tTotal");
        int sumComW = 0;
        int sumMonW = 0;
        int sumToWeek = 0;
        for (int i =0;i<week;i++){
            String id = w[i].getId();
            String n = w[i].getName();
            int co = w[i].getComvalue();
            int mo = w[i].getWeeklyWage();
            int to = w[i].getTotal();
            sumComW += co;
            sumMonW += mo;
            sumToWeek += to;
            System.out.printf("%s\t%s\t\t%d\t\t%d\t\t%d\n",id,n,co,mo,to);
        }
        System.out.printf("Total\t\t\t\t%d\t\t%d\t\t%d\n",sumComW,sumMonW,sumToWeek);
        System.out.println("");
        System.out.println("Daily Employees");
        System.out.println("ID\tName\t\t\tCommission\tMonthly wage\tTotal");
        int sumComD = 0;
        int sumMonD = 0;
        int sumToDay = 0;
        for (int i = 0;i<day;i++){
            String id = d[i].getId();
            String n = d[i].getName();
            int co = d[i].getComvalue();
            int mo = d[i].getDailyWage();
            int to = d[i].getTotalD();
            sumComD += co;
            sumMonD += mo;
            sumToDay += to;
            System.out.printf("%s\t%s\t\t%d\t\t%d\t\t%d\n",id,n,co,mo,to);
        }
        System.out.printf("Total\t\t\t\t%d\t\t%d\t\t%d\n",sumComD,sumMonD,sumToDay);
    }
}     
