package src;

import java.util.Scanner;

public class Burc {

    public static void main (String [] args) {
     
        int ay, gun ;

        Scanner inp = new Scanner (System.in);
        System.out.println("Doğduğunuz ay :");
        ay = inp.nextInt();

        System.out.println("Doğduğunuz gün :");
        gun = inp.nextInt();

       if (ay <= 12 && ay >=1) {
         if (ay == 1) {
            if(gun >= 1 && gun < 31) {
                if(gun<=20){
                    System.out.println("Oğlak Burcu");
                }else {
                    System.out.println("Kova Burcu");
                }
            }
         }
       }
       if (ay == 2) {
        if(gun >= 1 && gun < 28) {
            if(gun<=17){
                System.out.println("Kova Burcu");
            }else {
                System.out.println("Balık Burcu");
            }
        }
     }
     if (ay == 3) {
        if(gun >= 1 && gun < 31) {
            if(gun<=12){
                System.out.println("Balık Burcu");
            }else {
                System.out.println("Koç Burcu");
            }
        }
     }
     if (ay == 4) {
        if(gun >= 1 && gun < 30) {
            if(gun<=22){
                System.out.println("Koç Burcu");
            }else {
                System.out.println("Boğa Burcu");
            }
        }
     }
     if (ay == 5) {
        if(gun >= 1 && gun < 31) {
            if(gun<=10){
                System.out.println("Boğa Burcu");
            }else {
                System.out.println("İkizler Burcu");
            }
        }
     }
     if (ay == 6) {
        if(gun >= 1 && gun < 30) {
            if(gun<=19){
                System.out.println("İkizler Burcu");
            }else {
                System.out.println("Yengeç Burcu");
            }
        }
     }
     if (ay == 7) {
        if(gun >= 1 && gun < 31) {
            if(gun<=21){
                System.out.println("Yengeç Burcu");
            }else {
                System.out.println("Aslan Burcu");
            }
        }
     }
     if (ay == 8) {
        if(gun >= 1 && gun < 30) {
            if(gun<=29){
                System.out.println("Aslan Burcu");
            }else {
                System.out.println("Başak Burcu");
            }
        }
     }
     if (ay == 9) {
        if(gun >= 1 && gun < 31) {
            if(gun<=16){
                System.out.println("Başak Burcu");
            }else {
                System.out.println("Terazi Burcu");
            }
        }
     }
     if (ay == 10) {
        if(gun >= 1 && gun < 30) {
            if(gun<=12){
                System.out.println("Terazi Burcu");
            }else {
                System.out.println("Akrep Burcu");
            }
        }
     }
     if (ay == 11) {
        if(gun >= 1 && gun < 31) {
            if(gun<=22){
                System.out.println("Akrep Burcu");
            }else {
                System.out.println("Yay Burcu");
            }
        }
     }
     if (ay == 12) {
        if(gun >= 1 && gun < 30 ) {
            if(gun<=23){
                System.out.println("Yay Burcu");
            }else {
                System.out.println("Oğlak Burcu");
            }
        }
     } 
    
     
    }
    
}
