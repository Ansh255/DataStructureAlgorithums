public class displayElementsOfArray {
    public static void printArray(int[] array,int idx){{
        if(idx == array.length){
            return;
        }
        
        System.out.print(array[idx]);
        printArray(array, idx+1);
    }
        
    }
    public static void main(String[] args) {
        int array[]= {10,20,30,40,50};
        int idx =0 ;
        printArray(array, idx);
    }
}
