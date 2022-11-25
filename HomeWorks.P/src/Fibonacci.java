package src.src;

import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){

        int a=0;
        int b=1;
        int c,d;

        Scanner scan = new Scanner(System.in) ;
        System.out.println("Fibonacci serisinin sayısını giriniz :");
        d = scan.nextInt();

        for (int i=2; i<=d; i++){
            c=a+b;
            System.out.println("," +c);
            a=b;
            b=c;
            System.out.println("");

        }
    }
    
}
