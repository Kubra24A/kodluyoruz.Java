package HackerRank;

import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;


public class denc {
    
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int lex =0;
        int k = game.length;
        Stack<Integer>canLeapFrom= new Stack<>();
        while(!canLeapFrom.empty() || lex<k){
            if(lex+leap>=k || lex+1>=k){
                return true;
            }else{
                if(game[lex+leap]==0 && game[lex+1]==0){
                    canLeapFrom.push(lex);
                    lex++;
                } else if(game[lex+1]==0){
                    lex++;
                } else if (game[lex+leap]==0){
                    lex+=leap;
                } else if(!canLeapFrom.empty()){
                    lex = canLeapFrom.pop()+leap;
                }else{
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}