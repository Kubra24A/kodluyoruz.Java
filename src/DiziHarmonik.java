package src.Odevler;

public class DiziHarmonik {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5};
        double num = 0;
         
        for(int k = 0; k <number.length; k++ ){
            num+= 1.0/number[k];
        }

        double Harmonic = number.length/num;

        System.out.println(Harmonic);
    }
    
}
