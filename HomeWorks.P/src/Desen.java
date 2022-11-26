package src.Odevler;

import java.util.Scanner;;

public class Desen {

    static void desenMethot(int a, int b, int c){

        if(a>0 && c==0){
            System.out.println(a+"");
            a-=5;
            desenMethot(a, b, 0);
        } else if(a<=0 ){
            System.out.println(a+"");
            a+=5;
        } else if(a>0 && a<=b && c==1){
            System.out.println(a+"");
            a+=5;
            desenMethot(a, b, 1);
        }

    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        int c = inp.nextInt();

        desenMethot(c, c, 0);


        
    }

    
}
