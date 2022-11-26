package src.Odevler;

import java.util.Scanner;

public class UsHesap {

    /* Recursive Metotlar ile Üslü Sayı Hesaplama
  Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

S   enaryo

         Taban değeri giriniz :2
         Üs değerini giriniz : 0
         Sonuç : 1
         Taban değeri giriniz : 2
         Üs değerini giriniz : 3
         Sonuç : 8
         Taban değeri giriniz : 5
         Üs değerini giriniz : 3
         Sonuç : 125*/

         static int z,exp,result=1;

         static int usHesap (int x) {

            int result=1;
            Scanner scan = new Scanner(System.in);
            System.out.println("Değer giriniz :");
            int z = scan.nextInt();
            System.out.println("Üs değeri giriniz :");
            int exp =scan.nextInt();

            for(int i=0; i<exp ; i++){
                result*=z;
            }

            return result;
            
         }

          public static void main(String[] args) {

            System.out.println("Sonuç :" +usHesap(z));
            
         }
    
}
