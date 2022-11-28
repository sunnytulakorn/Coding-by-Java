/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab09_1_630510582;
import java.util.Scanner;
//tulakorn sawangmuang
//630510582
//section001
/**
 *
 * @author ACER
 */
class OrderItem{
    private String foodName;
    private int Price;
    private int numDish;
    
    public void setName(String fn){
        foodName = fn;
    }
    public void setPrice(int p){
        Price = p;
    }
    public void setNumD(int d){
        numDish = d;
    }
    public String getfoodName(){
        return foodName;
    }
    public int getPrice(){
        return Price;
    }
    public int getnumDish(){
        return numDish;
    }
}
class Order{
    private String orderId;
    private String tableNo;
    private int numberOfitem;
    private OrderItem [] item = new OrderItem[10];
    private double totalPrice;
    
    public void setData(){
        Scanner sc = new Scanner(System.in);
        String foodN;
        int Pr;
        int numD;        
        System.out.print("Enter order Id: ");
        orderId = sc.nextLine();
        System.out.print("Enter Table No.: ");
        tableNo = sc.nextLine();
        System.out.print("Enter number of food items: ");
        numberOfitem = sc.nextInt();
        for(int i=0;i<numberOfitem;i++){
            if(numberOfitem > 0 && numberOfitem <= 10){
                System.out.println("*************************************************************");
                System.out.print("Enter food name: ");
                sc.nextLine();
                foodN = sc.nextLine();
                System.out.print("Enter price: ");
                Pr = sc.nextInt();
                System.out.print("Enter number of dishes: ");
                numD = sc.nextInt();
                item[i] = new OrderItem();
                item[i].setName(foodN);
                item[i].setPrice(Pr);
                item[i].setNumD(numD);
            }           
        }
    }
    public void showData(){
        System.out.printf("Order ID - %s\tTable No. - %s\n",orderId,tableNo);
        System.out.println("Food Name\tPrice/Dish(Baht)\tQTY");
        int sumTotal = 0;
        for (int i = 0;i<numberOfitem;i++){//Loop show Result
            String nameFood = item[i].getfoodName();
            int price = item[i].getPrice();
            int numDish = item[i].getnumDish();
            sumTotal += price * numDish;
            System.out.printf("%s\t%d\t\t\t%d\n",nameFood,price,numDish);
        }
        System.out.printf("TotalPrice = %d Bath",sumTotal);
    }
}
public class Lab09_1_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Order o = new Order();
        o.setData();
        o.showData();
    }
    
}
