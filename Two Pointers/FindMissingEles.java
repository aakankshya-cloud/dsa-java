import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindMissingEles {
    public List<Integer> findMissingElements(int[] nums){
        ArrayList<Integer> arr = new ArrayList<>();
        int max = -1, min = 999;
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        for(int i = min ; i <= max ; i++){
            if(!set.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}
