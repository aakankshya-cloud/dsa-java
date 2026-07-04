public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k){
        int left = 0;
        int freq = 0;
        int max = 0;
        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) {
                freq++;
            }
            while(freq > k){
                if(nums[left] == 0){
                    freq--;
                }
                left++;
            }
            max = Integer.max(max,right - left + 1);
        }
        return max;
    }
}
