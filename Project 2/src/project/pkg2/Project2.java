/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg2;
import java.util.Scanner ;

/**
 *
 * @author London
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int totalBelanja ;
            Scanner scan = new Scanner (System.in);
            
            System.out.println("Insert Your Total Belanja");
            totalBelanja = scan.nextInt() ;
            
            if(totalBelanja>=100000){
              int biaya = totalBelanja - (totalBelanja*30/100);
                System.out.println("Total Belanja"+biaya);
            }else if(totalBelanja<100000){
                
                System.out.println("Kamu Tidak Mendapat Diskon, Karena Lebih Kecil Dari Pada 100000 Rp");
                
                
            }
    
    
    
    
    }
    
   
   
    
}
