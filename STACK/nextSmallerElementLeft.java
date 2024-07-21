import java.util.Stack;

public class nextSmallerElementLeft {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> stack = new Stack<Integer>();
        int nextSmaller[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // step 1 pop the smaller elements from the stack 1st

            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }

            // step 2 checking and inserting
            if (stack.isEmpty()) {
                nextSmaller[i] = -1;
            } else {
                nextSmaller[i] = arr[stack.peek()];
            }

            stack.push(i);

        }

        for (int i = 0; i < nextSmaller.length; i++) {
            System.out.print(nextSmaller[i] + " ");
        }
    }
}