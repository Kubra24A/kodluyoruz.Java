package src.Odevler;


import java.util.Arrays;
import java.util.Scanner;

import javax.management.ValueExp;

public class TekrarÇift {
    
    public static boolean isWin (int [] arr, int Value) {
        boolean duplicate = false;
         for (int j : arr){
            if(j==Value){
                duplicate = true;
                break;
            }
         }
         return duplicate;
    }

    

    /**
     * @param arr verilen elemanın ilave edileceği dizi
     * @param Value ilave edilecek eleman
     * @return int[]
     */

    public static int[] addValue (int [] arr, int Value){
         int[] result = new int[arr.length + 1];
        int k = 0;
        for (int each : arr) {
            result[k++] = each;
        }
        result[k] = Value;
        return result;
    }

    public static void main(String[] args) {
        int [] list ={3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 10, 2,5,8,21,1,8,7};
        System.out.println("Dizi :" +Arrays.toString(list));
        int[] num = new int[list.length];
        
        for (int k= 0; k < list.length; k++){
            int Again = list [k];
            for(int n = k + 1 ; n<list.length; n++){
                if((k != n) && (list[k]==list[n])){
                    if(list[k]%2==0){
                        if (!isWin(num, list[k])) {
                            num = addValue(num, Again );
                        } if(list[k]%1==0){
                            if (!isWin(num, list[n])) {
                                num = addValue(num, Again );
                            } 
                        }
                        break;
                    }
                    

                    }
                } 
            }
           System.out.println("Tekrar eden çift sayılar :");
           System.out.println("Tekrar eden tek sayılar :");
           for (int value : num) {
            if (value != 0) {
                System.out.println(value);

            }
        }
        }

    
       
     }
    

