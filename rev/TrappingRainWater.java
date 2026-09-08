public class TrappingRainWater {
    public int trap(int[] nums){
        int left = 0, right = nums.length - 1;
        int leftMax = 0, rightMax = 0;
        int count = 0;
        while(left < right){
            if(nums[left] < nums[right]){
                if(leftMax < nums[left]){
                    leftMax = nums[left];
                }
                else{
                    count += leftMax - nums[left];
                }
                left++;
            }
            else{
                if(rightMax < nums[right]){
                    rightMax = nums[right];
                }
                else{
                    count += rightMax - nums[right];
                }
                right--;
            }
        }
        return count;
    }
}
