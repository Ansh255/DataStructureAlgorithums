public class reverseArrayPrint {
    public static void printreverseArray(int[] array, int idx) {
        if(idx == 0){
            System.out.println(array[idx]);
            return;
        }
        System.out.print(array[idx]+" ");
        printreverseArray(array, idx-1);
    }

    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int idx = array.length-1;
        printreverseArray(array, idx);
    }
}
