package src.src;

import Learn.patika;

public class Seri {

    static int fib(int k){

        if(k==1||k==2){
            return 1;
        }
        return fib(k-1) + fib(k-2);
    }

    static void fibSeri(int magic){
        for(int p=1; p<=magic; p++){
            int i = fib(p);
            System.out.println(p+"");

        }
    }
    public static void main (String[] args) {

        System.out.println(fib(8));
        System.out.println("Fibonacci sayınız.");

        //1 1 2 3 5 8 13 21

        //f(1)=1
        //f(2)=1

        //f(n)= f(n-1)+f(n-2)
        //f(6)= f(5)+f(4)

    }
    
}
