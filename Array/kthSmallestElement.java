import java.lang.reflect.Array;
import java.util.Arrays;

class solution{
    public static int smallestK(int[] nums,int k){
        int n = nums.length;
        Arrays.sort(nums);
        return nums[k];
    }
    public static void main(String[] args) {
        int nums[] ={7,5,2,6,8,9};
        int k = 3;
        System.out.println(smallestK(nums, k));
    }
}