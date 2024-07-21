import java.util.*;

public class SudokuSolver {
    public static void display(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void solveSudoku(int[][] board, int i, int j) {
        if (board.length == i) {
            display(board);
            return;
        }
        int ni = 0;
        int nj = 0;
        if (board[0].length - 1 == j) {
            ni = i;
            nj = j + 1;
        } else {
            ni = i + 1;
            nj = 0;
        }
        if (board[i][j] != 0) {
            solveSudoku(board, ni, nj);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (isValid(board, i, j, val)) {
                    board[i][j] = val;
                    solveSudoku(board, ni, nj);
                    board[i][j] = 0;
                }
            }
        }
    }

    private static boolean isValid(int[][] board, int x, int y, int val) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            if (board[x][i] == val) {
                return false;
            }
        }
        for (int j = 0; j < n; j++) {
            if (board[j][y] == val) {
                return false;
            }
        }
        int sx = x / 3 * 3;
        int sy = y / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[sx + i][sy + j] == val) {
                    return false;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int[][] arr = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        solveSudoku(arr, 0, 0);

    }
}
