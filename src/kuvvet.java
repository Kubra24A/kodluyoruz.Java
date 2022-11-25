package src.src;

import java.util.Scanner;

public class kuvvet {
    public static void main (String[] args){

        int k;
        int total=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sınır sayınızı giriniz :");
        k = scan.nextInt();
        
        System.out.println("Girmiş olduğunuz sayının 4'ün katları");
        for(int i=1 ; i <= k ; i*=4 ){
          System.out.println(":" +i);
          total+=i;
           ;
           }
           System.out.println("Girmiş olduğunuz sayının 5'in katları");
        for (int i= 1; i<=k; i*=5) {
            System.out.println(":" +i);
            total+=i;
            
        }
        System.out.println("Toplam :" +total); 
    }      
    
}
