/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project5;
import java.util.Scanner;
/**
 *
 * @author London
 */
public class Project5 {
//    question= saya ingin mencari tahu nama bulan berdasarkan kode bulan
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    
    int code;
        System.out.println("Insert Your Code Month");
    code = scan.nextInt();
    
    if (code==1){
        System.out.println("January");
    
    
    }
    else if (code==2){
        System.out.println("February");}
    
    else if (code==3){
        System.out.println("March");}
    
    else if (code==4){
        System.out.println("April");
        
        
    }
    else if (code==5){
        System.out.println("May");
    }
    else if (code==6){
        System.out.println("June");
    }
    else if (code==7){
        System.out.println("July");
    }
    else if (code==8){
        System.out.println("August");
    }
    else if (code==9){
        System.out.println("September");
    }
    else if (code==10){
        System.out.println("October");
    }
    else if (code==11){
        System.out.println("November");
    }
    else if (code==12){
        System.out.println("December");
    
    
    }
    else if (code>12){
        System.out.println("Wrong Code.");
    }
    
    }
    }
    
}
