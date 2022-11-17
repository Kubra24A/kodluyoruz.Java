package src;

import java.util.Scanner;

public class geçme {

    public static void main (String[] args) {

        int Matematik, Fizik, Turkce, Kimya, Biyoloji, Tarih, Cografya;
        int derssayi=0, dersler=0;

        Scanner inp = new Scanner(System.in) ;
         
        System.out.println("Matematik notunuz :");
        Matematik = inp.nextInt();
        if (Matematik<0 || Matematik>100) {
            System.out.println("Lütfen 100 ile 0 arasında bir sayı giriniz.");
        } else {
            derssayi +=1;
            dersler += Matematik;
        }

        System.out.println("Fizik notunuz :");
        Fizik = inp.nextInt();
        if (Fizik<0 || Fizik>100) {
            System.out.println("Lütfen 100 ile 0 arasında bir sayı giriniz.");
        } else {
            derssayi +=1;
            dersler += Fizik;
        }

        System.out.println("Türkçe notunuz :");
        Turkce = inp.nextInt();
        if (Turkce<0 || Turkce>100) {
            System.out.println("Lütfen 100 ile 0 arasında bir sayı giriniz.");
        } else {
            derssayi +=1;
            dersler += Turkce;
        }

        System.out.println("Kimya notunuz :");
        Kimya = inp.nextInt();
        if (Kimya<0 || Kimya>100) {
            System.out.println("Lütfen 100 ile 0 arasında bir sayı giriniz.");
        } else {
            derssayi +=1;
            dersler += Kimya;
        }

        System.out.println("Biyoloji notunuz :");
        Biyoloji = inp.nextInt();
        if (Biyoloji<0 || Biyoloji>100) {
            System.out.println("Lütfen 100 ile 0 arasında bir sayı giriniz.");
        } else {
            derssayi +=1;
            dersler += Biyoloji;
        }

        System.out.println("Tarih notunuz :");
        Tarih = inp.nextInt();
        if (Tarih<0 || Tarih>100) {
            System.out.println("Lütfen 100 ile 0 arasında bir sayı giriniz.");
        } else {
            derssayi +=1;
            dersler += Tarih;
        }

        System.out.println("Çoğrafya notunuz :");
        Cografya = inp.nextInt();
        if (Cografya<0 || Cografya>100) {
            System.out.println("Lütfen 100 ile 0 arasında bir sayı giriniz.");
        } else {
            derssayi +=1;
            dersler += Cografya;
        }

       
        double avarage = (Matematik+Fizik+Turkce+Kimya+Biyoloji+Tarih+Cografya) / 7 ;

        if (avarage <=55 ) {
         System.out.println("Sınıfta kaldınız :");
         System.out.println("Ortalamanız :" + avarage);
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz :");
            System.out.println("Ortalamanız :" + avarage);
        }
        

        
    
        

    }
    
}
