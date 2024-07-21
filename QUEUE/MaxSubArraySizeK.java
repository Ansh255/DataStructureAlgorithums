import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSubArraySizeK {
    public static void findLargestSubArrayElement(int arr[], int n, int k) {
        int r[] = new int[n-k +1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < arr.length ; i++){
            // step 1 remove the element sliding out of window
            if(!q.isEmpty() && q.peek() == n - k ){
                System.out.println("poll remove out element");
                System.out.println("Poll "+q.poll());
                System.out.println();
            }

            // remove smaller elements form the right side
            while(!q.isEmpty() && arr[q.peekLast()] <= arr[i]){
                System.out.println("poll last func");
                System.out.println("Poll last"+q.pollLast());
                System.out.println();
            }


            q.offer(i);
            System.out.println(q);

            System.out.println();
            System.out.println("i"+i);
            System.out.println();
            System.out.println("k"+k);
            if(i >= k-1){
                
                System.out.println();
                System.out.println(r[ri++] = arr[q.peek()]);
                System.out.println();
            }
        }
        System.out.println(r);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4};
        int n = arr.length;
        int k = 3;
        findLargestSubArrayElement(arr, n, k);
    }
}