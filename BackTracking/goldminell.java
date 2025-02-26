import java.util.ArrayList;
import java.util.Scanner;

public class goldminell {
    static int max = 0;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        getMaxGold(arr);
        System.out.println(max);
    }

    private static void getMaxGold(int[][] arr) {
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != 0 && visited[i][j] == false) {
                    ArrayList<Integer> bag = new ArrayList<>();
                    travelAndCollect(arr, i, j, bag, visited);
                    int sum = 0;
                    for (int val : bag) {
                        sum += val;
                    }
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
    }

    private static void travelAndCollect(int[][] arr, int i, int j, ArrayList<Integer> bag, boolean[][] visited) {
        visited[i][j] = true;
        bag.add(arr[i][j]);
        travelAndCollect(arr, i - 1, j, bag, visited);
        travelAndCollect(arr, i - 1, j + 1, bag, visited);
        travelAndCollect(arr, i, j - 1, bag, visited);
        travelAndCollect(arr, i + 1, j, bag, visited);

    }
}
