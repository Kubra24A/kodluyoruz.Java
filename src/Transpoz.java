package src.Odevler;

 import java.util.Scanner;

public class Transpoz {
    public static void main(String[] args) {


        int[][] list={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Dizi :");
        for(int j=0; j<list.length; j++ ){
            for(int t=0; t<list.length; t++){
                System.out.println(list[j][t]);
            }
            System.out.println();
        }
        

        System.out.println("Transpozu :");
        for(int j=0 ; j<list.length; j++){
            for (int t=0; t<list.length; t++){
                System.out.println(list[j][t]);
            }
            System.out.println();
        }

    } 
    
    
}
