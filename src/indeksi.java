package src;
 
import java.util.Scanner ;

public class indeksi {

    public static void main (String[] args){

        double h;
        double W, indeksi ;

     Scanner inp = new Scanner(System.in);
     
     System.out.println("Lütfen boyunuzu(metre cinsinden) giriniz :");
     h = inp.nextDouble();
     System.out.println("Lütfen kilonuzu giriniz :");
     W = inp.nextDouble();
     

    indeksi = (h / (W*W) );
     
    System.out.println("Vücut kitle indeksiniz17 : " + indeksi );










    }
     
}
