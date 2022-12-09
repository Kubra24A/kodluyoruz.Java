package src.Odevler;

 import java.util.Scanner;

public class Transpoz {
    public static void main(String[] args) {

        
    

        Scanner scan = new Scanner(System.in);
        System.out.println("Matrisin satır sayısını giriniz : ");
        int scott= scan.nextInt();
        System.out.println("Matrisin sütun sayısını giriniz : ");
        int kuba = scan.nextInt();
        int[][] matris = new int[scott][kuba];
        System.out.print("\n");
        for (int j = 0; j < scott; j++) {
            for (int t = 0; t < kuba; t++) {
                System.out.print((j + 1) + ". satir - " + (t + 1) + ". sutun : ");
                matris[j][t] = scan.nextInt();
            }
            System.out.print("\n");
        }
        System.out.println("Matris :");
        for (int j = 0; j < scott; j++) {
            for (int t = 0; t< kuba; t++) {
                System.out.print("\t" + matris[j][t]);
            }
            System.out.print("\n");
        }
        System.out.println("Transpoze :");
        for (int j = 0; j < scott; j++) {
            for (int t = 0; t <= kuba; t++) {
                System.out.print("\t" + matris[t][j]);
            }
            System.out.print("\n");
        }
    


    }
    
    
}
