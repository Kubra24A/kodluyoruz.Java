  package src.Odevler;
   
  import java.util.Arrays;
  import java.util.Scanner;

   public class Again {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20, -13, 88,2,-13,5,7};
        System.out.println("Dizi :" +Arrays.toString(list));
        int[] number = new int[list.length];
        System.out.println("Tekrar Sayıları" );

        for(int k = 0 ; k<list.length; k++){
            number[k]=1;
            for(int m =k+1; m<list.length; m++){
                if((list[k]==list[m])){
                    number[k]++;
                }
            }
        }
        for (int k = 0; k < list.length; k++) {
            for (int m = k+1; m< list.length; m++) {
                if ((list[k] == list[m])) {
                    list[m] = 0;
                }
            }
        }

        for(int k=0 ;k<list.length; k++){
            if(number[k]>1){
                if(list[k] !=0){
                    System.out.println(list[k]+" "+"sayısı"+" " +number[k]+" "+"kere tekrar edildi.");
                }
            }else if(number[k]==1){
                if(list[k] !=0){
                    System.out.println(list[k]+" "+"sayısı"+" " +number[k]+" "+"kere tekrar edildi.");
                }
            }
        }
    }
    
   }
   