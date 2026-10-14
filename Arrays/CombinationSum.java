import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> list = new ArrayList<>();
    int[] nums;
    private void backtrack(int index, List<Integer> current, int target){
        if(target == 0){
            list.add(new ArrayList<>(current));
            return;
        }
        if (target < 0 || index == nums.length) {
            return;
        }
        current.add(nums[index]);
        backtrack(index, current, target - nums[index]);
        current.remove(current.size() - 1);
        backtrack(index + 1, current, target);

    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums = nums;
        List<Integer> current = new ArrayList<>();
        backtrack(0, current, target);
        return list;
    }
}
