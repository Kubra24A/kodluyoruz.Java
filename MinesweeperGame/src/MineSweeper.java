import java.util.Scanner;
import  java.util.Arrays;
import  java.util.Random;
import java.util.Objects;

public class MineSweeper {
    Scanner scanner = new Scanner(System.in);
    int rowNumber;              // Kullanıcıdan satır sayısı aldık. MineSweeper metotu için
    int columnNumber;           // Kullanıcıdan sütun sayısı aldık. MineSweeper metotu için
    String [][] mineMap;        // Mayınları atayacağım harita.
    String [][] gameMap;        // Kullanıcının oynacağı harita.
    int mineNumber;             // Mayın Sayısı



    MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.mineMap = new String [rowNumber][columnNumber];
        this.gameMap = new String [rowNumber][columnNumber];
        this.mineNumber = (rowNumber * columnNumber) / 4;
    }

    void printMap() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(this.gameMap[i][j] + " ");
            }
            System.out.println();
        }
    }
    void gameMap(){
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                this.gameMap[i][j] = "✈";
            }
        }
    }
    public void plantedMine() {
        Random rand = new Random();
        for(int i = 0; i < mineNumber; i++){
            int randomRow = rand.nextInt(rowNumber);
            int randomColumn = rand.nextInt(columnNumber);

            if( this.mineMap[randomRow][randomColumn] != "☠") {
                this.mineMap[randomRow][randomColumn] = "☠";
            }else {
                i--;
            }
        }


        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < columnNumber; j++){
                if(this.mineMap[i][j] != "☠"){
                    this.mineMap[i][j] = "✈";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }


    void printMineMap(){
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < columnNumber; j++){
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }
    }

    void run(){
        int totalMove = (rowNumber * columnNumber) - mineNumber;
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
            int row = input.nextInt();

            System.out.print("Enter Column : ");
            int col = input.nextInt();


            if ((row < 0 || row >= rowNumber) || (col < 0 || col >= columnNumber)) {
                System.out.println("You Entered Incorrectly, Please enter the correct index number!");
                continue;
            } else {
                if (this.mineMap[row][col] == "☠") {
                    System.out.println("Game Over!!");
                    printMineMap();
                    break;
                }if( ! this.gameMap[row][col].equals("✈") ){
                    System.out.println("You've already made this move !");
                    continue;
                }else{
                    int minusRow = (row - 1), plusRow = (row + 1);
                    int minusCol = (col - 1), plusCol = (col + 1);

                    if ( (minusRow < 0) || (minusCol < 0) ){
                        minusRow = 0;
                        minusCol = 0;
                    }
                    if( (plusRow >= rowNumber) || (plusCol >= columnNumber) ){
                        plusRow = row;
                        plusCol = col;
                    }
                    for(int i = minusRow; i <= plusRow; i++){
                        for (int j = minusCol; j<= plusCol; j++){
                            if(this.mineMap[i][j] == "☠"){
                                mineCounter++;
                            }
                        }
                    }
                    String convertMineCounter = String.valueOf(mineCounter);
                    this.gameMap[row][col] = convertMineCounter;
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
