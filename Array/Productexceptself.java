public class Productexceptself {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        int z[] = productExceptSelf(nums);
        
        System.out.println(z);
    }

    private static int[] productExceptSelf(int[] nums) {
        // creating a new array to hold the updated value
        int arr[] = new int[nums.length];

        // doing the project
        
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[j]) {
                    continue;
                } else {
                    count = count * nums[j];
                }
            }
            arr[i] = count;

        }

        return arr;
    }
}
