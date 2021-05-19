/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project4;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project4 {
//       saya ingin untuk menentukan apakah bilangan yang diinputkan itu genap atau ganjil .
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan = new Scanner(System.in);
       
       int bilangan;
        System.out.println("Insert Your Value.");
        bilangan = scan.nextInt();
        
        if (bilangan%2==0){
            System.out.println("Ini adalah Genap.");}
            else if(bilangan%2!=0){
            System.out.println("Ini adalah Ganjil.");
                    
                    }
                 
                    
        }
        
        
       
       
    }
    
}
