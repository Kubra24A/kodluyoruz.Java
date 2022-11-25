package src.src;

import java.util.Scanner;

public class Great {
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        int total=0;
        int p = scan.nextInt();

        for(int i=1; i<p; i++){
           if(p%i==0){
            total +=i;
           }

        }

        if(total==p) {
              System.out.println(p+ "Mükemmel bir sayıdır.");
        } else{
            System.out.println(p+"Mükemmel sayı değildir.");
        }
    }
    
}
