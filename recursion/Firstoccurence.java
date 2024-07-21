public class Firstoccurence {
    public static int firstOc(int array[] ,int key,int i){
        if(array[i] == array.length){
            return -1;
        }

       if(array[i] == key){
        return i;
       }else{
        int fissa= firstOc(array, key, i+1);
        return  fissa;
       }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,2,2,2,1};
        int key  =2 ;
        int i = 0;
        System.out.print(firstOc(arr, key, i));
    }
}
