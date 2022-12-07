package src.Odevler;

import java.util.Arrays;
import java.util.Scanner;



public class MinMax {
    public static void main(String[] args) {

        
        
        Scanner scan = new Scanner(System.in);

        int[] list = {15,12,788,1,-1,-788,2,0};
        System.out.println("Dizi :" +Arrays.toString(list));
        int num;
        System.out.println("Girilen sayı:" );
        num = scan.nextInt();

        int min = list[1];
        int max = list [6];

        Arrays.sort(list);

        for( int n : list){
            if(n>min && n<num){
               min=n;
            }

            if(n<max && n>num){
                max=n;
            }
        }

        System.out.println("Girilen sayıdan en küçük sayı \t:" +min);
        System.out.println("Girilen sayıdan en büyük sayı \t:" +max);

    }
    
}
