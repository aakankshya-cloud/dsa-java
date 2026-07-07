import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int value : map.values()){
            if(value != 1) return false;
        }
        return true;
//--------------------------------------------------------------------------------------------------
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return false;
            }
            map.put(nums[i],i);
        }
        return true;
    }
}
