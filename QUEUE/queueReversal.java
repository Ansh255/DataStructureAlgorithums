import java.util.LinkedList;
import java.util.*;

public class queueReversal {

    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack();

        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
   
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        reverseQueue(queue);
    
    while(!queue.isEmpty()){
        System.out.print(queue.remove() +" ");
    }
}
}
