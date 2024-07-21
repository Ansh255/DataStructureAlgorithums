class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int[] repeatedNumber(int[] A) {
     int[] arr = new int[A.length];

    int[] arr2 = new int[2];
     for(int i =0 ; i < A.length ; i++){
        arr[i] = arr[i]+1;
     }
    int repeat = 0;
     for(int i =0 ; i < arr.length ; i++){
        if(arr[i] == 2){
            repeat = A[i];
        }
     }
     int missing = 0;
     for(int j=0; j<arr.length; j++) {
        if(arr[j] ==0 ){
            missing = A[j];
        }
     }
     arr2[0]= repeat;
     arr2[1]= missing;
     System.out.println(arr2[0]);
     System.out.println(arr2[1]);
     return arr2;
    }
    public static void main(String[] args) {
        int A[] = {3, 1, 2 ,5, 3};
       int[] x =  repeatedNumber(A);
    //    System.out.println(x);
    for(int i=0  ;i < x.length ; i++){
        System.out.print(x);

    }


    }
}
