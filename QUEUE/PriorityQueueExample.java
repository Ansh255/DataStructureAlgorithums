import java.util.PriorityQueue;
public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(4);
        queue.add(3);
        queue.add(2);

        System.out.println(queue);
        
    }
}
