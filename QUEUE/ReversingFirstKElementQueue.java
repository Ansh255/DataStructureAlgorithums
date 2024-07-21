import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingFirstKElementQueue{
    public static void reverseElement(Queue<Integer> queue , int k ){
        Stack<Integer> stack = new Stack<Integer>();

        for(int i =0 ; i< k ; i++){
            stack.push(queue.remove());
        }

        for(int i =0 ; i< k ; i++){
            queue.add(stack.pop());
        }
        System.out.println(queue);

        for(int i =0 ; i<queue.size() - k ; i++){
            queue.add(queue.remove());
        }
        
        System.out.println(queue);

       

    }
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        int k = 5;
        reverseElement(queue, k);
        
    }
}