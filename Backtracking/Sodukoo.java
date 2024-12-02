package Backtracking;

public class Sodukoo {
    public static boolean isSafe(int suduko[][], int row, int col, int digit) {
        // checking for the column
        for (int i = 0; i < 9; i++) {
            if (suduko[i][col] == digit) {
                return false;
            }
        }
        // checking for the row
        for (int i = 0; i < 9; i++) {
            if (suduko[row][i] == digit) {
                return false;
            }
        }
        // checking for the 3*3 grid
        int sr = (row / 3) * 3; // starting row of the grid
        int sc = (col / 3) * 3; // starting column of the grid
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (suduko[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean Sodoko(int suduko[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (suduko[row][col] != 0) {
            return Sodoko(suduko, nextRow, nextCol); // Return the result here
        }

        // Fill digits from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(suduko, row, col, digit)) {
                suduko[row][col] = digit;
                if (Sodoko(suduko, nextRow, nextCol)) {
                    return true;
                }
                suduko[row][col] = 0; // Backtrack
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int suduko[][] = {
            {9, 5, 7, 0, 1, 3, 0, 8, 4},
            {4, 8, 3, 0, 5, 7, 1, 0, 6},
            {0, 1, 2, 0, 4, 9, 5, 3, 7},
            {1, 7, 0, 3, 0, 4, 9, 0, 2},
            {5, 0, 4, 9, 7, 0, 3, 6, 0},
            {3, 0, 9, 5, 0, 8, 7, 0, 1},
            {8, 4, 5, 7, 9, 0, 6, 1, 3},
            {0, 9, 1, 0, 3, 6, 0, 7, 5},
            {7, 0, 6, 1, 8, 5, 4, 0, 9}
        };
        if (Sodoko(suduko, 0, 0)) {
            System.out.println("The solution exists");
        } else {
            System.out.println("Solution doesn't exist");
        }
    }
}
