package src;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {

        double kdvOran1 = 0.18 , kdvOran2 = 0.08 ; 

        double tutar;

        Scanner inp = new Scanner (System.in) ;
        System.out.print("Ücret tutarını giriniz : ");
        tutar = inp.nextDouble ();

       double kdvi ;
       kdvi = (tutar>1000)? tutar + (tutar*kdvOran2) : tutar + (tutar*kdvOran1) ;
       System.out.println("kdvi tutar : " + kdvi);


    }
    
}
