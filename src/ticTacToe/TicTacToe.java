package ticTacToe;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        while (true) {
            System.out.println("Player " + currentPlayer + ", enter a number (1-9) to choose a spot:");
            int spot = getUserInput("Spot: ");

            if (isValidMove(spot)) {
                int row = (spot - 1) / 3;
                int col = (spot - 1) % 3;
                board[row][col] = currentPlayer;
                printBoard();
                if (checkWin()) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                }
                togglePlayer();
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getUserInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static boolean isValidMove(int spot) {
        int row = (spot - 1) / 3;
        int col = (spot - 1) % 3;
        return spot >= 1 && spot <= 9 && board[row][col] == '-';
    }

    private static void togglePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
        if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
        return true;
        }
        if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
        return true;
        }
        }
        return (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) ||
        (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]);
        }

    }

