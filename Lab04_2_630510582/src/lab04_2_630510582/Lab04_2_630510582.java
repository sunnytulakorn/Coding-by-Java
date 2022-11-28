/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04_2_630510582;
import java.util.Scanner;
// tulakorn sawangmuang
//630510582
//section-001
/**
 *
 * @author ACER
 */
class Message{
    private String text;
    private String newtext;
    
    public void setText(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input text: ");
        text = sc.nextLine();
    }
    public void setNewtext(){
        String mesEncode = new String();
        char[] partsMessage = text.toCharArray();
        int arrayLength = partsMessage.length;
        int finalArrLength = partsMessage.length; 
        if (finalArrLength%3 != 0){ 
            while (finalArrLength%3 != 0){
                finalArrLength += 1;
            }
        }
        int j = 0; 
        for (int i=0;i<arrayLength;i++){
            int asciiIndex = partsMessage[i];
            asciiIndex += 3; 
            char mes = (char)asciiIndex;
            String lowMes = Character.toString(mes); 
            String upMes = lowMes.toUpperCase(); 
            mesEncode += upMes; 
            j += 1;
            if (j == 3){ 
                mesEncode += " ";
                j = 0;
            }
        }
        int remaininglength = finalArrLength - arrayLength; 
        for (int i=0;i<remaininglength;i++){ 
            mesEncode += "#";
        }
        newtext = mesEncode;
    }       
    
    public void showResult(){
        System.out.println(newtext);
    }         
}


public class Lab04_2_630510582 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Message mes = new Message();
        mes.setText();
        mes.setNewtext();
        mes.showResult();
    }    
}
