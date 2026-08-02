import java.util.*;

public class Neetcode150 {
    public int longestConsecutive(int[] nums){
        Arrays.sort(nums);
        int count = 0;
        int max = -1;
        if(nums.length == 0){
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                continue;
            }
            // Consecutive
            if (nums[i + 1] == nums[i] + 1) {
                count++;
            } else {
                max = Math.max(max, count + 1);
                count = 0;
            }
        }
        // Check the last sequence
        max = Math.max(max, count + 1);
        return max;
    }
}
