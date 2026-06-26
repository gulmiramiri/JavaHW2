/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg8.pkg20;

import java.util.Scanner;

public class Main {

    static final int ROWS = 6;
    static final int COLS = 7;

    public static void main(String[] args) {

        char[][] board = new char[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                board[i][j] = ' ';
            }
        }

        char player = 'R'; // R = Red, Y = Yellow

        Scanner input = new Scanner(System.in);

        while (true) {

            printBoard(board);

            System.out.print("Player " + player + " enter column (0-6): ");
            int col = input.nextInt();

            if (col < 0 || col >= COLS) {
                System.out.println("Invalid column.");
                continue;
            }

            int row = drop(board, col, player);

            if (row == -1) {
                System.out.println("Column is full.");
                continue;
            }

            if (checkWin(board, row, col, player)) {
                printBoard(board);
                System.out.println("Player " + player + " wins!");
                break;
            }

            if (isFull(board)) {
                printBoard(board);
                System.out.println("Draw!");
                break;
            }

            player = (player == 'R') ? 'Y' : 'R';
        }
    }

    static int drop(char[][] board, int col, char player) {
        for (int i = ROWS - 1; i >= 0; i--) {
            if (board[i][col] == ' ') {
                board[i][col] = player;
                return i;
            }
        }
        return -1;
    }

    static boolean isFull(char[][] board) {
        for (int j = 0; j < COLS; j++) {
            if (board[0][j] == ' ') return false;
        }
        return true;
    }

    static boolean checkWin(char[][] b, int r, int c, char p) {
        return checkDir(b, r, c, p, 1, 0)   // vertical
            || checkDir(b, r, c, p, 0, 1)   // horizontal
            || checkDir(b, r, c, p, 1, 1)   // diagonal \
            || checkDir(b, r, c, p, 1, -1); // diagonal /
    }

    static boolean checkDir(char[][] b, int r, int c, char p, int dr, int dc) {
        int count = 1;

        count += countLine(b, r, c, p, dr, dc);
        count += countLine(b, r, c, p, -dr, -dc);

        return count >= 4;
    }

    static int countLine(char[][] b, int r, int c, char p, int dr, int dc) {
        int count = 0;
        int i = r + dr;
        int j = c + dc;

        while (i >= 0 && i < ROWS && j >= 0 && j < COLS && b[i][j] == p) {
            count++;
            i += dr;
            j += dc;
        }

        return count;
    }

    static void printBoard(char[][] board) {

        System.out.println();

        for (int i = 0; i < ROWS; i++) {
            System.out.print("|");
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println("---------------");
    }
}