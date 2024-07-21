public class allIndex {
    public static int all_index(int array[], int idx , int key){
        if(array.length == idx){
            return -1;
        }
        int aidx = all_index(array, idx+1, key);
        if(array[idx] == key){
            
            System.out.println(idx+" ");
            return idx;
        }
        else{
       return aidx;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,2,2,2,1};
        int key  =2;
        int i = 0;
       all_index(arr, i, key);
    }
}
