import java.lang.reflect.Array;
import java.util.Arrays;

public class chocolateProblem {
    public static void main(String[] args) {
        int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30,
                40, 28, 42, 30, 44, 48, 43, 50 };

        int m = 7; // Number of students

        int n = arr.length;
        
        System.out.println("Minimum difference is "
                + findMinDiff(arr, n, m));
    }

    private static int findMinDiff(int[] arr, int n, int m) {
        int minDiff = Integer.MAX_VALUE;

        // case1 if there are no chocolates 
        if(n ==0 || m == 0){
            return 0;
        }

        Arrays.sort(arr);

        if(n < m){
            return -1;  
        }

        for(int i = 0; i+m-1 < n  ; i++) {
            int diff = arr[i+m-1] - arr[i];
            if(diff < minDiff){
                minDiff = diff;
            }
        }


        return minDiff;
    }

}
