import java.util.LinkedList;
import java.util.Queue;

public class interleaveQueue{
    public static void interLeaveQueue(Queue<Integer> mainQueue){
        Queue<Integer> subQueue = new LinkedList<>();
        int length = mainQueue.size()/2;

        for(int i = 0; i < length; i++){
            subQueue.add(mainQueue.remove());
        }

        while(!subQueue.isEmpty()){
            mainQueue.add(subQueue.remove());
            mainQueue.add(mainQueue.remove());
        }
        System.out.println(mainQueue);
    }
    public static void main(String[] args) {
        Queue<Integer> mainQueue = new LinkedList<>();
        mainQueue.add(1);
        mainQueue.add(2);
        mainQueue.add(3);
        mainQueue.add(4);
        mainQueue.add(5);
        mainQueue.add(6);
        mainQueue.add(7);
        mainQueue.add(8);
        mainQueue.add(9);
        mainQueue.add(10);
        interLeaveQueue(mainQueue);

        while (!mainQueue.isEmpty()) {
            System.out.print(mainQueue.remove()+" ");
        }
        System.out.println();
            
        }
    }

