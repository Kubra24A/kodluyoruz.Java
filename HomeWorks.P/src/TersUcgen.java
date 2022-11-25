package src.src;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args){

        Scanner key = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = key.nextInt();
         
        for(int i=n-1; i>=0; i--){
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
