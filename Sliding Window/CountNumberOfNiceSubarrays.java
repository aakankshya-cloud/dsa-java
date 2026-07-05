import java.util.HashMap;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k){
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        map.put(0,1);
        int curr = 0;
        for(int i = 0; i < nums.length; i++){
            curr = curr + nums[i];
            int needed = curr - k;
            if(map.containsKey(needed)){
                count += map.get(needed);
            }
            map.put(curr,map.getOrDefault(curr,0) + 1);
        }
        return count;

    }
}
