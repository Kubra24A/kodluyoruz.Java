package src;

import java.util.Scanner ;

import javax.xml.transform.Source;

public class calculator {

    public static void main (String [] args) {

      int no1, no2, select ;

        Scanner inp = new Scanner (System.in) ;
        System.out.println("Enter the first number :");
        no1 = inp.nextInt();
        System.out.println("Enter the second number");
        no2 = inp.nextInt();

        System.out.println("no1-collection\no2-extraction\no3-multiplication\n04-division");
        System.out.println("Seçiniz :");
        select = inp.nextInt();

        switch (select) {
            case 1 :
            System.out.println("collection :" +(no1+no2));
            break;
            case 2 :
            System.out.println("extraction :" +(no1-no2));
            break;
            case 3:
            System.out.println("multiplication :" +(no1*no2));
            break;
            case 4 :
            System.out.println("division :" + (no1/no2));
            break;
            

        }

    
    }
    
}
