package src.src;

import java.util.Scanner;

public class ÇiftSayi {
    public static void main (String[] args){

        int k , ort, bolme =-1, hepsi=0 ;
        
         Scanner input  = new Scanner(System.in);

         System.out.println("Sayı giriniz :");
         k = input.nextInt();

         for(int i=1 ; i<=k ; i++){
            if(i%3==0 && i%4==0){
              System.out.println(i);
              hepsi+= i;
              bolme++;
            }
         } System.out.println(hepsi/bolme);
    }
    
}
