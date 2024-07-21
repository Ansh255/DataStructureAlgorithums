import java.util.Stack;

class solution{
    public static String getReverseString(String str){
        Stack<Character> stack = new Stack<>();
        int idx = 0;

        while(idx < str.length()){
            stack.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");

        while(!stack.isEmpty()){
              char c =  stack.pop();
              result.append(c);

        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
       String result = getReverseString(str);
        System.out.println(result);
    }
}