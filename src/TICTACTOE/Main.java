package TICTACTOE;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create list with tic positions
        String[] ticPositions = {" ", " ", " ", " ", " ", " ", " ", " ", " "};
        printBoard(ticPositions);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // Player 1
            int position;
            while (true) {
                System.out.println("Player 1, enter your position: ");
                position = scanner.nextInt()-1;
                if (ticPositions[position].equals(" ")) {
                    ticPositions[position] = "X";
                    printBoard(ticPositions);
                    break;
                } else {
                    System.out.println("Invalid position, try again!");
                    continue;
                }
            }
            // Check if player 1 wins
            if (gameLogic(ticPositions)==1) {
                System.out.println("Congrats!!");
                break;
            }
            if (gameLogic(ticPositions)==3) {
                System.out.println("Draw!");
                break;
            }
            // Player 2
            while (true) {
                System.out.println("Player 2, enter your position: ");
                position = scanner.nextInt()-1;
                if (ticPositions[position].equals(" ")) {
                    ticPositions[position] = "O";
                    printBoard(ticPositions);
                    break;
                } else {
                    System.out.println("Invalid position, try again!");
                    continue;
                }
            }
            // Check if player 2 wins
            if (gameLogic(ticPositions)==2) {
                System.out.println("Congrats!!");
                break;
            }
            if (gameLogic(ticPositions)==3) {
                System.out.println("Draw!");
                break;
            } else {
                continue;
            }
        }
        scanner.close();
    }
    public static void printBoard(String[] ticPositions) {
        System.out.println(ticPositions[0]+"|"+ticPositions[1] +  "|" +ticPositions[2]);
        System.out.println("-----");
        System.out.println(ticPositions[3]+"|"+ticPositions[4] +  "|" +ticPositions[5]);
        System.out.println("-----");
        System.out.println(ticPositions[6]+"|"+ticPositions[7] +  "|" +ticPositions[8]);
    }
    public static Integer gameLogic(String[] ticPositions) {
        if (ticPositions[0] == "X" && ticPositions[1] == "X" && ticPositions[2] == "X") {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (ticPositions[3] == "X" && ticPositions[4] == "X" && ticPositions[5] == "X") {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (ticPositions[6] == "X" && ticPositions[7] == "X" && ticPositions[8] == "X") {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (ticPositions[0] == "X" && ticPositions[3] == "X" && ticPositions[6] == "X") {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (ticPositions[1] == "X" && ticPositions[4] == "X" && ticPositions[7] == "X") {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (ticPositions[2] == "X" && ticPositions[5] == "X" && ticPositions[8] == "X") {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (ticPositions[0] == "X" && ticPositions[4] == "X" && ticPositions[8] == "X") {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (ticPositions[2] == "X" && ticPositions[4] == "X" && ticPositions[6] == "X") {
            System.out.println("Player 1 wins!");
            return 1;
        } else if (ticPositions[0] == "O" && ticPositions[1] == "O" && ticPositions[2] =="O") {
            System.out.println("Player 2 wins!");
            return 2;
        }
        else if (ticPositions[3] == "O" && ticPositions[4] == "O" && ticPositions[5] =="O") {
            System.out.println("Player 2 wins!");
            return 2;
        }
        else if (ticPositions[6] == "O" && ticPositions[7] == "O" && ticPositions[8] =="O") {
            System.out.println("Player 2 wins!");
            return 2;
        }
        else if (ticPositions[0] == "O" && ticPositions[3] == "O" && ticPositions[6] =="O") {
            System.out.println("Player 2 wins!");
            return 2;
        }
        else if (ticPositions[1] == "O" && ticPositions[4] == "O" && ticPositions[7] =="O") {
            System.out.println("Player 2 wins!");
            return 2;
        }
        else if (ticPositions[2] == "O" && ticPositions[5] == "O" && ticPositions[8] =="O") {
            System.out.println("Player 2 wins!");
            return 2;
        }
        else if (ticPositions[0] == "O" && ticPositions[4] == "O" && ticPositions[8] =="O") {
            System.out.println("Player 2 wins!");
            return 2;
        }
        else if (ticPositions[2] == "O" && ticPositions[4] == "O" && ticPositions[6] =="O") {
            System.out.println("Player 2 wins!");
            return 2;
        }
        else if (ticPositions[0] != " " && ticPositions[1] != " " && ticPositions[2] != " " && ticPositions[3] != " " && ticPositions[4] != " " && ticPositions[5] != " " && ticPositions[6] != " " && ticPositions[7] != " " && ticPositions[8] != " ") {
            return 3;
        }
        else {
            return 0;
        }
    }
}
