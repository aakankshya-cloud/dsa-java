import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int max = 0;
        for(int num : nums){
            if(!set.contains(num - 1)){
                int curr = num;
                int length = 1;
                while(set.contains(curr + 1)){
                    curr++;
                    length++;
                }
                max = Integer.max(max,length);
            }
        }
        return max;
    }
}
