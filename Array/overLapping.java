import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class overLapping {
    public static void main(String[] args) {
          int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = mergeOverlappingIntervals(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        int n = arr.length;

        //this code makes the subarray comparison and sort them by first element 
        // by overriding the compare method
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        // made a empty list of list to return the answer
        List<List<Integer>> ans = new ArrayList<>();

        // now next step is selecting invervals
        for(int i = 0; i < n; i++) {
            // 0 stands for the first element and 1 for the second
            int start = arr[i][0];
            int end = arr[i][1];

            //checking skipped intervals
            if(!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)){
                continue; 
            }

            //for rest of the intervals checking last element
            for(int j = i+1; j< n; j++) {
                if(arr[j][0] <= end){
                    end = Math.max(end, arr[j][1]);
                }
                else{
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        return ans;
    }
}
