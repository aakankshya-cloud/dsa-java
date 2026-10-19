import java.util.Arrays;

public class ThreesumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int closest = target;
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int sum = nums[left] + nums[right] + nums[i];
                min = Math.min(Math.abs(sum - target), min);
                if(min == Math.abs(sum - target)){
                    closest = sum;
                }
                if(sum < target){
                    left++;
                }
                else if(sum > target){
                    right--;
                }
                else{
                    return sum;
                }
            }
        }
        return closest;
    }
}
