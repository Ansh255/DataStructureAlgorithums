import java.util.Scanner;

public class nqueenBB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] board = new boolean[n][n];

        boolean[] cols = new boolean[n];

        boolean[] ndiag = new boolean[2 * n - 1];

        boolean[] rdiag = new boolean[2 * n - 1];

        solveNQueen(board, 0, cols, ndiag, rdiag, "");

    }

    private static void solveNQueen(boolean[][] board, int row, boolean[] cols, boolean[] ndiag, boolean[] rdiag,
            String asf) {
        if (row == board.length) {
            System.out.println(asf + " .");
            return;
        }

        for (int col = 0; col < board[0].length; col++) {
            if (cols[col] == false && ndiag[row + col] == false && rdiag[row - col + board.length] == false) {
                // place the value;
                board[row][col] = true;
                cols[col] = true;
                ndiag[row + col] = true;
                rdiag[row - col + board.length] = true;
                solveNQueen(board, row + 1, cols, ndiag, rdiag, asf + row + " - " + col + " , ");
                board[row][col] = false;
                cols[col] = false;
                ndiag[row + col] = false;
                rdiag[row - col + board.length] = false;
            }

        }

    }
}
