package src;

import java.util.Scanner;

public class Taksimetre {
    public static void main (String [] args) {

        double yol,toplam, KMbas = 2.20 ;
        double acilis = 10.0 ;
        

     Scanner inp = new Scanner (System.in) ;
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
     
        yol = inp.nextDouble ();

        toplam = (yol*KMbas) + acilis ;

        boolean tutar = (toplam<20) ;

        double miktar = (tutar) ? 20 : toplam ;
        System.out.println("Toplam tutar:" + miktar);





    }

    
}
