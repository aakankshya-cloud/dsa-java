import java.util.HashMap;

public class LargestAlmostMissingInteger {
    public int largestInteger(int[] nums, int k){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < i + k; j++) {
                map.put(nums[i],map.getOrDefault(nums[i],0)+ 1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
