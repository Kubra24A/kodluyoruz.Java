package src.src;

import java.util.Scanner;

public class EbobEkok {
    public static void main (String[] args){

      
        boolean a = false;
        Scanner inp = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz :");
        int n1 = inp.nextInt();

        System.out.println("n2 sayısını giriniz :");
        int n2 = inp.nextInt();
        int ebob = 1 ;
        int ekok = 1 ;

        if (n1 <= 0 || n2 <= 0) {
            System.out.println("Pozitif sayılar giriniz :");
        } else {
            a = true;
        }
         
        while (!a){
            if (n2 < n1) {
                int k = n2;
                n2 = n1;
                n1 = k;}  
                
        }
        int i = n1;
        while (i >= 1){
            if ((n1 % i == 0) && (n2 % i == 0)){
                System.out.println("ebob :" + i);
                break;
            }else {
                i--;
            }
        }
        int p = n2;
        while (p >= (n1 * n2) / n1){
            if ((p % n1 == 0) && (p % n2 == 0)){
                System.out.println("ekok :" + p);
                break;
            } else {
                p++;
            }
        }

          


    }
    
}
