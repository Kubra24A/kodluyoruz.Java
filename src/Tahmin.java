package src.src;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tahmin {

    
    static void Number(int x){

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        int number;

        while (right < 5) {
        System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } 
            }  else {
                isWrong = true;
                System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
            }
            continue; 
            
    
        }
               

        


    }    

            
                static int right=0;
                static int[] wrong = new int[5];
                boolean isWin = false;
                static boolean isWrong = false;
                int number;
          /**
         * @param selected
         * @param number
         * @param isWin
         */
        static void isNumber(int selected, int number, Boolean isWin){


            
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + number);
                isWin = true;
            
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
                    
                
            if (!isWin) {
                System.out.println("Kaybettiniz ! ");
                if (!isWrong) {
                    System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
                }
            }
    
        }
          
       


       
     
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100);
        //int number = (int) (Math.random() * 100);
        Number(number);
        isNumber(number, number, null);


       
    }
        
    
}
