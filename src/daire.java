package src;

import java.util.Scanner ;

public class daire {
    
    /*
    Daire alanı ve çevresini hesaplayan program
    */
   public static void main (String [] args) {

       int r;

       int aci;
       double toplamAlan;

       double pi=3.14 ;

       Scanner inp = new Scanner (System.in);

       System.out.println("Yarıçap uzunluğunu giriniz :");
       r = inp.nextInt();

       System.out.println("Merkezi açının ölçünü giriniz :");
       aci = inp.nextInt();


       toplamAlan = (pi*(r*r)*aci)/360 ;
       System.out.println("Dairenin dilimin alanı :" + toplamAlan);

   }
   
    
}
