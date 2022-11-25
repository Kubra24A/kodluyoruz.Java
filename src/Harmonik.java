package src.src;

import java.util.Scanner;

public class Harmonik {
    public static void main (String[] args) {

       // Harmonik seri formülü : 1 + (1/2) + (1/3) + (1/4) + (1/n)

        Scanner inp = new Scanner(System.in);
        System.out.println("N sayısını giriniz :");
        int n = inp.nextInt();
        double Total = 0.0, j=1;
        
        /*for(int i = 1 ; i<=n ; i++) {
            result += (1/i);

        }*/

         while (j<=n) {
            Total += 1.0/j;
            j++;
         }
         System.out.println(Total);
    }
  
    
}
