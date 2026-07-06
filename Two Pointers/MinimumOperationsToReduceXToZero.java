public class MinimumOperationsToReduceXToZero {
    public static int minOperations(int[] nums, int x){
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while(left < right){
            if((x - nums[left] <= x - nums[right]) && x > nums[left]){
                x = x - nums[left];
                count++;
                left++;
            }
            else {
                x = x - nums[right];
                count++;
                right --;
            }
            if(x == 0){
                return count;
            }
        }
        if(x != 0){
            return -1;
        }
        return count;

    }
    public static void main(String[] args) {
        int[] nums = {3,2,20,1,1,3};
        int x = 10;
        System.out.println(minOperations(nums,x));
    }
}
