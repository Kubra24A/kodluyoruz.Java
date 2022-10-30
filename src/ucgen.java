package src;
  
import java.util.Scanner;

public class ucgen {

        public static void main (String [] args) {
    
            double a, b, c ;
            double field, perimeter, u ;
            System.out.println("Welcome to the Hypotenus Locator Program in the Right Triangle !");
            Scanner inp1 = new Scanner(System.in) ;
    
            System.out.println("Enter the edge length A :");
             a = inp1.nextDouble();
            System.out.println("Enter the edge length B :");
             b = inp1.nextDouble();
            System.out.println("Enter the edge length C :");
             c = inp1.nextDouble() ;
    
            u = (a + b + c) / 2 ;
            field = Math.sqrt(u*(u-a) * (u-b) * (u-c));
            
            System.out.println("Area of the perimeter :" + field);
    
            perimeter = a + b + c ;
            System.out.println("Perimeter of triangle :" + perimeter);
    
    
        }
    }
    
