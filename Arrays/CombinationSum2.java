import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public void backtrack(int[] nums, int start, int target, List<Integer> current, List<List<Integer>> list){
        if(target == 0){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i - 1]){
                continue;
            }
            if(nums[i] > target){
                break;
            }
            current.add(nums[i]);
            backtrack(nums, i + 1, target - nums[i], current, list);
            current.remove(current.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, target, current, res);
        return res;
    }
}
