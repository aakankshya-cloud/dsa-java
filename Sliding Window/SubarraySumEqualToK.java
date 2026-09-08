import java.util.HashMap;

public class SubarraySumEqualToK {

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has occurred once before the array starts.
        map.put(0, 1);

        int currSum = 0;
        int count = 0;

        for (int num : nums) {

            // Current prefix sum
            currSum += num;

            // We need an earlier prefix sum = currSum - k
            int needed = currSum - k;

            // If we've seen it before, every occurrence forms a valid subarray
            if (map.containsKey(needed)) {
                count += map.get(needed);
            }

            // Store the current prefix sum for future indices
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(subarraySum(nums, k)); // 2
    }
}