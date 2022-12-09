package HackerRank;

import java.util.Scanner;
import java.util.Arrays;

public class rank {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int scott = scan.nextInt();
    
        int[] array = new int[scott];
        for(int i = 0; i < scott; i++) {
            array[i] = scan.nextInt();
        }
        
        int lex = 0;
        for(int k = 0; k < array.length; k++) {
            int curren = 0;
            for(int j = k; j < array.length; j++) {
                curren+= array[j];
                if(curren< 0) lex++;
            }
        }
        System.out.println(lex);
    }
}
