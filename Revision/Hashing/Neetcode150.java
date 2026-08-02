import java.util.*;

public class Neetcode150 {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int count = 1, max = 1;
        if (nums.length == 0) {
            return 0;
        }
        for(int current : set){
            if(!set.contains(current - 1)){
                while(set.contains(current + 1)){
                    current = current + 1;
                    count++;

                }
                max = Integer.max(max,count);
                count = 1;
            }
        }
        return max;
    }
}
