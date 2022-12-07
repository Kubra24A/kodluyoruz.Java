package src.Odevler;

public class Byazi {

     public static void main(String[] args) {
        String[][] letter = new String[7][4];

        double med = Math.floor(letter.length/2.0);

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (j == 0 || j == letter[i].length-1) {
                    letter[i][j] = " * ";
                } else if (i == 0 || i == med || i==letter.length-1) {
                    letter[i][j] = " * ";
                }else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
    
            }    }
}
