public class MaxInarray {

    public static void main(String[] args) {
        int array[] = {10,20,30,40,50};
        int idx =0;
        int x = maxinarray(array, idx);
        System.out.println(x);
    }

    private static int maxinarray(int[] array, int idx) {
        if(idx == array.length - 1){
            return array[idx];
        }
        int misa = maxinarray(array, idx+1);
        if(misa >array[idx]){
            return misa;
        }
        else{
            return array[idx];
        }

    }
}
