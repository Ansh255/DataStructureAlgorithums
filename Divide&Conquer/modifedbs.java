public class modifedbs {
    public static int search(int arr[],int target ,int si , int ei ){
        int mid = si + (ei - si/2);

        if(arr[mid] == target){
            return mid;
        }

        // L1
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target <= arr[mid])
            {
                return search(arr, target, si, mid-1);
            }   
            else{
                return search(arr, target, mid+1, ei);
            }
        }
        // l2
        else{
             if(arr[mid]<=target && target <= arr[ei])
            {
                return search(arr, target, mid+1, ei);
            }   
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 0, 1, 2 };
        int target = 0;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
