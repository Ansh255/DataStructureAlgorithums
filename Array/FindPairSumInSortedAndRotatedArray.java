// public class FindPairSumInSortedAndRotatedArray {
//     public static boolean isPairExist(int arr[], int key, int n) {

//         // step 1 find pivot around the rotated array
//         int pivot = 0;
//         for (pivot = 0; pivot < n - 1; pivot++) {
//             if (arr[pivot] > arr[pivot + 1]) {
//                 break;
//             }
//         }

//         // step 2 finding the low index and greatest index ;
//         int l = (pivot + 1) % n;
//         int r = pivot;

//         // loop and comparing stage

//         while (l != r) {
//             // if found
//             if (arr[l] + arr[r] == key) {
//                 return true;
//             }

//             // if sum is smaller then compared key than
//             if (arr[l] + arr[r] < key) {
//                 l = (l + 1) % n;
//             } else {
//                 r = (n + r - 1) % n;
//             }

//         }

//         return false;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 11, 15, 6, 8, 9, 10 };
//         int X = 16;
//         int N = arr.length;

//         if (isPairExist(arr, X, N))
//             System.out.print("true");
//         else
//             System.out.print("false");
            
//     }
// }



while(head2 != null) {
    ListNode temp = head1;
    while (temp != null) {
        if (temp == head2) {
            return head2;
        }temp = temp.next;
    }
    head2 = head2.next;
}
return null;
}