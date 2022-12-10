import java.util.Scanner;
import  java.util.Arrays;
import  java.util.Random;
import java.util.Objects;

public class MineSweeper {
    Scanner scanner = new Scanner(System.in);
    int rowNumber;
    int columnN;
    String [][] mineMap;
    String [][] gameMap;
    int mineN;



    MineSweeper(int rowNumber, int columnN) {
        this.rowNumber = rowNumber;
        this.columnN = columnN;
        this.mineMap = new String [rowNumber][columnN];
        this.gameMap = new String [rowNumber][columnN];
        this.mineN = (rowNumber * columnN) / 4;
    }

    void printMap() {
        for (int k = 0; k < rowNumber; k++) {
            for (int j = 0; j < columnN; j++) {
                System.out.print(this.gameMap[k][j] + " ");
            }
            System.out.println();
        }
    }
    void gameMap(){
        for (int k = 0; k < rowNumber; k++) {
            for (int j = 0; j < columnN; j++) {
                this.gameMap[k][j] = "✈";
            }
        }
    }
    public void plantedMine() {
        Random rands = new Random();
        for(int k = 0; k < mineN; k++){
            int randomRow = rands.nextInt(rowNumber);
            int randomColumn = rands.nextInt(columnN);

            if( this.mineMap[randomRow][randomColumn] != "☠") {
                this.mineMap[randomRow][randomColumn] = "☠";
            }else {
                k--;
            }
        }


        for(int k = 0; k < rowNumber; k++){
            for(int j = 0; j < columnN; j++){
                if(this.mineMap[k][j] != "☠"){
                    this.mineMap[k][j] = "✈";
                }
                System.out.print(this.mineMap[k][j] + " ");
            }
            System.out.println();
        }
    }


    void printMineMap(){
        for(int k = 0; k < rowNumber; k++){
            for(int j = 0; j < columnN; j++){
                System.out.print(this.mineMap[k][j] + " ");
            }
            System.out.println();
        }
    }

    void run(){
        int totalMove = (rowNumber * columnN) - mineN;
        Scanner input = new Scanner(System.in);

        gameMap();
        System.out.println("Location of Mines" +"✶");
        plantedMine();
        System.out.println("Welcome to Minesweeper!");

        while(totalMove > 0) {
            int mineCounter = 0;

            System.out.println("===========================");
            System.out.println("Your Right to Move Remaining: " + totalMove);
            printMap();

            System.out.print("Enter Row: ");
            int rowScot = input.nextInt();

            System.out.print("Enter Column : ");
            int colK = input.nextInt();


            if ((rowScot< 0 || rowScot >= rowNumber) || (colK < 0 || colK >= columnN)) {
                System.out.println("You Entered Incorrectly, Please enter the correct index number!");
                continue;
            } else {
                if (this.mineMap[rowScot][colK] == "☠") {
                    System.out.println("Game Over!!");
                    printMineMap();
                    break;
                }if( ! this.gameMap[rowScot][colK].equals("✈") ){
                    System.out.println("You've already made this move !");
                    continue;
                }else{
                    int mRow = (rowScot - 1), plusRow = (rowScot + 1);
                    int Colms = (colK - 1), plusCol = (colK+ 1);

                    if ( (mRow < 0) || (Colms < 0) ){
                        mRow = 0;
                        Colms = 0;
                    }
                    if( (plusRow >= rowNumber) || (plusCol >= columnN) ){
                        plusRow = rowScot;
                        plusCol = colK;
                    }
                    for(int i = mRow; i <= plusRow; i++){
                        for (int j = Colms; j<= plusCol; j++){
                            if(this.mineMap[i][j] == "☠"){
                                mineCounter++;
                            }
                        }
                    }
                    String convertMineCounter = String.valueOf(mineCounter);
                    this.gameMap[rowScot][colK] = convertMineCounter;
                    totalMove--;
                }
            }
        }
        if(totalMove == 0){
            System.out.println(" You Won the Game !");
            System.out.println("☺☺☺ ");
            printMap();
        } else {
            System.out.println("You lost the game!");
            System.out.println("☹☹☹");
        }
    }

}
