import java.util.Stack;

public class AddAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2); 
        stack.push(3);

        pushAtBottom(stack , 4);
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
}
