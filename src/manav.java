package src;

import java.util.Scanner ;

public class manav {

    public static void main (String[] args) {
    
    double pear = 8.75 ;
    double apple = 5.50 ;
    double cherry = 9.00;
    double tomato =7.70;
    double banana =6.20;
    double parsley =4.50;
    Double total, amount, kg;
    
    Scanner inp = new Scanner (System.in);

    System.out.println("How many kilograms is a pear? :");
    pear = inp.nextDouble();
    System.out.println("How many kilograms is a apple? :");
    apple = inp.nextDouble();
    System.out.println("How many kilograms is a cherry? : ");
    cherry = inp.nextDouble();
    System.out.println("How many kilograms is a tomato?  :");
    tomato = inp.nextDouble();
    System.out.println("How many kilograms is a banana? :");
    banana = inp.nextDouble();
    System.out.println("How many kilograms is a parsley? ");
    parsley = inp.nextDouble() ;
    
    total = (8.75+5.50+9.00+7.70+6.20+4.50);

    

    System.out.println("Your total amount :" + total);


    }
    
}
