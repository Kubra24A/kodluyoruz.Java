package src.Odevler;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Dimension {
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Dizinin boyutu n :");
        int magic = inp.nextInt();
        int list [] = new int[magic];
        System.out.println("Dizinin elemanlarını giriniz :");

        for(int i = 1 ; i<magic; i++){
            System.out.println(i+". Eleman :");
            list [i] = inp.nextInt();
        }

        Arrays.sort(list);
        System.out.println("Küçükten büyüğe :" +Arrays.toString(list));
    }

    
}
