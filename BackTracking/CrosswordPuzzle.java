import java.io.*;
import java.util.*;

public class CrosswordPuzzle {
    public static void solution(char[][] arr, String[] words, int vidx) {
        // write your code here
        String word = words[vidx];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                // either there should be a - of charAt(0)
                if (arr[i][j] == 'j' || arr[i][j] == word.charAt(0)) {
                    if (canPlaceHorizontally(arr, word, i, j)) {
                        boolean[] wePlace = placeWordHorizontally(arr, word, i, j);
                        solution(arr, words, vidx + 1);
                        unPlaceHorizontally(arr, wePlace, i, j);

                    }

                    if (arr[i][j] == 'j' || arr[i][j] == word.charAt(0)) {
                        if (canPlaceVertically(arr, word, i, j)) {
                            boolean[] wePlace = placeWordVertically(arr, word, i, j);
                            solution(arr, words, vidx + 1);
                            unPlaceVertically(arr, wePlace, i, j);

                        }
                    }
                }

            }
        }
    }

    private static void unPlaceVertically(char[][] arr, boolean[] wePlace, int i, int j) {
        for (int ii = 0; ii < wePlace.length; ii++) {
            if (wePlace[ii] == true) {
                arr[i + ii][j] = '-';
            }

        }
    }

    private static boolean[] placeWordVertically(char[][] arr, String word, int i, int j) {
        boolean[] wePlace = new boolean[word.length()];
        for (int ii = 0; ii < word.length(); ii++) {
            if (arr[i + ii][j] == '-') {
                arr[i + ii][j] = word.charAt(ii);
                wePlace[ii] = true;
            }
        }
        return wePlace;
    }

    private static boolean canPlaceVertically(char[][] arr, String word, int i, int j) {
        if (i - 1 >= 0 && arr[i - 1][j] != '+') {
            return false;
        }
        // aapki right side hai and vo non plus hai to bhi false;
        else if (i + word.length() <= arr.length && arr[i + word.length()][j] != '+') {
            return false;
        }
        // if everything is ok then we use loops
        for (int ii = 0; ii < word.length(); ii++) {
            if (i + ii <= arr.length) {
                return false;
            }
            if (arr[i + ii][j] == '-' || arr[i + ii][j] == word.charAt(ii)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    private static void unPlaceHorizontally(char[][] arr, boolean[] wePlace, int i, int j) {
        for (int jj = 0; jj < wePlace.length; jj++) {
            if (wePlace[jj] == true) {
                arr[i][j + jj] = '-';
            }

        }
    }

    private static boolean[] placeWordHorizontally(char[][] arr, String word, int i, int j) {
        boolean[] wePlace = new boolean[word.length()];
        for (int jj = 0; jj < word.length(); jj++) {
            if (arr[i][j + jj] == '-') {
                arr[i][j + jj] = word.charAt(jj);
                wePlace[jj] = true;
            }
        }
        return wePlace;
    }

    private static boolean canPlaceHorizontally(char[][] arr, String word, int i, int j) {
        // app ki left side hai or vo non + hai to false
        if (j - 1 >= 0 && arr[i][j - 1] != '+') {
            return false;
        }
        // aapki right side hai and vo non plus hai to bhi false;
        else if (j + word.length() <= arr[0].length && arr[i][j + word.length()] != '+') {
            return false;
        }
        // if everything is ok then we use loops
        for (int jj = 0; jj < word.length(); jj++) {
            if (j + jj <= arr[0].length) {
                return false;
            }
            if (arr[i][j + jj] == '-' || arr[i][j + jj] == word.charAt(jj)) {
                continue;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void print(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[][] arr = new char[10][10];
        for (int i = 0; i < arr.length; i++) {
            String str = scn.next();
            arr[i] = str.toCharArray();
        }
        int n = scn.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = scn.next();
        }
        solution(arr, words, 0);
    }
}