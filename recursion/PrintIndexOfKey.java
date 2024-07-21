public class PrintIndexOfKey {
    public static void SearchIndex(int array[] , int key,int iterator){
        // base case
        
        if(iterator == array.length){
            return;
        }
        
        if(array[iterator]==key){
            System.out.print(iterator+" ");
        }

        SearchIndex(array, key, iterator+1);
    }
    public static void main(String[] args) {
        int array[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        SearchIndex(array,key,0);
    }
}
