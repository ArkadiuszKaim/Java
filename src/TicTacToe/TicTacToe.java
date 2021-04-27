package TicTacToe;

import java.util.*;

public class TicTacToe {
    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();

    public static void main(String[] args) {

        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', ' ', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your position (1-9): ");

            int playerPos = scanner.nextInt();
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)){
                System.out.println("Position taken, try again: ");
                playerPos = scanner.nextInt();
            }
            piecePlacement(playerPos, gameBoard, "Player");
            String result = checkWinner();
            if (result.length() > 0){
                printGameBoard(gameBoard);
                System.out.println(result);
                break;
            }

            System.out.println("Computers turn: ");

            int cpuPos = getCpuPos();
            while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                cpuPos = getCpuPos();
            }
            piecePlacement(cpuPos, gameBoard, "Cpu");
            printGameBoard(gameBoard);

            result = checkWinner();
            if (result.length() > 0){
                System.out.println(result);
                break;
            }
        }

    }

    private static int getCpuPos() {
        Random rand = new Random();
        return rand.nextInt(9) + 1;
    }

    private static void printGameBoard (char [][] gameBoard){
        for (char[] row : gameBoard){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    public static void piecePlacement(int pos, char[][]gameBoard, String user){

        char symbol = 'X';
        if (user.equals("Player")) {
            playerPositions.add(pos);
        } else if (user.equals("Cpu")){
            symbol = 'O';
            cpuPositions.add(pos);}

        switch (pos) {
            case 1 -> gameBoard[0][0] = symbol;
            case 2 -> gameBoard[0][2] = symbol;
            case 3 -> gameBoard[0][4] = symbol;
            case 4 -> gameBoard[2][0] = symbol;
            case 5 -> gameBoard[2][2] = symbol;
            case 6 -> gameBoard[2][4] = symbol;
            case 7 -> gameBoard[4][0] = symbol;
            case 8 -> gameBoard[4][2] = symbol;
            case 9 -> gameBoard[4][4] = symbol;
        }
    }
    public static String checkWinner(){
        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> middleRow = Arrays.asList(4,5,6);
        List<Integer> bottomRow = Arrays.asList(7,8,9);
        List<Integer> leftCol = Arrays.asList(1,4,7);
        List<Integer> middleCol = Arrays.asList(2,5,8);
        List<Integer> rightCol = Arrays.asList(3,6,9);
        List<Integer> cross1 = Arrays.asList(1,5,9);
        List<Integer> cross2 = Arrays.asList(3,5,7);

        List<List<Integer>> winningCond = new ArrayList<>();
        winningCond.add(topRow);
        winningCond.add(middleRow);
        winningCond.add(bottomRow);
        winningCond.add(leftCol);
        winningCond.add(middleCol);
        winningCond.add(rightCol);
        winningCond.add(cross1);
        winningCond.add(cross2);

        for(List<Integer> l : winningCond){
            if (playerPositions.containsAll(l)) {
                return ("Congratulation u have won!!!");
            }else if (cpuPositions.containsAll(l)){
                return ("U lost :<");
            }else if(playerPositions.size() + cpuPositions.size() == 9){
                return  ("Draw!!!");
            }
        }
        return "";

    }
}