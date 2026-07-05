public class LongestSubarrayOf1sAfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int zeroCount = 0;
        int max = Integer.MIN_VALUE;
        for (int right = 0; right < nums.length; right++){
            if(nums[right] == 0){
                zeroCount++;
                while(zeroCount > 1){
                    if(nums[left] == 0){
                        zeroCount--;
                    }
                    left++;
                }
            }
            max = Integer.max(max, right - left);
        }
        return max;
    }
}
