package src.src;

import java.util.Scanner;

public class Arms {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in) ;
        System.out.println("Enter number  :");
        int n = input.nextInt();
        int mainNo = n;
        int step = 0;
        int value;
        int Conclusion = 0;
 
        while (mainNo !=0) {
            mainNo /= 10 ;
            step++;
         }
        
         mainNo = n;
         while(mainNo !=0) {
            value = mainNo % 10 ;
            Conclusion += value;
            mainNo /= 10 ;
         }
        
         System.out.println("Total : " +Conclusion);

    }
    
}
