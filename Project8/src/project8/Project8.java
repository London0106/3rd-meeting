/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project8;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    
    
    String namaBulan;
    int Tanggal;
        System.out.println("Insert Your BirthMonth.");
        namaBulan = scan.nextLine();
        System.out.println("Insert your BirthDate.");
        Tanggal = scan.nextInt();
        
        if (Tanggal>31){
            System.out.println("Wrong BirthDate.");
                }
        
        
        else if(namaBulan.equalsIgnoreCase("january")== false){
            System.out.println("Wrong BirthMonth");
            
        }
        
        else if(namaBulan.equalsIgnoreCase("february")== false){
            System.out.println("Wrong BirthMonth");
            
        }
        
        else if(namaBulan.equalsIgnoreCase("march")== false){
            System.out.println("Wrong BirthMonth");
            
        }
        
        else if(namaBulan.equalsIgnoreCase("april")== false){
            System.out.println("Wrong BirthMonth");
            
        }
        
        else if(namaBulan.equalsIgnoreCase("june")== false){
            System.out.println("Wrong BirthMonth");
            
        }
        
        else if(namaBulan.equalsIgnoreCase("july")== false){
            System.out.println("Wrong BirthMonth");
            
        }
        
        else if(namaBulan.equalsIgnoreCase("august")== false){
            System.out.println("Wrong BirthMonth");
            
        } 
        
        else if((Tanggal>=21 && namaBulan.equalsIgnoreCase("march") ) || (Tanggal<=19 && namaBulan.equalsIgnoreCase("april") )){
            System.out.println("Your Zodiac is Aries.");
           
        }
        else if((Tanggal>=20 && namaBulan.equalsIgnoreCase("april") ) || (Tanggal<=20 && namaBulan.equalsIgnoreCase("may") )){
            System.out.println("Your Zodiac is Taurus.");
        }
        else if((Tanggal>=21 && namaBulan.equalsIgnoreCase("may") ) || (Tanggal<=20 && namaBulan.equalsIgnoreCase("june") )){
            System.out.println("Your Zodiac is Gemini.");
        } 
        else if((Tanggal>=21 && namaBulan.equalsIgnoreCase("june") ) || (Tanggal<=22 && namaBulan.equalsIgnoreCase("july") )){
            System.out.println("Your Zodiac is Cancer.");
        }
        else if((Tanggal>=23 && namaBulan.equalsIgnoreCase("july") ) || (Tanggal<=22 && namaBulan.equalsIgnoreCase("august") )){
            System.out.println("Your Zodiac is Leo.");
        }
        else if((Tanggal>=23 && namaBulan.equalsIgnoreCase("august") ) || (Tanggal<=22 && namaBulan.equalsIgnoreCase("september") )){
            System.out.println("Your Zodiac is Virgo.");
        } 
        else if((Tanggal>=23 && namaBulan.equalsIgnoreCase("september") ) || (Tanggal<=23 && namaBulan.equalsIgnoreCase("october") )){
            System.out.println("Your Zodiac is Libra.");
        } 
        else if((Tanggal>=23 && namaBulan.equalsIgnoreCase("october") ) || (Tanggal<=21 && namaBulan.equalsIgnoreCase("november") )){
            System.out.println("Your Zodiac is Scorpio.");
        }
        else if((Tanggal>=22 && namaBulan.equalsIgnoreCase("november") ) || (Tanggal<=21 && namaBulan.equalsIgnoreCase("december") )){
            System.out.println("Your Zodiac is Sagitarius.");
        } 
        else if((Tanggal>=22 && namaBulan.equalsIgnoreCase("december") ) || (Tanggal<=19 && namaBulan.equalsIgnoreCase("january") )){
            System.out.println("Your Zodiac is Capricorn.");
        }
        else if((Tanggal>=20 && namaBulan.equalsIgnoreCase("january") ) || (Tanggal<=18 && namaBulan.equalsIgnoreCase("february") )){
            System.out.println("Your Zodiac is Aquarius.");
        }
        else if((Tanggal>=19 && namaBulan.equalsIgnoreCase("february") ) || (Tanggal<=20 && namaBulan.equalsIgnoreCase("march") )){
            System.out.println("Your Zodiac is Pisces.");
       
        }
        
        } 
    }
