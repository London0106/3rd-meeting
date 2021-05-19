/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project7 {
//    question : tentukan lah zodiak seseorang berdasarkan tanggal dan bulan . 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
    
    int zodiacBulan;
    int zodiacTanggal;
    
    
        System.out.println("Insert Your Birthdate.");
   
    zodiacTanggal = scan.nextInt();
    
        System.out.println("Insert Your Birthmonth");
    zodiacBulan = scan.nextInt();
    
    if((zodiacTanggal>=21 && zodiacBulan==3 ) || (zodiacTanggal <=19 && zodiacBulan==4)){
        System.out.println("Your Zodiac is Aries.");
    }
    else if((zodiacTanggal>=20 && zodiacBulan==4 ) || (zodiacTanggal <=20 && zodiacBulan==5)){
        System.out.println("Your Zodiac is Taurus.");
    }
    else if((zodiacTanggal>=21 && zodiacBulan==5 ) || (zodiacTanggal <=20 && zodiacBulan==6)){
        System.out.println("Your Zodiac is Gemini");
    }  
    else if((zodiacTanggal>=21 && zodiacBulan==6 ) || (zodiacTanggal <=22 && zodiacBulan==7)){
        System.out.println("Your Zodiac is Cancer");
    }
    else if((zodiacTanggal>=23 && zodiacBulan==7 ) || (zodiacTanggal <=22 && zodiacBulan==8)){
        System.out.println("Your Zodiac is Leo");
    }  
    else if((zodiacTanggal>=23 && zodiacBulan==8 ) || (zodiacTanggal <=22 && zodiacBulan==9)){
        System.out.println("Your Zodiac is Virgo");
    }     
    else if((zodiacTanggal>=23 && zodiacBulan==9 ) || (zodiacTanggal <=22 && zodiacBulan==10)){
        System.out.println("Your Zodiac is Libra");
    }
    else if((zodiacTanggal>=23 && zodiacBulan==10 ) || (zodiacTanggal <=21 && zodiacBulan==11)){
        System.out.println("Your Zodiac is Scorpio");
    }
    else if((zodiacTanggal>=22 && zodiacBulan==11 ) || (zodiacTanggal <=21 && zodiacBulan==12)){
        System.out.println("Your Zodiac is Sagitaurus");
    }
    else if((zodiacTanggal>=22 && zodiacBulan==12 ) || (zodiacTanggal <=19 && zodiacBulan==1)){
        System.out.println("Your Zodiac is Capricorn");
    }
    else if((zodiacTanggal>=20 && zodiacBulan==1 ) || (zodiacTanggal <=18 && zodiacBulan==2)){
        System.out.println("Your Zodiac is Aquarius");
    }
    else if((zodiacTanggal>=19 && zodiacBulan==2 ) || (zodiacTanggal <=20 && zodiacBulan==3)){
        System.out.println("Your Zodiac is Pisces");
    }
    
   
    
    
    
    
   
        
        
                
   
    }
    
}
