import java.util.PriorityQueue;

public class ConnectNRopeMinCost {
    public static int generateMinCost(int arr[] ,int n){
        // step1 add to priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int result = 0;
        // STEP2 POLLING AND ADDING TILL ARR HAS ONLY ONE VALUE
        while(pq.size() > 1){
            int first_low = pq.poll();
            int second_low = pq.poll();
            result += first_low + second_low;
            pq.add(first_low + second_low);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 6};
        int n = arr.length;
       int value= generateMinCost(arr, n);
       System.out.println(value);
    }
}
