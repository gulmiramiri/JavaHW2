/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg9;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        char player = 'X';

        while (true) {
            printBoard(board);

            System.out.print("Enter a row (0, 1, or 2) for player " + player + ": ");
            int row = new Scanner(System.in).nextInt();

            System.out.print("Enter a column (0, 1, or 2) for player " + player + ": ");
            int col = new Scanner(System.in).nextInt();

            if (board[row][col] != ' ') {
                System.out.println("Cell is already occupied. Try again.");
                continue;
            }

            board[row][col] = player;

            if (isWinner(board, player)) {
                printBoard(board);
                System.out.println("Player " + player + " won");
                break;
            }

            if (isDraw(board)) {
                printBoard(board);
                System.out.println("The game is a draw");
                break;
            }

            player = (player == 'X') ? 'O' : 'X';
        }
    }

    public static void printBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " |");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    public static boolean isWinner(char[][] board, char player) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player)
                return true;
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player &&
                board[1][j] == player &&
                board[2][j] == player)
                return true;
        }

        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player)
            return true;

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player)
            return true;

        return false;
    }

    public static boolean isDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }
}
