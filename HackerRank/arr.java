package HackerRank;

import java.util.Scanner;

public class arr {
    public static void main(String[] args)
    {
        short x,y;
        Scanner input = new Scanner(System.in);
        x=input.nextShort();
        int[] arr = new int[x];
        for(y=0;y<arr.length;y++)
        {
            arr[y] = input.nextInt();
        }
        for ( int value: arr )
            System.out.println(value);
    }
    
}
