import java.util.Stack;

public class reverseStack {
    public static void reverseSt(Stack<Integer> stack) {
        if(stack.isEmpty()){
            return;
        }
        int top =   stack.pop();
        reverseSt(stack);
        pushAtBottom(stack, top);

    }
    private static void pushAtBottom(Stack<Integer> stack, int data) {
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, data);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        // printStack(stac k);
        reverseSt(stack);
        printStack(stack);

    }
    private static void printStack(Stack<Integer> stack) {
        while(!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
    }
}
