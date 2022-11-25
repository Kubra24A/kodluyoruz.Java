package src.src;

import java.util.Scanner;

public class Diamond {
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = keyboard.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= (2 * i + 1); l++) {
                System.out.print("*");
            }
            
            System.out.println(" ");
 
        }  

        //İkinci üçgen icin yukarıdaki işlemlerin tersi uyglanır.

        for (int i = n-1; i >=0 ; i--) {          
            for (int j = n-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            for (int l= 1; l <= (2 * i + 1); l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
         
        

    }
    
}
