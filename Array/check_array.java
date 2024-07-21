public class check_array {
    public static boolean containsDuplicate(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[j]==nums[i]){
                    return true;
                }
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int num[] ={1,2,3,4,5};
        System.out.println(containsDuplicate(num));
    }
}
