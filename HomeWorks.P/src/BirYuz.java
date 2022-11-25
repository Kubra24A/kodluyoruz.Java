package src.src;

import java.util.Scanner;

public class BirYuz {
   public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int number = 0 ;

    for(int i = 2 ; i<100 ; i++){
        for(int k =2; k<i ; k++){
            if(i%k==0){
                number++;
            }
        }
        if(number==0){
            System.out.println(i+"");
        }
        number=0;
    }
   }
    
}
