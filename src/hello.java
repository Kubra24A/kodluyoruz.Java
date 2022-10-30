package src;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

       int k;
       Scanner input = new Scanner(System.in);
       System.out.print("K sayısını giriniz");
       k = input.nextInt();
       System.out.println(k);

        int kisakenar = 10, uzunkenar = 55;
        int alan = kisakenar * uzunkenar;
        int cevre = 5 * (kisakenar + uzunkenar);
        int yukseklik = 8 * (kisakenar + uzunkenar);

        short vShort = 1000;
        
        float vFloat = 4.77f;

        char c1 = 'P';
        char c2 = 'A';
        char c3 = 'G';

        String vKub = "Chocolate Brownie";
        
        int a = 8, b = 9;

        int c = 3, d = 6, e = 9;
        boolean kosul1 = c >= e + d ;
        boolean kosul2 = e > d ;
        boolean sonuc = kosul1 && kosul2 ;
        boolean sonuc2 = kosul1 || kosul2 ;



        System.out.println(cevre);
        System.out.println(alan);
        System.out.println(yukseklik);
        System.out.println(vFloat);
        System.out.println(vShort);
        System.out.println( c1 + c2 + c3);
        System.out.println(vKub);
        System.out.println(a*b);
        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(sonuc);
        System.out.println(sonuc2);
    }
    
}
