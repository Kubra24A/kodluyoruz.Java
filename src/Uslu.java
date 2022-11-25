package src.src;

import java.util.Scanner;

public class Uslu {
   public static void main (String[] args){

    int k,c;
     Scanner scan = new Scanner(System.in);
     System.out.println("Üssü alınacak sayı :");
     k = scan.nextInt();
     System.out.println("Üs olacak sayı :");
     c = scan.nextInt();
     int total = 1;

     // 3 ^ 4 = 3 * 3 * 3 * 3

     // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

     for (int i=0; i<c; i++) {
        total *=k;
     }
     System.out.println("Cevap :" +total);
   }
    
}
