import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Subsetsii {
    HashSet<List<Integer>> set = new HashSet<>();
    public void backtrack(int[] nums, int index, List<Integer> current){
        if(index == nums.length){
            set.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        backtrack(nums, index + 1, current);
        current.remove(current.size() - 1);
        backtrack(nums, index + 1, current);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        backtrack(nums, 0, current);
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}
