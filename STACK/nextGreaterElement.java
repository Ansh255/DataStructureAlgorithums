import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int arr[] = { 6, 8, 0, 1, 3 };
        int nxtGreater[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            // 1st thing while loop
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            // now stack is isEmpty
            if (stack.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[stack.peek()];

            }
            
            stack.push(i);
        }
        for(int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " " );
        }

    }

}
