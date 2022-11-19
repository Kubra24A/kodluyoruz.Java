package src;

import java.util.Scanner;

public class temperature {

    public static void main (String[] args ) {

        int heat;

        System.out.println("Enter temperature value :");
        Scanner inp = new Scanner (System.in) ;
        heat = inp.nextInt();

        if (heat<5) {
            System.out.println("You can ski :");
        }else if (5 <= heat && heat <= 15){
            System.out.println("You can go to the cinema :");
        }else if (15 <= heat && heat <= 25){
            System.out.println("You can go on a picnic :");
        }
        else {
            System.out.println("You can go swimming :");
        }
        

    }
    
}
