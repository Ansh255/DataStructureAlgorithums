import java.util.Stack;

public class nextGreaterElementFromLeft {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int arr[] = {6,8,0, 1, 3 };
        int nxtGreaterLeft[] = new int[arr.length];


        for(int i =0; i<nxtGreaterLeft.length; i++)
        {
            //step1 pop 
            while(!stack.isEmpty() && arr[stack.peek()] <= arr[i]){
                stack.pop();
            }

            //step2 check the stack if it is empty or not 

            if(stack.isEmpty() ){
                nxtGreaterLeft[i]  = -1;
            }
            else{
                nxtGreaterLeft[i] = arr[stack.peek()];
            }

            stack.push(i);
        }
        for(int i =0; i<nxtGreaterLeft.length ; i++){
            System.out.print(nxtGreaterLeft[i] + " ");

        }
    }
    
}
