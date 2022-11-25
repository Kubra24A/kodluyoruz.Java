package src.src;

import java.util.Scanner;


public class TekSayi {
    public static void main (String[] args) {

        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz */
     
        int d ;
        int total = 0;
        
        Scanner scan = new Scanner(System.in);

        do{
           System.out.println("Sayı giriniz :");
           d = scan.nextInt();
           if(d%2==0 && d%4==0){
            total+=d;
           }
        } while (d%2==0);
        System.out.println("Toplam :" + total);
    }  
}
