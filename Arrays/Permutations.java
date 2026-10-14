import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> list = new ArrayList<>();
    public void backtrack(int[] nums, List<Integer> current, boolean[] visited){
        if(current.size() == nums.length){
            list.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;
            current.add(nums[i]);
            visited[i] = true;
            backtrack(nums, current, visited);
            current.remove(current.size() - 1);
            visited[i] = false;
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> current = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        backtrack(nums, current, vis);
        return list;
    }
}
