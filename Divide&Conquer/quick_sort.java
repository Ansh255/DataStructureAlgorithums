    public class quick_sort {
        public static void printArray(int array[]){
            for(int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
            System.out.println();
        }
        public static void quickSort(int array[], int start, int end){
            if(start>=end){
                return;
            }

            //last element pivot 
            int pivotIndex = partition(array, start, end);
            quickSort(array, start, pivotIndex-1);
            quickSort(array, pivotIndex+1, end);
        }
        private static int partition(int[] array, int start, int end) {
            int pivot = array[end];

            int i = start - 1;
            
            for(int j=start; j<end; j++){
                if(array[j]<= pivot){
                    i++;

                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                
            } 
            i++;
            int temp = pivot;
            array[end] = array[i];
            array[i] = temp;
            return i;
        }
        public static void main(String[] args) {
            int array[]={0,5,2,1,7,8};
            quickSort(array, 0, array.length-1);
            printArray(array);
        }
    }
