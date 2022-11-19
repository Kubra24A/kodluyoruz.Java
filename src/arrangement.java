package src;

import java.util.Scanner ;

public class arrangement {

    public static void main (String[] args) {

        int a,b,c;

        Scanner inp = new Scanner (System.in);

        System.out.println("1.sayı :");
        a = inp.nextInt();

        System.out.println("2. sayı :");
        b = inp.nextInt();

        System.out.println("3. sayı :");
        c = inp.nextInt();

        if ((a<b) && (a<c)) {
            if (b<c) {
                System.out.println("a<b<c");
            } else {
                System.out.println("a<b<c");
            }
        } else if ((b<a) && (b<c)){
            if (a<c) {
                System.out.println("b<a<c");
            } else {
                System.out.println("b<a<c");
            }
        } else if ((c<b) && (b<a)) {
            if (c<a) {
                System.out.println("c<b<a");
            } else {
                System.out.println("c<b<a");
            }
        }

    }

    
}
