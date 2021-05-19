/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project6;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project6 {
//    question =
//    Suatu perusahaan memberikan komisi kepada para selesman dengan ketentuan sebagai berikut:
//a.    Bila salesman dapat menjual barang hingga Rp. 20.000 ,- , akan diberikan 
//      uang jasa sebesar Rp. 10.000 ditambah dengan uang komisi Rp. 10% dari 
//      pendapatan yang diperoleh hari itu.
//b.   Bila salesman dapat menjual barang diatas Rp. 20.000 ,- , 
//akan diberikan uang jasa sebesar Rp. 20.000 ditambah dengan uang komisi Rp. 
//15% dari pendapatan yang diperoleh hari itu.
//c.    Bila salesman dapat menjual barang diatas Rp. 50.000 ,- , akan diberikan uang jasa sebesar 
//        Rp. 30.000 ditambah dengan uang komisi Rp. 20% dari pendapatan yang diperoleh hari itu.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner(System.in);
    
    int pendapatan;
    double jasa = 0,komisi = 0;
    int totalPendapatan;
        System.out.println("Please Insert Your Salary.");
    
        
    pendapatan = scan.nextInt();
    
    if (pendapatan>=0 && pendapatan<=20000){
        jasa = 10000;
        komisi = 0.1*pendapatan;
        
                
        
    }
    else if (pendapatan<=50000){
        jasa = 20000;
        komisi = 0.15*pendapatan;
    }
    else if (pendapatan>50000){
        jasa = 30000;
        komisi = 0.2*pendapatan;
                
    } 
    totalPendapatan = (int)jasa + (int)komisi;
        System.out.println("besar jasa = "+(int)jasa);
        System.out.println("besar komisi = "+(int)komisi);
        System.out.println("total pendapatan = "+totalPendapatan);
            
        
        
   
    
    
    
            
    
    }
    
}
