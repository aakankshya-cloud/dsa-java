public class TrappingRainWater {
    public int trap(int[] nums){
        int left = 0, right = nums.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;
        while(left < right){
            if(nums[left] < nums[right]){
                if(leftMax < nums[left]){
                    leftMax = nums[left];
                }
                else{
                    water += leftMax - nums[left];
                }
                left++;
            }
            else{
                if(rightMax < nums[right]){
                    rightMax = nums[right];
                }
                else{
                    water += rightMax - nums[right];
                }
                right--;
            }
        }
        return water;
    }
    }
}
