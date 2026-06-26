public class EightQueens {

    static final int SIZE = 8;
    static int[] queens = new int[SIZE];

    public static void main(String[] args) {
        if (placeQueen(0)) {
            printBoard();
        }
    }

    public static boolean placeQueen(int row) {
        if (row == SIZE) {
            return true;
        }

        for (int col = 0; col < SIZE; col++) {
            queens[row] = col;

            if (isSafe(row)) {
                if (placeQueen(row + 1)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isSafe(int row) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == queens[row] ||
                    Math.abs(queens[row] - queens[i]) == Math.abs(row - i)) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (queens[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print("| ");
                }
            }
            System.out.println();
        }
    }
}