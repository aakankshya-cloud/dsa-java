

class MinimumSizeSubarrya{
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int curr = 0;
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {

            curr += nums[right];

            while (curr >= target) {

                min = Math.min(min, right - left + 1);

                curr -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}