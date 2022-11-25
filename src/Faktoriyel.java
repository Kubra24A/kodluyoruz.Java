package src.src;

import java.util.Scanner;

public class Faktoriyel {

    public static void main (String[] args) {

     // n! = 1*2*3*4*5*...*n
       
        Scanner scan = new Scanner(System.in);
        System.out.println("N faktöriyel sayısını giriniz :");
        int n = scan.nextInt();
        System.out.println("R faktöriyel sayısını giriniz :");
        int r = scan.nextInt();

        int total1=1, total2=1, total3=1, toplam, k=n-r;

        for (int i=1; i<=n; i++) {
            total1 *=i;
        }
        System.out.println("N sayısının faktöriyeli :" + total1);

        for(int t=1; t<=r; t++){
            total2*=t;
        }
        System.out.println("R sayısının faktöriyeli :" +total2);

        for(int s=1; s<=k; s++){
           total3*=s;
        }
        System.out.println("N-R faktöriyeli :" +total3);

        toplam = total1 / (total2*total3);
        System.out.println("Toplam : " +toplam);
    }
    
}
