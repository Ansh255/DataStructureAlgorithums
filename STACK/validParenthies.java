import java.util.Stack;

public class validParenthies {
    public static boolean isValid(String str) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {

            // step1 if opening then push into stack
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '{' && str.charAt(i) == '}' ||
                        stack.peek() == '[' && str.charAt(i) == ']' ||
                        stack.peek() == '(' && str.charAt(i) == ')') {
                    stack.pop();
                } else {
                    return false;
                }

            }

        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String parentheris = "({{})";
        System.out.println(isValid(parentheris));
    }

}
