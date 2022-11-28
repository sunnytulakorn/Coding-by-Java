/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab08_1_630510582;
import java.util.Scanner;
//tulakorn sawangmuang
//630510582
//section-001
/**
 *
 * @author ACER
 */
class Land{
    protected int landSize;
    
    public void setData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter land size: ");
        landSize = sc.nextInt();
    }
    public int getlandSize(){
        return landSize;
    }
}
class LandForSale extends Land{
    private int landsizel;
    private String titleDeed;
    private int evaluatePrice;
    private int saleStatus = 0;
    private float salePrice;
    
    public void setDataLandFsale(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter land size: ");
        landsizel = sc.nextInt();
        System.out.print("Enter title deed: ");
        titleDeed = sc.next();
        System.out.print("Enter Evaluate price: ");
        evaluatePrice = sc.nextInt();
    }
    public int getevaluatePrice(){
        return evaluatePrice;
    }
    public int getLandSizeL(){
        return landsizel;
    }
    public int getsaleStatus(){
        return saleStatus;
    }
    public void addStatus(){
        saleStatus += 1;
    }
    public void salePrice(float v){
        salePrice = v;
    }
    public float getsalePrice(){
        return salePrice;
    }
    public String getTitle(){
        return titleDeed;
    } 
}
class LandForHouse extends Land{
    private int housePrice;
    private int housestatus = 0;
    
    public void setLandFhouse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter house price: ");
        housePrice = sc.nextInt();
    }
    public int gethousePrice(){
        return housePrice;
    }
    public void addStatus(){
        housestatus += 1;
    }
    public int getStatus(){
        return housestatus;
    }
}
public class Lab08_1_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,house,land;
        System.out.print("Enter number of house: ");
        house = sc.nextInt();
        System.out.print("Enter number of land: ");
        land = sc.nextInt();
        System.out.println("");
        LandForHouse[] h = new LandForHouse[house];
        for(i=0;i<house;i++){
            System.out.printf("Enter data for house #%d",i+1);
            System.out.println("");
            h[i] = new LandForHouse();
            h[i].setData();
            h[i].setLandFhouse();
            System.out.println("");
        }
        LandForSale[] l = new LandForSale[land];
        for(i=0;i<land;i++){
            System.out.printf("Enter data for lands #%d",i+1);
            System.out.println("");
            l[i] = new LandForSale();
            l[i].setDataLandFsale();
            System.out.println("");
        }
        Checkland(h, l, house, land);
        resultH(l, land);
    }
    public static void Checkland(LandForHouse[] h, LandForSale[] l, int house, int land){
        float v;//value salePrice
        for (int i = 0;i<house;i++){ // loop for chackhouse
            for (int j = 0;j<land;j++){
                if(h[i].getlandSize() <= l[j].getLandSizeL()){
                    if (l[j].getsaleStatus() == 0 && h[i].getStatus() == 0){
                        l[j].addStatus();
                        h[i].addStatus();
                        v = l[j].getevaluatePrice() + 0.1f * l[j].getevaluatePrice() + 0.05f * h[i].gethousePrice();
                        l[j].salePrice(v);
                    }
                }
            }
        }
    }
    public static void resultH(LandForSale[] l,int land){
        System.out.println("Report for lands which can be sold");
        System.out.println("Title deed\tSale price");
        float totalP = 0;
        for (int i = 0;i<land;i++){
            String tt = l[i].getTitle();
            float result = l[i].getsalePrice();
            int eva = l[i].getevaluatePrice();
            System.out.printf("%s\t\t%.2f\n",tt,result);
            totalP += result - eva;
        }
        System.out.println("");
        System.out.printf("Total profit = %.2f",totalP);
    }
}
