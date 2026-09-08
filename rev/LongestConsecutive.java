import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int longest = 0;
        int j = 0;
        while(j < nums.length){
            if(!set.contains(nums[j] - 1)){
                int current = nums[j];
                int count = 1;
                while(set.contains(current + 1)){
                    count++;
                    current++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
