package src.src;

import java.util.Scanner;

public class Minmax {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz :");
        int k = input.nextInt();
        int no, max=0, min=0;

        for(int i = 1; i<=k; i++ ) {
            System.out.println("Sayı giriniz :");
            no = input.nextInt();

            if(i==1){
                min=no;
                max=no;
            }
              if(no<min){
                min=no;
              } else if (no>max){
                max=no;
              }
        }
        System.out.println("En büyük sayı :" +max);
        System.out.println("En küçük sayı :" +min);
    }
    
}
