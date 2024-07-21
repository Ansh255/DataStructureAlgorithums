import java.util.Stack;

public class areaOfHistrogram {

    public static int[] getNextSmallerLeft(int[] arr){
        int nextSmaller[] = new int[arr.length];
        Stack<Integer> stack  = new Stack();
        for(int i = 0; i < arr.length; i++){
            //while
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }
            //if else
            if(stack.isEmpty()){
                nextSmaller[i] = -1;
            }
            else{
                nextSmaller[i] = arr[stack.peek()];
            }
            stack.push(i);

       
        }
        return nextSmaller;
    }

    public static int[] getNextSmallerRight(int[] arr){
         int nextSmaller[] = new int[arr.length];
          Stack<Integer> stack  = new Stack();
           for(int i = arr.length-1 ;i>=0; i--){
            //while
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }
            //if else
            if(stack.isEmpty()){
                nextSmaller[i] = -1;
            }
            else{
                nextSmaller[i] = arr[stack.peek()];
            }
            stack.push(i);
        }
        return nextSmaller;

    }

    public static void main(String[] args) {
        int arr[] ={6,8,0,1,3};

        int[] getNextSmallerleft = getNextSmallerLeft(arr);
        int[] getNextSmallerright = getNextSmallerRight(arr);

        for (int i = 0; i < getNextSmallerleft.length; i++) {
            System.out.print(getNextSmallerleft[i] + " ");
        }
        System.out.println();
         for (int i = 0; i < getNextSmallerright.length; i++) {
            System.out.print(getNextSmallerright[i] + " ");
        }

    }
}