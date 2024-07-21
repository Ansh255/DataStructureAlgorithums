public class change_array{
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void changeArray(int arr[], int i, int value) {
        //base case
        if(i == arr.length){
            printArray(arr);
            return;
        }

        //recursion
        arr[i] = value;
        changeArray(arr, i+1, value+1);
        //BACKTRACK case
        arr[i]= arr[i]-2;
    }
    public static void main(String[] args) {
        int[] array = new int[5];
        changeArray(array, 0, 1);
        printArray(array);

    }
}