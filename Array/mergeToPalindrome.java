public class mergeToPalindrome {
    public static void main(String[] args) {
        int nums[] = {1,3,11,1};
        System.out.println(merge(nums));

    }

    private static int merge(int[] nums) {
        int ans = 0;
        int start =0;
        int end = nums.length-1;

        while(start < end){
            if(nums[start] == nums[end]){
                start++;
                end--;
            }
            else if( nums[start] > nums[end]){
                end--;
                nums[end] += nums[end+1];
                ans++;
            }
            else{
                start++;
                nums[start] += nums[start+1];
                ans++;
            }
        }
        return ans;

    }
}
