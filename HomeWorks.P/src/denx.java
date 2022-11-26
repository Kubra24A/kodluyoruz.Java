package src.Odevler;

import java.util.Scanner;

public class denx {

    static int i = 2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pNumber;
        do {
            System.out.print("Sayı giriniz: ");
            int num = scan.nextInt();
            if (num <= 0) break;
            System.out.println(num + " " + (asalSayi(num) ? "Asal sayıdır." : " Asal sayı değildir."));
            i = 2;
        } while (true);
    }

    public static boolean asalSayi(int x) {
        if (x == 1 || x == 2 || x == 3) return true; 
        if (x % i == 0) {
            return false;
        }
        i++;
        if (i < x) {
            return asalSayi(x); 
        } else {
            return true; 
        }
    }
    
}
